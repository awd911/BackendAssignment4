package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;


    public Photo savePhoto(Photo photo) {
        return photoRepository.savePhoto(photo);
    }

    public Photo getPhoto() {
        return photoRepository.getPhoto();
    }

    public List<Photo> getAllPhotos(){return photoRepository.getAllPhotos();}

    public Photo getPhotoById(int id) {
        return photoRepository.getPhotoById(id);
    }

    public Photo deletePhoto(int id) {
        return photoRepository.deletePhoto(id);
    }
}
