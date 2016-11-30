package com.idayanisdiazfernandez.happytravels.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Airport extends Place {

    String flightsAvailability;

    public Airport(String name, String description, String timing, String address, int contactInfo,
                   String placeType, double price, int[] photos, int thumbnail, String flightsAvailability) {
        super(name, description, timing, address, contactInfo, placeType, price, photos, thumbnail);
        this.flightsAvailability = flightsAvailability;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(flightsAvailability);
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    private Airport(Parcel in){
        super(in);
        this.flightsAvailability = in.readString();
    }

    public static final Parcelable.Creator<Airport> CREATOR
            = new Parcelable.Creator<Airport>() {
        public Airport createFromParcel(Parcel in) {
            return new Airport(in);
        }

        public Airport[] newArray(int size) {
            return new Airport[size];
        }
    };

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
