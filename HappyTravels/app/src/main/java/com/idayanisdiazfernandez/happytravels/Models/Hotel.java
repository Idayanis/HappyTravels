package com.idayanisdiazfernandez.happytravels.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Hotel extends Place {

    // Properties for the Hotel
    String roomType;
    Boolean swimmingPool;
    Boolean longTable;
    Boolean disco;
    Boolean roomService;
    Boolean restaurant;

    /**
     * The default constructor for the Hotel class which extends the Place constructor and accepts parameters.
     *
     * @param name
     * @param description
     * @param timing
     * @param address
     * @param phoneNumber
     * @param placeType
     * @param price
     * @param photos
     * @param thumbnail
     * @param roomType
     * @param swimmingPool
     * @param longTable
     * @param disco
     * @param roomService
     * @param restaurant
     */

    public Hotel(String name, String description, String timing, String address, String phoneNumber, String placeType,
                 double price, int[] photos, int thumbnail, String geoCode, String email, String webPage, String roomType, Boolean swimmingPool,
                 Boolean longTable, Boolean disco, Boolean roomService, Boolean restaurant) {
        super(name, description, timing, address, phoneNumber, placeType, price, photos, thumbnail, geoCode, email, webPage);
        this.roomType = roomType;
        this.swimmingPool = swimmingPool;
        this.longTable = longTable;
        this.disco = disco;
        this.roomService = roomService;
        this.restaurant = restaurant;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(roomType);
        parcel.writeByte((byte) (swimmingPool ? 1 : 0));
        parcel.writeByte((byte) (longTable ? 1 : 0));
        parcel.writeByte((byte) (disco ? 1 : 0));
        parcel.writeByte((byte) (roomService ? 1 : 0));
        parcel.writeByte((byte) (restaurant ? 1 : 0));
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    private Hotel(Parcel in){
        super(in);
        this.roomType = in.readString();
        this.swimmingPool = in.readByte() != 0;
        this.longTable = in.readByte() != 0;
        this.disco = in.readByte() != 0;
        this.roomService = in.readByte() != 0;
        this.restaurant = in.readByte() != 0;
    }

    public static final Parcelable.Creator<Hotel> CREATOR
            = new Parcelable.Creator<Hotel>() {
        public Hotel createFromParcel(Parcel in) {
            return new Hotel(in);
        }

        public Hotel[] newArray(int size) {
            return new Hotel[size];
        }
    };

    // Getters and Setters for Hotel properties.

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public Boolean getLongTable() {
        return longTable;
    }

    public void setLongTable(Boolean longTable) {
        this.longTable = longTable;
    }

    public Boolean getDisco() {
        return disco;
    }

    public void setDisco(Boolean disco) {
        this.disco = disco;
    }

    public Boolean getRoomService() {
        return roomService;
    }

    public void setRoomService(Boolean roomService) {
        this.roomService = roomService;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }
}
