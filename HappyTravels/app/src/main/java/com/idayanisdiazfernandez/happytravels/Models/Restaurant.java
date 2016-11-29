package com.idayanisdiazfernandez.happytravels.Models;

import com.idayanisdiazfernandez.happytravels.Models.Place;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Restaurant extends Place {

    String TypeOfFood;


    public Restaurant(String name, double price, int thumbnail, String placeType) {
        super(name, price, thumbnail, placeType);
    }

}
