package com.idayanisdiazfernandez.happytravels.Models;

import com.idayanisdiazfernandez.happytravels.Models.Place;

/**
 * Created by idasarav on 2016-11-16.
 */

public class NightClub extends Place {

    // Properties for NighClub class.
    Boolean paidDrinks;
    Boolean freeDrinks;
    Boolean tableReservation;

    /**
     *  The default constructor for NightClub class.
     *
     * @param name
     * @param description
     * @param timing
     * @param address
     * @param contactInfo
     * @param placeType
     * @param price
     * @param photos
     * @param thumbnail
     * @param paidDrinks
     * @param freeDrinks
     * @param tableReservation
     */
    public NightClub(String name, String description, String timing, String address, String contactInfo,
                     String placeType, double price, int[] photos, int thumbnail, Boolean paidDrinks,
                     Boolean freeDrinks, Boolean tableReservation) {
        super(name, description, timing, address, contactInfo, placeType, price, photos, thumbnail);
        this.paidDrinks = paidDrinks;
        this.freeDrinks = freeDrinks;
        this.tableReservation = tableReservation;
    }

    // Getters and Setters

    public Boolean getPaidDrinks() {
        return paidDrinks;
    }

    public void setPaidDrinks(Boolean paidDrinks) {
        this.paidDrinks = paidDrinks;
    }

    public Boolean getFreeDrinks() {
        return freeDrinks;
    }

    public void setFreeDrinks(Boolean freeDrinks) {
        this.freeDrinks = freeDrinks;
    }

    public Boolean getTableReservation() {
        return tableReservation;
    }

    public void setTableReservation(Boolean tableReservation) {
        this.tableReservation = tableReservation;
    }
}
