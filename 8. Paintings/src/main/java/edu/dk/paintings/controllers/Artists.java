package edu.dk.paintings.controllers;

import edu.dk.paintings.models.Artist;
import edu.dk.paintings.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Artists {

    @Autowired
    ArtistRepository artists;

    @GetMapping("/artists/{id}")
    public Artist getArtistById(@PathVariable Long id) {
        return artists.findById(id).get();
    }



    @GetMapping("/artists")
    public Iterable<Artist> getArtist() {
        return artists.findAll();
    }



    @PostMapping("/artists")
    public Artist addArtist(@RequestBody Artist newArtist){
        //tillader ikke klienten at overwrite id
        newArtist.setId(null);
        return artists.save(newArtist);
        }

//Updates an artist by id
    @PutMapping("/artists/{id}")
    public String updateArtistById(@PathVariable long id,@RequestBody Artist artist){
       // artist.setId(id);

        //hvis du finder artist i databasen så returner den.
        // Find id
        // gå igennem map, og sætter ind i map
         return artists.findById(id).map(foundArtist -> {
             foundArtist.setName(artist.getName());
            System.out.println(foundArtist);
            return "Aritst Updated";
        }). orElse("Not Found");

        }


//Delete an artist by id.
    @DeleteMapping("/artists/{id}")
    public void deleteArtistById(@PathVariable Long id){
        artists.deleteById(id);
        }

}
