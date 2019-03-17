package com.ahmedazooz.foodapp;

public class Album {
    private String name;
    private int No_Songs;
    private int Th_Nail;
    public Album() {
    }

    public Album(String name, int numOfSongs, int thumbnail) {
        this.name = name;
        this.No_Songs = numOfSongs;
        this.Th_Nail = thumbnail;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return No_Songs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.No_Songs = numOfSongs;
    }

    public int getThumbnail() {
        return Th_Nail;
    }

    public void setThumbnail(int thumbnail) {
        this.Th_Nail = thumbnail;
    }
}
