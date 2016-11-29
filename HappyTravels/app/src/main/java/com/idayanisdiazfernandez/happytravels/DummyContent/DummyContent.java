package com.idayanisdiazfernandez.happytravels.DummyContent;

import com.idayanisdiazfernandez.happytravels.Models.Airport;
import com.idayanisdiazfernandez.happytravels.Models.Emergency;
import com.idayanisdiazfernandez.happytravels.Models.Hotel;
import com.idayanisdiazfernandez.happytravels.Models.NightClub;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.Models.Restaurant;
import com.idayanisdiazfernandez.happytravels.Models.Transportation;
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
    String[] roomType = {"Single", "Double", "Single, Double", "Single, Double, Studio"};

    Hotel hotel1 = new Hotel("Hotel 1", "Hotel 1 description", "Open 24/7", "Address for Hotel 1",
            8989398, "Hotel", 80, gallery[0], gallery[0][0], roomType[1], true, true, true, true, true);

    Hotel hotel2 = new Hotel("Hotel 2", "Hotel 2 description", "Open 24/7", "Address for Hotel 2",
            8989498, "Hotel", 80, gallery[1], gallery[0][1], roomType[1], true, true, true, true, true);

    Hotel hotel3 = new Hotel("Hotel 3", "Hotel 3 description", "Open 24/7", "Address for Hotel 3",
            8989598, "Hotel", 80, gallery[2], gallery[0][2], roomType[1], true, true, true, true, true);

    Hotel hotel4 = new Hotel("Hotel 4", "Hotel 4 description", "Open 24/7", "Address for Hotel 4",
            8989698, "Hotel", 80, gallery[3], gallery[1][0], roomType[1], true, true, true, true, true);

    Hotel hotel5 = new Hotel("Hotel 5", "Hotel 5 description", "Open 24/7", "Address for Hotel 5",
            8989798, "Hotel", 80, gallery[4], gallery[1][1], roomType[1], true, true, true, true, true);

    Hotel hotel6 = new Hotel("Hotel 6", "Hotel 6 description", "Open 24/7", "Address for Hotel 6",
            8989898, "Hotel", 80, gallery[5], gallery[1][2], roomType[1], true, true, true, true, true);

    Hotel hotel7 = new Hotel("Hotel 7", "Hotel 7 description", "Open 24/7", "Address for Hotel 7",
            8989998, "Hotel", 80, gallery[1], gallery[2][0], roomType[1], true, true, true, true, true);

    Hotel hotel8 = new Hotel("Hotel 8", "Hotel 8 description", "Open 24/7", "Address for Hotel 8",
            8989098, "Hotel", 80, gallery[2], gallery[2][1], roomType[1], true, true, true, true, true);


    // NightClubs
    NightClub nightClub1 = new NightClub("Nightclub 1", "Nightclub 1 description", "Open 24/7", "Address for Nightclub 1",
            8989098, "Nightclub", 10, gallery[0], gallery[0][0], true, true, true);

    NightClub nightClub2 = new NightClub("Nightclub 2", "Nightclub 2 description", "Open 24/7", "Address for Nightclub 2",
            8989098, "Nightclub", 10, gallery[1], gallery[0][2], true, true, true);

    NightClub nightClub3 = new NightClub("Nightclub 3", "Nightclub 3 description", "Open 24/7", "Address for Nightclub 3",
            8989098, "Nightclub", 10, gallery[2], gallery[4][2], true, true, true);

    NightClub nightClub4 = new NightClub("Nightclub 4", "Nightclub 4 description", "Open 24/7", "Address for Nightclub 4",
            8989098, "Nightclub", 10, gallery[3], gallery[3][1], true, true, true);

    NightClub nightClub5 = new NightClub("Nightclub 5", "Nightclub 5 description", "Open 24/7", "Address for Nightclub 5",
            8989098, "Nightclub", 10, gallery[4], gallery[4][5], true, true, true);

    NightClub nightClub6 = new NightClub("Nightclub 6", "Nightclub 6 description", "Open 24/7", "Address for Nightclub 6",
            8989098, "Nightclub", 10, gallery[5], gallery[5][1], true, true, true);

    NightClub nightClub7 = new NightClub("Nightclub 7", "Nightclub 7 description", "Open 24/7", "Address for Nightclub 7",
            8989098, "Nightclub", 10, gallery[1], gallery[3][0], true, true, true);

    NightClub nightClub8 = new NightClub("Nightclub 8", "Nightclub 8 description", "Open 24/7", "Address for Nightclub 8",
            8989098, "Nightclub", 10, gallery[2], gallery[0][1], true, true, true);

    // Other places
    Place otherPlace1 = new Place("Other Place 1", "Other Place 1 description", "Open 24/7", "Address for Other Place 1",
            1989098, "Place", 5, gallery[2], gallery[0][1]);

    Place otherPlace2 = new Place("Other Place 2", "Other Place 2 description", "Open 24/7", "Address for Other Place 2",
            2989098, "Place", 6, gallery[2], gallery[0][1]);

    Place otherPlace3 = new Place("Other Place 3", "Other Place 3 description", "Open 24/7", "Address for Other Place 3",
            3989098, "Place", 7, gallery[2], gallery[0][1]);

    Place otherPlace4 = new Place("Other Place 4", "Other Place 4 description", "Open 24/7", "Address for Other Place 4",
            4989098, "Place", 8, gallery[2], gallery[0][1]);

    Place otherPlace5 = new Place("Other Place 5", "Other Place 5 description", "Open 24/7", "Address for Other Place 5",
            5989098, "Place", 9, gallery[2], gallery[0][1]);

    Place otherPlace6 = new Place("Other Place 6", "Other Place 6 description", "Open 24/7", "Address for Other Place 6",
            6989098, "Place", 0, gallery[2], gallery[0][1]);

    Place otherPlace7 = new Place("Other Place 7", "Other Place 7 description", "Open 24/7", "Address for Other Place 7",
            7989098, "Place", 1, gallery[2], gallery[0][1]);

    Place otherPlace8 = new Place("Other Place 8", "Other Place 8 description", "Open 24/7", "Address for Other Place 8",
            8989091, "Place", 3, gallery[2], gallery[0][1]);


    // Restaurants
    Restaurant restaurant1 = new Restaurant("Restaurant 1", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 1", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

    Restaurant restaurant2 = new Restaurant("Restaurant 2", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 2", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

    Restaurant restaurant3 = new Restaurant("Restaurant 3", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 3", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

    Restaurant restaurant4 = new Restaurant("Restaurant 4", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 4", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

    Restaurant restaurant5 = new Restaurant("Restaurant 5", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 5", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

    Restaurant restaurant6 = new Restaurant("Restaurant 6", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 6", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

    Restaurant restaurant7 = new Restaurant("Restaurant 7", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 7", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

    Restaurant restaurant8 = new Restaurant("Restaurant 8", "Restaurant 1 description", "Open 24/7",
            "Address for Restaurant 8", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
            "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");


    // Transportation
    Transportation transportation1 = new Transportation("Taxi", "The taxi is available - details",
            "The price are 20 per km.");

    Transportation transportation2 = new Transportation("Public Bus", "The Bus is available - details",
            "The price are 20 per km.");

    Transportation transportation3 = new Transportation("Train", "The Train is available - details",
            "The price are 20 per km.");

    Transportation transportation4 = new Transportation("Train", "The Train is available - details",
            "The price are 20 per km.");

    Transportation transportation5 = new Transportation("Public Bus", "The Public Bus is available - details",
            "The price are 20 per km.");

    Transportation transportation6 = new Transportation("Bus", "The Bus is available - details",
            "The price are 20 per km.");

    Transportation transportation7 = new Transportation("Bikes", "The Bikes is available - details",
            "The price are 20 per km.");

    Transportation transportation8 = new Transportation("Bus", "The Bus is available - details",
            "The price are 20 per km.");

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

        objectsList.add(hotel1);
        objectsList.add(hotel2);
        objectsList.add(hotel3);
        objectsList.add(hotel4);
        objectsList.add(hotel5);
        objectsList.add(hotel6);
        objectsList.add(hotel7);
        objectsList.add(hotel8);

        objectsList.add(nightClub1);
        objectsList.add(nightClub2);
        objectsList.add(nightClub3);
        objectsList.add(nightClub4);
        objectsList.add(nightClub5);
        objectsList.add(nightClub6);
        objectsList.add(nightClub7);
        objectsList.add(nightClub8);

        objectsList.add(otherPlace1);
        objectsList.add(otherPlace2);
        objectsList.add(otherPlace3);
        objectsList.add(otherPlace4);
        objectsList.add(otherPlace5);
        objectsList.add(otherPlace6);
        objectsList.add(otherPlace7);
        objectsList.add(otherPlace8);

        objectsList.add(restaurant1);
        objectsList.add(restaurant2);
        objectsList.add(restaurant3);
        objectsList.add(restaurant4);
        objectsList.add(restaurant5);
        objectsList.add(restaurant6);
        objectsList.add(restaurant7);
        objectsList.add(restaurant8);

        objectsList.add(transportation1);
        objectsList.add(transportation2);
        objectsList.add(transportation3);
        objectsList.add(transportation4);
        objectsList.add(transportation5);
        objectsList.add(transportation6);
        objectsList.add(transportation7);
        objectsList.add(transportation8);

        return objectsList;
    }

}