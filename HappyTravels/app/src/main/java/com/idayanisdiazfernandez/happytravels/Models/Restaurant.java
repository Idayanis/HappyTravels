package com.idayanisdiazfernandez.happytravels.Models;

import android.icu.text.DisplayContext;
import android.os.Parcel;
import android.os.Parcelable;

import com.idayanisdiazfernandez.happytravels.Models.Place;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Restaurant extends Place {

    // The properties for Restaurant class.
    String TypeOfFood;
    String menuList;
    Boolean drink;
    String cuisine;
    String reservations;

    /**
     *  The default constructor for Restaurant class.
     * @param name
     * @param description
     * @param timing
     * @param address
     * @param phoneNumber
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
    public Restaurant(String name, String description, String timing, String address, int phoneNumber,
                      String placeType, double price, int[] photos, int thumbnail, String geoCode, String email, String webPage, String typeOfFood,
                      String menuList, Boolean drink, String cuisine, String reservations) {
        super(name, description, timing, address, phoneNumber, placeType, price, photos, thumbnail, geoCode, email, webPage);
        TypeOfFood = typeOfFood;
        this.menuList = menuList;
        this.drink = drink;
        this.cuisine = cuisine;
        this.reservations = reservations;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(TypeOfFood);
        parcel.writeString(menuList);
        parcel.writeByte((byte) (drink ? 1 : 0));
        parcel.writeString(cuisine);
        parcel.writeString(reservations);
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    private Restaurant(Parcel in){
        super(in);
        this.TypeOfFood = in.readString();
        this.menuList = in.readString();
        this.drink = in.readByte() != 0;
        this.cuisine = in.readString();
        this.reservations = in.readString();
    }

    public static final Parcelable.Creator<Restaurant> CREATOR
            = new Parcelable.Creator<Restaurant>() {
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };

    // Getters and Setters

    public String getTypeOfFood() {
        return TypeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        TypeOfFood = typeOfFood;
    }

    public String getMenuList() {
        return menuList;
    }

    public void setMenuList(String menuList) {
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
