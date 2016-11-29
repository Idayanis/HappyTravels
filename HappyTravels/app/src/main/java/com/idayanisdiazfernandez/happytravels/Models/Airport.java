package com.idayanisdiazfernandez.happytravels.Models;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Airport extends Place {

    String flightsAvailability;

    public Airport(String name, String description, String timing, String address, String contactInfo,
                   String placeType, double price, int[] photos, int thumbnail, String flightsAvailability) {
        super(name, description, timing, address, contactInfo, placeType, price, photos, thumbnail);
        this.flightsAvailability = flightsAvailability;
    }

    /**
     *  Getter for flight availability
     * @return flightsAvailability
     */
    public String getFlightsAvailability() {
        return flightsAvailability;
    }

    /*
    * The setter method which acceps string parameter.
     */
    public void setFlightsAvailability(String flightsAvailability) {
        this.flightsAvailability = flightsAvailability;
    }
}
