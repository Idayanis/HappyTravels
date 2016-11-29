package com.idayanisdiazfernandez.happytravels.Models;

import com.idayanisdiazfernandez.happytravels.Models.Place;

/**
 * Created by idasarav on 2016-11-16.
 */

public class NightClub extends Place {

    String drinks;

    public NightClub(String name, double price, int thumbnail, String placeType) {
        super(name, price, thumbnail, placeType);
    }
}
