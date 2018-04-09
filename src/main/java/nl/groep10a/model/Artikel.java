package nl.groep10a.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="artikel")
public class Artikel implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="artikel_id")
    private int artikelId;

    @Column(name="artikel_kast")
    private int artikelKast;

    @Column(name="artikel_lade")
    private int artikelLade;

    @Column(name = "artikel_naam")
    private String artikelNaam;

    public int getArtikelId() {
        return artikelId;
    }

    public void setArtikelId(int artikelId) {
        this.artikelId = artikelId;
    }

    public int getArtikelKast() {
        return artikelKast;
    }

    public void setArtikelKast(int artikelKast) {
        this.artikelKast = artikelKast;
    }

    public int getArtikelLade() {
        return artikelLade;
    }

    public void setArtikelLade(int artikelLade) {
        this.artikelLade = artikelLade;
    }

    public String getArtikelNaam() {
        return artikelNaam;
    }

    public void setArtikelNaam(String artikelNaam) {
        this.artikelNaam = artikelNaam;
    }
}
