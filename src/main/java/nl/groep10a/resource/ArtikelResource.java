package nl.groep10a.resource;

import nl.groep10a.model.Artikel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import nl.groep10a.service.IArtikelService;

import java.util.List;

@Controller
@RequestMapping("user")
public class ArtikelResource {
    @Autowired
    private IArtikelService artikelService;

    @GetMapping("artikel/{id}")
    public ResponseEntity<Artikel> getArtikelById(@PathVariable("id") Integer id){
        Artikel atrikel = artikelService.getArtikelById(id);
        return new ResponseEntity<Artikel>(atrikel, HttpStatus.OK);
    }

    @GetMapping("artikels")
    public ResponseEntity<List<Artikel>> getAllArticles() {
        List<Artikel> list = artikelService.getAllArtikels();
        return new ResponseEntity<List<Artikel>>(list, HttpStatus.OK);
    }

    @PostMapping("artikel")
    public ResponseEntity<Void> addArtikel(@RequestBody Artikel artikel, UriComponentsBuilder builder){
        boolean flag = artikelService.addArtikel(artikel);

        if (!flag){
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(artikel.getArtikelId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

}
