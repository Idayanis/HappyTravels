package com.idayanisdiazfernandez.happytravels.Models;

/**
 * Created by idasarav on 2016-11-16.
 */

public class City {

    // The properties for City class.
    String name;
    String description;
    String location;
    String language;

    /**
     * The default constructor for City class.
     *
     * @param name
     * @param description
     * @param location
     * @param language
     */
    public City(String name, String description, String location, String language) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.language = language;
    }

    // Getters and Setters

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
