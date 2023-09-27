package com.sda.dpagp.day2.responsibility;

import com.sda.dpagp.day2.singleton.Counter;

public class Cd {

    private String artist;
    private String title;

    public Cd(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
