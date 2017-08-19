package com.example.user.a3_listadapterexam.model;

/**
 * Created by user on 2017-08-19.
 */

public class Job {
    private String title;
    private String description;
    private  int image;

    public Job(String title, String description, int image){
        this.title=title;
        this.description= description;
        this.image= image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
