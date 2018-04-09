package nl.groep10a.service;

import nl.groep10a.model.Artikel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nl.groep10a.persistence.IArtikelDao;

import java.util.List;

@Service
public class ArtikelService implements IArtikelService {

    @Autowired
    private IArtikelDao artikelDao;

    @Override
    public List<Artikel> getAllArtikels() {
        return artikelDao.getAllArtikels();
    }

    @Override
    public Artikel getArtikelById(int artikelId) {
        return artikelDao.getArtikelById(artikelId);
    }

    @Override
    public synchronized boolean addArtikel(Artikel artikel) {
        if(artikelDao.artikelExists(artikel.getArtikelNaam())){
            return false;
        }
        else {
            artikelDao.addArtikel(artikel);
            return true;
        }
    }
}
