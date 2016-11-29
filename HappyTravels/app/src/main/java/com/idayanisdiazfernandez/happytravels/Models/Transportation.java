package com.idayanisdiazfernandez.happytravels.Models;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Transportation {

    // The properties for the Transportation class.
    String type;
    String description;
    String priceRange;

    /**
     *  The default constructor for the Transportation class.
     * @param type
     * @param description
     * @param priceRange
     */
    public Transportation(String type, String description, String priceRange) {
        this.type = type;
        this.description = description;
        this.priceRange = priceRange;
    }

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
