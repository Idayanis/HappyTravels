package com.idayanisdiazfernandez.happytravels.DummyContent;

import com.idayanisdiazfernandez.happytravels.Models.Airport;
import com.idayanisdiazfernandez.happytravels.Models.Emergency;
import com.idayanisdiazfernandez.happytravels.Models.Hotel;
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
    Airport airport1 = new Airport("Airport 1", "Airport 1 description", "Open 24/7", "Address for Airport 1",
            789878787, "Airport", 0, gallery[0], gallery[0][0], "International and domestic flights.");

    Airport airport2 = new Airport("Airport 2", "Airport 2 description", "Open 24/7", "Address for Airport 2",
            789844787, "Airport", 0, gallery[1], gallery[0][1], "International and domestic flights.");

    Airport airport3 = new Airport("Airport 3", "Airport 3 description", "Open 24/7", "Address for Airport 3",
            789844787, "Airport", 0, gallery[2], gallery[0][2], "International and domestic flights.");

    Airport airport4 = new Airport("Airport 4", "Airport 4 description", "Open 24/7", "Address for Airport 4",
            789844787, "Airport", 0, gallery[3], gallery[1][0], "International and domestic flights.");

    Airport airport5 = new Airport("Airport 5", "Airport 5 description", "Open 24/7", "Address for Airport 5",
            789844787, "Airport", 0, gallery[4], gallery[1][1], "International and domestic flights.");

    Airport airport6 = new Airport("Airport 6", "Airport 6 description", "Open 24/7", "Address for Airport 6",
            789844787, "Airport", 0, gallery[5], gallery[1][2], "International and domestic flights.");

    Airport airport7 = new Airport("Airport 7", "Airport 7 description", "Open 24/7", "Address for Airport 7",
            789844787, "Airport", 0, gallery[1], gallery[2][0], "International and domestic flights.");

    Airport airport8 = new Airport("Airport 8", "Airport 8 description", "Open 24/7", "Address for Airport 8",
            789844787, "Airport", 0, gallery[2], gallery[2][1], "International and domestic flights.");


    // Emergency
    Emergency emergency1 = new Emergency("Police", 787878789, "Emergency");
    Emergency emergency2 = new Emergency("Fire Department", 787878789, "Emergency");
    Emergency emergency3 = new Emergency("Hospital A", 787878789, "Emergency");
    Emergency emergency4 = new Emergency("Hospital B", 787878789, "Emergency");
    Emergency emergency5 = new Emergency("Ambulance A", 787878789, "Emergency");
    Emergency emergency6 = new Emergency("Ambulance B", 787878789, "Emergency");

    // Hotel
    String[] roomType = {"Single", "Double", "Single, Double" , "Single, Double, Studio"};

    Hotel hotel1 = new Hotel("Hotel 1", "Hotel 1 description", "Open 24/7", "Address for Hotel 1",
            8989398, "Hotel", 80, gallery[0], gallery[0][0],roomType[1], true, true, true, true, true);

    Hotel hotel2 = new Hotel("Hotel 2", "Hotel 2 description", "Open 24/7", "Address for Hotel 2",
            8989498, "Hotel", 80, gallery[1], gallery[0][1],roomType[1], true, true, true, true, true);

    Hotel hotel3 = new Hotel("Hotel 3", "Hotel 3 description", "Open 24/7", "Address for Hotel 3",
            8989598, "Hotel", 80, gallery[2], gallery[0][2],roomType[1], true, true, true, true, true);

    Hotel hotel4 = new Hotel("Hotel 4", "Hotel 4 description", "Open 24/7", "Address for Hotel 4",
            8989698, "Hotel", 80, gallery[3], gallery[1][0],roomType[1], true, true, true, true, true);

    Hotel hotel5 = new Hotel("Hotel 5", "Hotel 5 description", "Open 24/7", "Address for Hotel 5",
            8989798, "Hotel", 80, gallery[4], gallery[1][1],roomType[1], true, true, true, true, true);

    Hotel hotel6 = new Hotel("Hotel 6", "Hotel 6 description", "Open 24/7", "Address for Hotel 6",
            8989898, "Hotel", 80, gallery[5], gallery[1][2],roomType[1], true, true, true, true, true);

    Hotel hotel7 = new Hotel("Hotel 7", "Hotel 7 description", "Open 24/7", "Address for Hotel 7",
            8989998, "Hotel", 80, gallery[1], gallery[2][0],roomType[1], true, true, true, true, true);

    Hotel hotel8 = new Hotel("Hotel 8", "Hotel 8 description", "Open 24/7", "Address for Hotel 8",
            8989098, "Hotel", 80, gallery[2], gallery[2][1],roomType[1], true, true, true, true, true);



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