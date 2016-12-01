package com.idayanisdiazfernandez.happytravels;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idayanisdiazfernandez.happytravels.Models.Airport;
import com.idayanisdiazfernandez.happytravels.Models.Beach;
import com.idayanisdiazfernandez.happytravels.Models.Emergency;
import com.idayanisdiazfernandez.happytravels.Models.Hotel;
import com.idayanisdiazfernandez.happytravels.Models.Nightclub;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.Models.Restaurant;
import com.idayanisdiazfernandez.happytravels.Models.Transportation;
import com.idayanisdiazfernandez.happytravels.Tools.PlacesAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.idayanisdiazfernandez.happytravels.MainActivity.TYPE_KEY;
import static com.idayanisdiazfernandez.happytravels.MainActivity.mSharedPreferences;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//
    public Airport airport1, airport2, airport3, airport4, airport5, airport6, airport7, airport8;
    public Beach beach1, beach2, beach3, beach4, beach5, beach6, beach7, beach8;
    public Emergency emergency1, emergency2, emergency3, emergency4, emergency5, emergency6;
    public Hotel hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8;
    public Nightclub nightClub1, nightClub2, nightClub3, nightClub4, nightClub5, nightClub6, nightClub7, nightClub8;
    public Restaurant restaurant1, restaurant2, restaurant3, restaurant4, restaurant5, restaurant6, restaurant7, restaurant8;
    public Transportation transportation1, transportation2, transportation3, transportation4, transportation5, transportation6,
            transportation7, transportation8;
    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//

    FragmentManager fragmentManager = null;

    // Create RecycleView, PlaceAdapter and List variables
    private RecyclerView recyclerView;
    private PlacesAdapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        //============================Dummy Content=====================================//
        //============================Dummy Content=====================================//
        //============================Dummy Content=====================================//
        // Airports
        airport1 = new Airport(getString(R.string.airport_1), getString(R.string.airport_1_description), getString(R.string.open), getString(R.string.address),
                789878787, getContext().getString(R.string.airport), 0, gallery[0], gallery[0][0], getString(R.string.flights_1));

        airport2 = new Airport(getString(R.string.airport_2), getString(R.string.airport_2_description), getString(R.string.open_2), getString(R.string.address_2),
                789844787, "Airport", 0, gallery[1], gallery[0][1], getString(R.string.flights_2));

        airport3 = new Airport(getString(R.string.airport_3), getString(R.string.airport_3_description), getString(R.string.open_3), getString(R.string.address_3),
                789844787, "Airport", 0, gallery[2], gallery[0][2], getString(R.string.flights_3));

        airport4 = new Airport(getString(R.string.airport_4), getString(R.string.airport_4_description), getString(R.string.open_4), getString(R.string.address_4),
                789844787, "Airport", 0, gallery[3], gallery[1][0], getString(R.string.flights));

        airport5 = new Airport(getString(R.string.airport_5), getString(R.string.airport_5_description), getString(R.string.open_5), getString(R.string.address_5),
                789844787, "Airport", 0, gallery[4], gallery[1][1], getString(R.string.flights_5));

        airport6 = new Airport(getString(R.string.airport_6), getString(R.string.airport_6_description), getString(R.string.open_6), getString(R.string.address_6),
                789844787, "Airport", 0, gallery[5], gallery[1][2], getString(R.string.flights_6));

        airport7 = new Airport(getString(R.string.airport_7), getString(R.string.airport_7_description), getString(R.string.open_7), getString(R.string.address_7),
                789844787, "Airport", 0, gallery[1], gallery[2][0], getString(R.string.flights_7));

        airport8 = new Airport(getString(R.string.airport_8), getString(R.string.airport_8_description), getString(R.string.open_8), getString(R.string.address_8),
                789844787, "Airport", 0, gallery[2], gallery[2][1], getString(R.string.flights_8));


        // Emergency
        emergency1 = new Emergency("Emergency 1", "Police", 787878789, "Emergency", R.drawable.place1);
        emergency2 = new Emergency("Emergency 2", "Fire Department", 787878789, "Emergency", R.drawable.place2);
        emergency3 = new Emergency("Emergency 3", "Hospital A", 787878789, "Emergency", R.drawable.place3);
        emergency4 = new Emergency("Emergency 4", "Hospital B", 787878789, "Emergency", R.drawable.place4);
        emergency5 = new Emergency("Emergency 5", "Ambulance A", 787878789, "Emergency", R.drawable.place5);
        emergency6 = new Emergency("Emergency 6", "Ambulance B", 787878789, "Emergency", R.drawable.place6);

        // Hotel
        String[] roomType = {"Single", "Double", "Single, Double", "Single, Double, Studio"};

        hotel1 = new Hotel(getString(R.string.hotel_1), getString(R.string.hotel_1_description), getString(R.string.hotel_1_open), getString(R.string.hotel_1_address),
                8989398, "Hotel", 80, gallery[0], gallery[0][0], roomType[1], true, true, true, true, true);

        hotel2 = new Hotel(getString(R.string.hotel_2), getString(R.string.hotel_2_description), getString(R.string.hotel_2_open), getString(R.string.hotel_2_address),
                8989498, "Hotel", 80, gallery[1], gallery[0][1], roomType[1], true, true, true, true, true);

        hotel3 = new Hotel(getString(R.string.hotel_3), getString(R.string.hotel_3_description), getString(R.string.hotel_3_open), getString(R.string.hotel_3_address),
                8989598, "Hotel", 80, gallery[2], gallery[0][2], roomType[1], true, true, true, true, true);

        hotel4 = new Hotel(getString(R.string.hotel_4), getString(R.string.hotel_4_description), getString(R.string.hotel_4_open), getString(R.string.hotel_4_address),
                8989698, "Hotel", 80, gallery[3], gallery[1][0], roomType[1], true, true, true, true, true);

        hotel5 = new Hotel(getString(R.string.hotel_5), getString(R.string.hotel_5_description), getString(R.string.hotel_5_open), getString(R.string.hotel_5_address),
                8989798, "Hotel", 80, gallery[4], gallery[1][1], roomType[1], true, true, true, true, true);

        hotel6 = new Hotel(getString(R.string.hotel_6), getString(R.string.hotel_6_description), getString(R.string.hotel_6_open), getString(R.string.hotel_6_address),
                8989898, "Hotel", 80, gallery[5], gallery[1][2], roomType[1], true, true, true, true, true);

        hotel7 = new Hotel(getString(R.string.hotel_7), getString(R.string.hotel_7_description), getString(R.string.hotel_7_open), getString(R.string.hotel_7_address),
                8989998, "Hotel", 80, gallery[1], gallery[2][0], roomType[1], true, true, true, true, true);

        hotel8 = new Hotel(getString(R.string.hotel_8), getString(R.string.hotel_8_description), getString(R.string.hotel_8_open), getString(R.string.hotel_8_address),
                8989098, "Hotel", 80, gallery[2], gallery[2][1], roomType[1], true, true, true, true, true);


        // NightClubs
        nightClub1 = new Nightclub("Nightclub 1", "Nightclub 1 description", "Open 24/7", "Address for Nightclub 1",
                8989098, "Nightclub", 10, gallery[0], gallery[0][0], true, true, true);

        nightClub2 = new Nightclub("Nightclub 2", "Nightclub 2 description", "Open 24/7", "Address for Nightclub 2",
                8989098, "Nightclub", 10, gallery[1], gallery[0][2], true, true, true);

        nightClub3 = new Nightclub("Nightclub 3", "Nightclub 3 description", "Open 24/7", "Address for Nightclub 3",
                8989098, "Nightclub", 10, gallery[2], gallery[4][2], true, true, true);

        nightClub4 = new Nightclub("Nightclub 4", "Nightclub 4 description", "Open 24/7", "Address for Nightclub 4",
                8989098, "Nightclub", 10, gallery[3], gallery[3][1], true, true, true);

        nightClub5 = new Nightclub("Nightclub 5", "Nightclub 5 description", "Open 24/7", "Address for Nightclub 5",
                8989098, "Nightclub", 10, gallery[4], gallery[5][2], true, true, true);

        nightClub6 = new Nightclub("Nightclub 6", "Nightclub 6 description", "Open 24/7", "Address for Nightclub 6",
                8989098, "Nightclub", 10, gallery[5], gallery[5][1], true, true, true);

        nightClub7 = new Nightclub("Nightclub 7", "Nightclub 7 description", "Open 24/7", "Address for Nightclub 7",
                8989098, "Nightclub", 10, gallery[1], gallery[3][0], true, true, true);

        nightClub8 = new Nightclub("Nightclub 8", "Nightclub 8 description", "Open 24/7", "Address for Nightclub 8",
                8989098, "Nightclub", 10, gallery[2], gallery[0][1], true, true, true);

        // Beaches
        beach1 = new Beach("Other Place 1", "Other Place 1 description", "Open 24/7", "Address for Other Place 1",
                1989098, "Beach", 5, gallery[2], gallery[0][1]);

        beach2 = new Beach("Other Place 2", "Other Place 2 description", "Open 24/7", "Address for Other Place 2",
                2989098, "Beach", 6, gallery[2], gallery[0][1]);

        beach3 = new Beach("Other Place 3", "Other Place 3 description", "Open 24/7", "Address for Other Place 3",
                3989098, "Beach", 7, gallery[2], gallery[0][1]);

        beach4 = new Beach("Other Place 4", "Other Place 4 description", "Open 24/7", "Address for Other Place 4",
                4989098, "Beach", 8, gallery[2], gallery[0][1]);

        beach5 = new Beach("Beach 1", "Beach 5 description", "Open 24/7", "Address for Beach 1",
                5989098, "Beach", 9, gallery[2], gallery[0][1]);

        beach6 = new Beach("Beach 2", "Beach 6 description", "Open 24/7", "Address for Beach 2",
                6989098, "Beach", 0, gallery[2], gallery[0][1]);

        beach7 = new Beach("Beach 3", "Beach 7 description", "Open 24/7", "Address for Beach 3",
                7989098, "Beach", 1, gallery[2], gallery[0][1]);

        beach8 = new Beach("Beach 4", "Beach 8 description", "Open 24/7", "Address for Beach 4",
                8989091, "Beach", 3, gallery[2], gallery[0][1]);


        // Restaurants
        restaurant1 = new Restaurant("Restaurant 1", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 1", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

        restaurant2 = new Restaurant("Restaurant 2", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 2", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

        restaurant3 = new Restaurant("Restaurant 3", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 3", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

        restaurant4 = new Restaurant("Restaurant 4", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 4", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

        restaurant5 = new Restaurant("Restaurant 5", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 5", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

        restaurant6 = new Restaurant("Restaurant 6", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 6", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

        restaurant7 = new Restaurant("Restaurant 7", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 7", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");

        restaurant8 = new Restaurant("Restaurant 8", "Restaurant 1 description", "Open 24/7",
                "Address for Restaurant 8", 2349091, "Restaurant", 25, gallery[2], gallery[0][1], "Mexican, Asian, Seafood",
                "Fish, Sushi, BBQ, Rice", true, "Cuisine details", "Call or email for reservations.");


        // Transportation
        transportation1 = new Transportation("Taxi", "The taxi is available - details",
                "The price are 20 per km.", R.drawable.place1, "Transportation");

        transportation2 = new Transportation("Public Bus", "The Bus is available - details",
                "The price are 20 per km.", R.drawable.place2, "Transportation");

        transportation3 = new Transportation("Train", "The Train is available - details",
                "The price are 20 per km.", R.drawable.place3, "Transportation");

        transportation4 = new Transportation("Train", "The Train is available - details",
                "The price are 20 per km.", R.drawable.place4, "Transportation");

        transportation5 = new Transportation("Public Bus", "The Public Bus is available - details",
                "The price are 20 per km.", R.drawable.place5, "Transportation");

        transportation6 = new Transportation("Bus", "The Bus is available - details",
                "The price are 20 per km.", R.drawable.place6, "Transportation");

        transportation7 = new Transportation("Bikes", "The Bikes is available - details",
                "The price are 20 per km.", R.drawable.place7, "Transportation");

        transportation8 = new Transportation("Bus", "The Bus is available - details",
                "The price are 20 per km.", R.drawable.place8, "Transportation");
        //============================Dummy Content=====================================//
        //============================Dummy Content=====================================//
        //============================Dummy Content=====================================//


        fragmentManager = getFragmentManager();

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        List<Place> placesList = getObjectsList(mSharedPreferences.getString(TYPE_KEY, "All"));
        adapter = new PlacesAdapter(getActivity().getApplicationContext(), placesList, fragmentManager);

        // The GridLayout is used for displaying content instead of default list.
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator()); // use default animation.
        recyclerView.setAdapter(adapter);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//
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

    // Add objects to array and return array from the method.
    public List<Place> getObjectsList(String placeType) {

        switch (placeType) {
            case "All":
                addAirports();
                addBeaches();
                addEmergencies();
                addHotels();
                addNightclubs();
                addRestaurants();
                addTransportation();
                break;
            case "Airport":
                addAirports();
                break;
            case "Emergency":
                addEmergencies();
                break;
            case "Hotel":
                addHotels();
                break;
            case "Nightclub":
                addNightclubs();
                break;
            case "Beach":
                addBeaches();
                break;
            case "Restaurant":
                addRestaurants();
                break;
            case "Transportation":
                addTransportation();
                break;

            default:
        }
        return objectsList;
    }

    // Add Airports
    void addAirports() {
        objectsList.add(airport1);
        objectsList.add(airport2);
        objectsList.add(airport3);
        objectsList.add(airport4);
        objectsList.add(airport5);
        objectsList.add(airport6);
        objectsList.add(airport7);
        objectsList.add(airport8);
    }

    // Add Emergencies
    void addEmergencies() {
        objectsList.add(emergency1);
        objectsList.add(emergency2);
        objectsList.add(emergency3);
        objectsList.add(emergency4);
        objectsList.add(emergency5);
        objectsList.add(emergency6);
    }

    // Add Hotels
    void addHotels() {
        objectsList.add(hotel1);
        objectsList.add(hotel2);
        objectsList.add(hotel3);
        objectsList.add(hotel4);
        objectsList.add(hotel5);
        objectsList.add(hotel6);
        objectsList.add(hotel7);
        objectsList.add(hotel8);
    }

    // Add NightClubs
    void addNightclubs() {
        objectsList.add(nightClub1);
        objectsList.add(nightClub2);
        objectsList.add(nightClub3);
        objectsList.add(nightClub4);
        objectsList.add(nightClub5);
        objectsList.add(nightClub6);
        objectsList.add(nightClub7);
        objectsList.add(nightClub8);
    }

    // Add Beaches
    void addBeaches() {
        objectsList.add(beach1);
        objectsList.add(beach2);
        objectsList.add(beach3);
        objectsList.add(beach4);
        objectsList.add(beach5);
        objectsList.add(beach6);
        objectsList.add(beach7);
        objectsList.add(beach8);
    }

    // Add Restaurants
    void addRestaurants() {
        objectsList.add(restaurant1);
        objectsList.add(restaurant2);
        objectsList.add(restaurant3);
        objectsList.add(restaurant4);
        objectsList.add(restaurant5);
        objectsList.add(restaurant6);
        objectsList.add(restaurant7);
        objectsList.add(restaurant8);
    }

    // Add Transportation
    void addTransportation() {
        objectsList.add(transportation1);
        objectsList.add(transportation2);
        objectsList.add(transportation3);
        objectsList.add(transportation4);
        objectsList.add(transportation5);
        objectsList.add(transportation6);
        objectsList.add(transportation7);
        objectsList.add(transportation8);
    }
    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//
    //============================Dummy Content=====================================//
}
