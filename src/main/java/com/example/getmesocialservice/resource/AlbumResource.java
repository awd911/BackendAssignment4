package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.getmesocialservice.service.AlbumService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private  AlbumService albumService;

    @GetMapping("/album")
    public Album getAlbum(){
        return albumService.getAlbum();
    }

    @GetMapping("/albums")
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{id}")
    public Album getAlbumById(@PathVariable("id") int id){
        return albumService.getAlbumById(id);
    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody @Valid Album album){

        return albumService.saveAlbum(album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name="id") int id){
        return albumService.deleteAlbum(id);
    }
}
