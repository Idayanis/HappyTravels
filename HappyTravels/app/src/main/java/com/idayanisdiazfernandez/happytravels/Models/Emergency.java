package com.idayanisdiazfernandez.happytravels.Models;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Emergency extends Place {

    String department;
    int ContactNumber;

    /**
     *  The Empty constructor.
     */
    public Emergency(){

    }

    /**
     *  The default constructor to instantiate objectc from it.
     * @param department
     * @param contactNumber
     */
    public Emergency(String name, String department, int contactNumber, String placeType, int thumbnail) {
        this.name = name;
        this.department = department;
        ContactNumber = contactNumber;
        this.placeType = placeType;
        this.thumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     *
     *  The Getters and Setters for the Emergency class.
     */

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(int contactNumber) {
        ContactNumber = contactNumber;
    }
}
