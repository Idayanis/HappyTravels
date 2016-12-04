package com.idayanisdiazfernandez.happytravels.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by MaihanNijat on 2016-11-30.
 */

public class Beach extends Place {

    public Beach(String name, String description, String timing, String address, int phoneNumber,
                 String placeType, double price, int[] photos, int thumbnail, String geoCode, String email, String webPage) {
        super(name, description, timing, address, phoneNumber, placeType, price, photos, thumbnail, geoCode, email, webPage);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    private Beach(Parcel in){
        super(in);
    }

    public static final Parcelable.Creator<Beach> CREATOR
            = new Parcelable.Creator<Beach>() {
        public Beach createFromParcel(Parcel in) {
            return new Beach(in);
        }

        public Beach[] newArray(int size) {
            return new Beach[size];
        }
    };
}
