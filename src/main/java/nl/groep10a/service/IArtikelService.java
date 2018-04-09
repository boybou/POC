package nl.groep10a.service;

import nl.groep10a.model.Artikel;

import java.util.List;

public interface IArtikelService {

    List<Artikel> getAllArtikels();
    Artikel getArtikelById(int artikelId);
    boolean addArtikel(Artikel artikel);
}
