package com.idayanisdiazfernandez.happytravels.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Nightclub extends Place {

    // Properties for NighClub class.
    Boolean paidDrinks;
    Boolean freeDrinks;
    Boolean tableReservation;

    /**
     *  The default constructor for Nightclub class.
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
    public Nightclub(String name, String description, String timing, String address, int contactInfo,
                     String placeType, double price, int[] photos, int thumbnail, Boolean paidDrinks,
                     Boolean freeDrinks, Boolean tableReservation) {
        super(name, description, timing, address, contactInfo, placeType, price, photos, thumbnail);
        this.paidDrinks = paidDrinks;
        this.freeDrinks = freeDrinks;
        this.tableReservation = tableReservation;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte((byte) (paidDrinks ? 1 : 0));
        parcel.writeByte((byte) (freeDrinks ? 1 : 0));
        parcel.writeByte((byte) (tableReservation ? 1 : 0));
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    private Nightclub(Parcel in){
        super(in);
        this.paidDrinks = in.readByte() != 0;
        this.freeDrinks = in.readByte() != 0;
        this.tableReservation = in.readByte() != 0;
    }

    public static final Parcelable.Creator<Nightclub> CREATOR
            = new Parcelable.Creator<Nightclub>() {
        public Nightclub createFromParcel(Parcel in) {
            return new Nightclub(in);
        }

        public Nightclub[] newArray(int size) {
            return new Nightclub[size];
        }
    };

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
