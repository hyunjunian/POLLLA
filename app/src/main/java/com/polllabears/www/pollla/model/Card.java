package com.polllabears.www.pollla.model;

/**
 * Created by hyunjunjeon on 9/11/16.
 */
public class Card {

    private String id;
    private String text;
    private String name;
    private String photoUrl;

    public Card() {
    }

    //a temporary constructor by Hyerin
    public Card(String name, String text){
        this.text = text;
        this.name = name;
    }

    public Card(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
