package com.idayanisdiazfernandez.happytravels.Models;

/**
 * Created by idasarav on 2016-11-16.
 */

public class Emergency {

    String department;
    String ContactNumber;

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
    public Emergency(String department, String contactNumber) {
        this.department = department;
        ContactNumber = contactNumber;
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

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }
}
