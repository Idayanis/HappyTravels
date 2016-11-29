package com.idayanisdiazfernandez.happytravels.Models;

import java.lang.reflect.Array;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Place {

    String name, description, timing, address, placeType;
    double price;
    int[] photos;
    int contactInfo,thumbnail;

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
     * @param contactInfo
     * @param placeType
     * @param price
     * @param photos
     * @param thumbnail
     */
    public Place(String name, String description, String timing, String address,
                 int contactInfo, String placeType, double price, int[] photos, int thumbnail) {
        this.name = name;
        this.description = description;
        this.timing = timing;
        this.address = address;
        this.contactInfo = contactInfo;
        this.placeType = placeType;
        this.price = price;
        this.photos = photos;
        this.thumbnail = thumbnail;
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

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
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
}
