package com.idayanisdiazfernandez.happytravels.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Transportation extends Place {

    // The properties for the Transportation class.
    String type;
    String priceRange;

    /**
     *  The default constructor for the Transportation class.
     * @param type
     * @param description
     * @param priceRange
     */
    public Transportation(String type, String description, String priceRange, int thumbnail, String placeType) {
        this.type = type;
        this.name = type;
        this.placeType = placeType;
        this.description = description;
        this.priceRange = priceRange;
        this.thumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(type);
        parcel.writeString(priceRange);
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    private Transportation(Parcel in){
        super(in);
        this.type = in.readString();
        this.priceRange = in.readString();
    }

    public static final Parcelable.Creator<Transportation> CREATOR
            = new Parcelable.Creator<Transportation>() {
        public Transportation createFromParcel(Parcel in) {
            return new Transportation(in);
        }

        public Transportation[] newArray(int size) {
            return new Transportation[size];
        }
    };

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }
}
