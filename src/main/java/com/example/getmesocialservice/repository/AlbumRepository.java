package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public Album getAlbum(){
        Album album = new Album( 0,"Disco Tex", "Tex Cauffield", "AlbumExampleURL","1976");
        return album;
    }

    public Album saveAlbum(Album album) {
        album.setid(albumList.size()+1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int id) {
        for(Album album: albumList){
            if(album.getid() == id){
                return album;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;

        for(Album u:albumList){
            if(u.getid() == albumId){
                deletedAlbum = u;
                albumList.remove(u);
                return deletedAlbum;
            }

        }
        return deletedAlbum;
    }
}
