package com.revature.model;

public class Painting {
    private int artist_id;
    private String name;
    private String url;
    private String genre;
    private int year;

    public Painting(int artist_id, String name, String url, String genre, int year) {
        this.artist_id = artist_id;
        this.name = name;
        this.url = url;
        this.genre = genre;
        this.year = year;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
