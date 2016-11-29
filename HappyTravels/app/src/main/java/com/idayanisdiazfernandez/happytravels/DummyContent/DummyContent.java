package com.idayanisdiazfernandez.happytravels.DummyContent;

import com.idayanisdiazfernandez.happytravels.Models.Airport;
import com.idayanisdiazfernandez.happytravels.Models.Emergency;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by MaihanNijat on 2016-11-29.
 */

public class DummyContent {
    String name, description, timing, address, contactInfo, placeType;
    double price;
    int[] photos;
    int thumbnail;

    // Array to store objects
    private List<Place> objectsList = new ArrayList<>();

    String[] placeNames = {
            "Airport 1",
            "Airport 2",
            "Airport 3",
            "Airport 4",
            "Airport 5",
            "Airport 6",
            "Airport 7",
            "Airport 8",
            "Hotel 1",
            "Hotel 2",
            "Hotel 3",
            "Hotel 4",
            "Hotel 5",
            "Hotel 6",
            "Hotel 7",
            "Hotel 8",
            "Restaurant 1",
            "Restaurant 2",
            "Restaurant 3",
            "Restaurant 4",
            "Restaurant 5",
            "Restaurant 6",
            "Restaurant 7",
            "Restaurant 8",
            "Nightclub 1",
            "Nightclub 2",
            "Nightclub 3",
            "Nightclub 4",
            "Nightclub 5",
            "Nightclub 6",
            "Nightclub 7",
            "Nightclub 8",
            "Emergency 1",
            "Emergency 2",
            "Emergency 3",
            "Emergency 4",
            "Emergency 5",
            "Emergency 6",
            "Emergency 7",
            "Emergency 8",
            "Transportation 1",
            "Transportation 2",
            "Transportation 3",
            "Transportation 4",
            "Transportation 5",
            "Transportation 6",
            "Transportation 7",
            "Transportation 8",
            "Place 1",
            "Place 2",
            "Place 3",
            "Place 4",
            "Place 5",
            "Place 6",
            "Place 7",
            "Place 8",
    };

    // Create array for gallery.
    int[][] gallery = {
            {R.drawable.place1, R.drawable.place2, R.drawable.place3},
            {R.drawable.place4, R.drawable.place5, R.drawable.place6},
            {R.drawable.place7, R.drawable.place8, R.drawable.place9},
            {R.drawable.place10, R.drawable.place11, R.drawable.place1},
            {R.drawable.place1, R.drawable.place5, R.drawable.place7},
            {R.drawable.place9, R.drawable.place11, R.drawable.place7}};


    // Instantiate objects for each type of place.

    // Airports
    Airport airport1 = new Airport(placeNames[0], "Airport 1 description", "Open 24/7", "Address for Airport 1",
            789878787, "Airport", 0, gallery[0], gallery[0][0], "International and domestic flights.");

    Airport airport2 = new Airport(placeNames[1], "Airport 2 description", "Open 24/7", "Address for Airport 2",
            789844787, "Airport", 0, gallery[1], gallery[0][1], "International and domestic flights.");

    Airport airport3 = new Airport(placeNames[2], "Airport 3 description", "Open 24/7", "Address for Airport 3",
            789844787, "Airport", 0, gallery[2], gallery[0][2], "International and domestic flights.");

    Airport airport4 = new Airport(placeNames[3], "Airport 4 description", "Open 24/7", "Address for Airport 4",
            789844787, "Airport", 0, gallery[3], gallery[1][0], "International and domestic flights.");

    Airport airport5 = new Airport(placeNames[4], "Airport 5 description", "Open 24/7", "Address for Airport 5",
            789844787, "Airport", 0, gallery[4], gallery[1][1], "International and domestic flights.");

    Airport airport6 = new Airport(placeNames[5], "Airport 6 description", "Open 24/7", "Address for Airport 6",
            789844787, "Airport", 0, gallery[5], gallery[1][2], "International and domestic flights.");

    Airport airport7 = new Airport(placeNames[6], "Airport 7 description", "Open 24/7", "Address for Airport 7",
            789844787, "Airport", 0, gallery[1], gallery[2][0], "International and domestic flights.");

    Airport airport8 = new Airport(placeNames[7], "Airport 8 description", "Open 24/7", "Address for Airport 8",
            789844787, "Airport", 0, gallery[2], gallery[2][1], "International and domestic flights.");


    // Emergency
    Emergency emergency1 = new Emergency("Police", 787878789, "Emergency");
    Emergency emergency2 = new Emergency("Fire Department", 787878789, "Emergency");
    Emergency emergency3 = new Emergency("Hospital A", 787878789, "Emergency");
    Emergency emergency4 = new Emergency("Hospital B", 787878789, "Emergency");
    Emergency emergency5 = new Emergency("Ambulance A", 787878789, "Emergency");
    Emergency emergency6 = new Emergency("Ambulance B", 787878789, "Emergency");



    // Add objects to array and return array from the method.
    public List<Place> getObjectsList() {

        objectsList.add(airport1);
        objectsList.add(airport2);
        objectsList.add(airport3);
        objectsList.add(airport4);
        objectsList.add(airport5);
        objectsList.add(airport6);
        objectsList.add(airport7);
        objectsList.add(airport8);

        objectsList.add(emergency1);
        objectsList.add(emergency2);
        objectsList.add(emergency3);
        objectsList.add(emergency4);
        objectsList.add(emergency5);
        objectsList.add(emergency6);

        return objectsList;
    }

}