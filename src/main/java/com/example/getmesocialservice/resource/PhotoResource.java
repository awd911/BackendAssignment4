package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @GetMapping("/photo")
    public Photo getPhoto(){
        return photoService.getPhoto();
    }

    @GetMapping("/photos")
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping("/photo/{id}")
    public Photo getPhotoById(@PathVariable("id") int id){
        return photoService.getPhotoById(id);
    }

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody @Valid Photo photo){
        return photoService.savePhoto(photo);
    }

    @DeleteMapping("/photo")
    public Photo deletePhoto(@RequestParam(name ="id") int id){
            return photoService.deletePhoto(id);
        }
    }

