package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidCreatedBy;
import org.hibernate.validator.constraints.Length;

public class Comment {

    private int id;
    private int photoId;
    @Length(min=5)
    private String message;
    @ValidCreatedBy
    private String createdBy;
    private String dateCreated;

    public Comment(int id, int photoId, String message, String createdBy, String dateCreated) {
        this.id = id;
        this.photoId = photoId;
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

}
