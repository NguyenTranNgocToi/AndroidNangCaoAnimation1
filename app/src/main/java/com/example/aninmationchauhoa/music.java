package com.example.aninmationchauhoa;

import java.io.Serializable;

public class music implements Serializable {
    private int img;
    private String song, artist;

    public music(int img, String song, String artist) {
        this.img = img;
        this.song = song;
        this.artist = artist;
    }

    public music() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
