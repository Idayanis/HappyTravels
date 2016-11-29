package com.idayanisdiazfernandez.happytravels.Models;

import com.idayanisdiazfernandez.happytravels.Models.Place;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Restaurant extends Place {

    // The properties for Restaurant class.
    String[] TypeOfFood;
    String[] menuList;
    Boolean drink;
    String cuisine;
    String reservations;

    /**
     *  The default constructor for Restaurant class.
     * @param name
     * @param description
     * @param timing
     * @param address
     * @param contactInfo
     * @param placeType
     * @param price
     * @param photos
     * @param thumbnail
     * @param typeOfFood
     * @param menuList
     * @param drink
     * @param cuisine
     * @param reservations
     */
    public Restaurant(String name, String description, String timing, String address, int contactInfo,
                      String placeType, double price, int[] photos, int thumbnail, String[] typeOfFood,
                      String[] menuList, Boolean drink, String cuisine, String reservations) {
        super(name, description, timing, address, contactInfo, placeType, price, photos, thumbnail);
        TypeOfFood = typeOfFood;
        this.menuList = menuList;
        this.drink = drink;
        this.cuisine = cuisine;
        this.reservations = reservations;
    }

    // Getters and Setters

    public String[] getTypeOfFood() {
        return TypeOfFood;
    }

    public void setTypeOfFood(String[] typeOfFood) {
        TypeOfFood = typeOfFood;
    }

    public String[] getMenuList() {
        return menuList;
    }

    public void setMenuList(String[] menuList) {
        this.menuList = menuList;
    }

    public Boolean getDrink() {
        return drink;
    }

    public void setDrink(Boolean drink) {
        this.drink = drink;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getReservations() {
        return reservations;
    }

    public void setReservations(String reservations) {
        this.reservations = reservations;
    }
}
