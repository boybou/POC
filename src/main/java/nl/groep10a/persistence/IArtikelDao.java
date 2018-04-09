package nl.groep10a.persistence;



import nl.groep10a.model.Artikel;

import java.util.List;

public interface IArtikelDao {
    List<Artikel> getAllArtikels();
    Artikel getArtikelById(int artikelId);
    void addArtikel(Artikel artikel);
    boolean artikelExists(String artikelNaam);
}
