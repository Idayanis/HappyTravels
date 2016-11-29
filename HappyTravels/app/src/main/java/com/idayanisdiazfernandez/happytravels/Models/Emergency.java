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
    public Emergency(String department, int contactNumber, String placeType) {
        this.department = department;
        ContactNumber = contactNumber;
        this.placeType = placeType;
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
