package com.idayanisdiazfernandez.happytravels.Models;

import java.lang.reflect.Array;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Place {

    String name, description, timing, address, contactInfo, placeType;
    double price;
    String photos;
    int thumbnail;

    // Empty constructor
    public Place(){

    }


    public Place(String name, double price, int thumbnail, String placeType) {
        this.name = name;
        this.price = price;
        this.placeType = placeType;
        this.thumbnail = thumbnail;
    }

    // Create getters and setters.

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }
}
