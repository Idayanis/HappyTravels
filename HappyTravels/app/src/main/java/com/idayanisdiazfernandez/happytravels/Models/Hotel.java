package com.idayanisdiazfernandez.happytravels.Models;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Hotel extends Place {

    // Properties for the Hotel
    String[] roomType;
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
     * @param contactInfo
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

    public Hotel(String name, String description, String timing, String address, int contactInfo, String placeType,
                 double price, int[] photos, int thumbnail, String[] roomType, Boolean swimmingPool,
                 Boolean longTable, Boolean disco, Boolean roomService, Boolean restaurant) {
        super(name, description, timing, address, contactInfo, placeType, price, photos, thumbnail);
        this.roomType = roomType;
        this.swimmingPool = swimmingPool;
        this.longTable = longTable;
        this.disco = disco;
        this.roomService = roomService;
        this.restaurant = restaurant;
    }

    // Getters and Setters for Hotel properties.

    public String[] getRoomType() {
        return roomType;
    }

    public void setRoomType(String[] roomType) {
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
