package com.idayanisdiazfernandez.happytravels.Models;

import android.os.Parcel;
import android.os.Parcelable;

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
     * @param phoneNumber
     */
    public Emergency(String name, String department, String phoneNumber, String placeType, int thumbnail,
                     String geoCode, String email, String webPage) {
        this.name = name;
        this.department = department;
        phoneNumber = phoneNumber;
        this.placeType = placeType;
        this.thumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(department);
        parcel.writeInt(ContactNumber);
    }

    /**
     * Retrieving Place data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    private Emergency(Parcel in){
        super(in);
        this.ContactNumber = in.readInt();
        this.department = in.readString();
    }

    public static final Parcelable.Creator<Emergency> CREATOR
            = new Parcelable.Creator<Emergency>() {
        public Emergency createFromParcel(Parcel in) {
            return new Emergency(in);
        }

        public Emergency[] newArray(int size) {
            return new Emergency[size];
        }
    };

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
