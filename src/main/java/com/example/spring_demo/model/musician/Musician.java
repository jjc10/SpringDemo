package com.example.spring_demo.model.musician;

import com.example.librarysdk.Album;
import com.example.spring_demo.model.instrument.Instrument;

import java.util.ArrayList;
import java.util.List;

public class Musician {

    private String name;
    private String genre;
    private int DOB; // date of birth
    private List<Instrument> instruments;
    private List<Album> albums;

    public Musician(String name, String genre, int DOB) {
        this.name = name;
        this.genre = genre;
        this.DOB = DOB;
        this.instruments = new ArrayList<>();
        this.albums = new ArrayList<>();
    }

    public Musician(String name, String genre, int DOB, List<Instrument> instruments) {
        this.name = name;
        this.genre = genre;
        this.DOB = DOB;
        this.instruments = instruments;
    }

    public void instrumentsPlayed() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s plays the following: ", this.name));
        this.instruments.forEach(instrument -> {
            sb.append(String.format("%s %s, ", instrument.getBrand(), instrument.getModel()));
        });
        sb.delete(sb.length() - 2, sb.length());
        sb.append('.');
        System.out.println(sb.toString());
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
