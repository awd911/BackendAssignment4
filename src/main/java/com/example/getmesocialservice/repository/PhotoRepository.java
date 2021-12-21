package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Photo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhotoRepository {

    List<Photo> photoList = new ArrayList();

    public Photo getPhoto(){
        Photo photo = new Photo(0,0,"PhotoExampleURL","Photo Creator","2021");
        return photo;
    }

    public Photo savePhoto(Photo photo) {
        photo.setId(photoList.size() +1);
        photoList.add(photo);
        return photo;
    }

    public List<Photo> getAllPhotos() {return photoList;}

    public Photo getPhotoById(int id) {
        for(Photo photo:photoList){
            if(photo.getId() == id){
                return photo;
            }
        }
        return null;
    }

    public Photo deletePhoto(int id) {
        Photo deletedPhoto = null;

        for(Photo p:photoList){
            if(p.getId() == id) {
                deletedPhoto = p;
                photoList.remove(p);
                return deletedPhoto;
            }
        }
        return deletedPhoto;
    }
}
