package com.idayanisdiazfernandez.happytravels;

import java.lang.reflect.Array;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Place {

    String name, description, timing, address, contactInfo;
    double price;
    String photos;
    int thumbnail;


    public Place(String name, double price, int thumbnail) {
        this.name = name;
        this.price = price;
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
}
