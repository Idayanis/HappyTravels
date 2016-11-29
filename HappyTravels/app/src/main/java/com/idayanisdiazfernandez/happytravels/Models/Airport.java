package com.idayanisdiazfernandez.happytravels.Models;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Airport extends Place {

    String flightsAvailability;

    public Airport(String name, double price, int thumbnail, String placeType) {
        super(name, price, thumbnail, placeType);
    }
}
