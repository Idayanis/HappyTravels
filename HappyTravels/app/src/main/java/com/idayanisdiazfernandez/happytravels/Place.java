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


}
