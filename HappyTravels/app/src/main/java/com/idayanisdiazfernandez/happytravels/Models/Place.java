package com.idayanisdiazfernandez.happytravels.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by idasarav on 2016-11-16.
 */

public abstract class Place implements Parcelable {

    String name, description, timing, address, placeType, geoCode, email, webPage;
    double price;
    int[] photos;
    int phoneNumber,thumbnail;

    // Empty constructor
    public Place() {

    }

    /**
     * The default constructor to instantiate object from it.
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
     */
    public Place(String name, String description, String timing, String address,
                 int phoneNumber, String placeType, double price, int[] photos, int thumbnail, String geoCode, String email, String webPage) {
        this.name = name;
        this.description = description;
        this.timing = timing;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.placeType = placeType;
        this.price = price;
        this.photos = photos;
        this.thumbnail = thumbnail;
        this.geoCode = geoCode;
        this.email = email;
        this.webPage = webPage;
    }

    /**
     *  Storing the Place data to Parcel object.
     */

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(timing);
        parcel.writeString(address);
        parcel.writeString(placeType);
        parcel.writeDouble(price);
        parcel.writeInt(phoneNumber);
        parcel.writeInt(thumbnail);
        parcel.writeIntArray(photos);
        parcel.writeString(geoCode);
        parcel.writeString(email);
        parcel.writeString(webPage);
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    protected Place(Parcel in){
        this.name = in.readString();
        this.address = in.readString();
        this.description = in.readString();
        this.timing = in.readString();
        this.placeType = in.readString();
        this.price = in.readDouble();
        this.phoneNumber = in.readInt();
        this.thumbnail = in.readInt();
        this.photos = in.createIntArray();
        this.geoCode = in.readString();
        this.email = in.readString();
        this.webPage = in.readString();
    }

    // Create getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int contactInfo) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getPhotos() {
        return photos;
    }

    public void setPhotos(int[] photos) {
        this.photos = photos;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }
}
