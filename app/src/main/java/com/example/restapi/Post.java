package com.example.restapi;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int uderId;
    private int id;
    private String title;

    @SerializedName("body")
    private String text;

    public int getUderId() {
        return uderId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
