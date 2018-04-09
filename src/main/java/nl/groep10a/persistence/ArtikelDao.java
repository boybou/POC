package nl.groep10a.persistence;


import nl.groep10a.model.Artikel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class ArtikelDao implements IArtikelDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Artikel> getAllArtikels() {
        String hql = "FROM Artikel as atcl ORDER BY atcl.artikelId";
        return (List<Artikel>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Artikel getArtikelById(int artikelId) {
        return entityManager.find(Artikel.class, artikelId);
    }

    @Override
    public void addArtikel(Artikel artikel) {
        entityManager.persist(artikel);
    }

    @Override
    public boolean artikelExists(String artikelNaam) {
        String hql = "FROM Artikel as atcl WHERE atcl.artikelNaam = ?";
        int count = entityManager.createQuery(hql).setParameter(0, artikelNaam).getResultList().size();
        return count > 0;
    }
}
