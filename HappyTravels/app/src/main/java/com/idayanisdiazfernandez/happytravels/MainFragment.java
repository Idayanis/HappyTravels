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
                "789878787", getContext().getString(R.string.airport), 0, slideShowPhotos[13], R.drawable.a_thumb1, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover1);

        airport2 = new Airport(getString(R.string.airport_2), getString(R.string.airport_2_description), getString(R.string.open), getString(R.string.address_2),
                "789844787", getString(R.string.airport), 0, slideShowPhotos[12], R.drawable.a_thumb2, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover2);

        airport3 = new Airport(getString(R.string.airport_3), getString(R.string.airport_3_description), getString(R.string.open), getString(R.string.address_3),
                "789844787", getString(R.string.airport), 0, slideShowPhotos[13], R.drawable.a_thumb3, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover3);

        airport4 = new Airport(getString(R.string.airport_4), getString(R.string.airport_4_description), getString(R.string.open), getString(R.string.address_4),
                "789844787", getString(R.string.airport), 0, slideShowPhotos[14], R.drawable.a_thumb4, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover4);

        airport5 = new Airport(getString(R.string.airport_5), getString(R.string.airport_5_description), getString(R.string.open), getString(R.string.address_5),
                "789844787", getString(R.string.airport), 0, slideShowPhotos[12], R.drawable.a_thumb5, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover5);

        airport6 = new Airport(getString(R.string.airport_6), getString(R.string.airport_6_description), getString(R.string.open), getString(R.string.address_6),
                "789844787", getString(R.string.airport), 0, slideShowPhotos[13], R.drawable.a_thumb6, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover6);

        airport7 = new Airport(getString(R.string.airport_7), getString(R.string.airport_7_description), getString(R.string.open), getString(R.string.address_7),
                "789844787", getString(R.string.airport), 0, slideShowPhotos[14], R.drawable.a_thumb7, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover7);

        airport8 = new Airport(getString(R.string.airport_8), getString(R.string.airport_8_description), getString(R.string.open), getString(R.string.address_8),
                "789844787", getString(R.string.airport), 0, slideShowPhotos[12], R.drawable.a_thumb8, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.flights), R.drawable.a_cover8);


        // Emergency
        emergency1 = new Emergency(getString(R.string.emergency_1), getString(R.string.police), "789844787", getString(R.string.open), getString(R.string.emergency_1_address), getString(R.string.emergency), R.drawable.e_thumb1, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.e_cover1);
        emergency2 = new Emergency(getString(R.string.emergency_2), getString(R.string.fire_department), "789844787", getString(R.string.open), getString(R.string.emergency_2_address), getString(R.string.emergency), R.drawable.e_thumb2, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.e_cover2);
        emergency3 = new Emergency(getString(R.string.emergency_3), getString(R.string.hospital_a), "789844787", getString(R.string.open), getString(R.string.emergency_3_address), getString(R.string.emergency), R.drawable.e_thumb3, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.e_cover3);
        emergency4 = new Emergency(getString(R.string.emergency_4), getString(R.string.hospital_b), "789844787", getString(R.string.open), getString(R.string.emergency_4_address), getString(R.string.emergency), R.drawable.e_thumb4, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.e_cover4);
        emergency5 = new Emergency(getString(R.string.emergency_5), getString(R.string.ambulance_a), "789844787", getString(R.string.open), getString(R.string.emergency_5_address), getString(R.string.emergency), R.drawable.e_thumb5, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.e_cover5);
        emergency6 = new Emergency(getString(R.string.emergency_6), getString(R.string.ambulance_b), "789844787", getString(R.string.open), getString(R.string.emergency_6_address), getString(R.string.emergency), R.drawable.e_thumb6, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.e_cover6);

        // Hotel
        String[] roomType = {"Single", "Double", "Single, Double", "Single, Double, Studio"};

        hotel1 = new Hotel(getString(R.string.hotel_1), getString(R.string.hotel_1_description), getString(R.string.open), getString(R.string.hotel_1_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[0], R.drawable.h_thumb1, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover1);

        hotel2 = new Hotel(getString(R.string.hotel_2), getString(R.string.hotel_2_description), getString(R.string.open), getString(R.string.hotel_2_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[1], R.drawable.h_thumb2, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover2);

        hotel3 = new Hotel(getString(R.string.hotel_3), getString(R.string.hotel_3_description), getString(R.string.open), getString(R.string.hotel_3_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[2], R.drawable.h_thumb3, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover3);

        hotel4 = new Hotel(getString(R.string.hotel_4), getString(R.string.hotel_4_description), getString(R.string.open), getString(R.string.hotel_4_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[0], R.drawable.h_thumb4, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover4);

        hotel5 = new Hotel(getString(R.string.hotel_5), getString(R.string.hotel_5_description), getString(R.string.open), getString(R.string.hotel_5_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[1], R.drawable.h_thumb5, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover5);

        hotel6 = new Hotel(getString(R.string.hotel_6), getString(R.string.hotel_6_description), getString(R.string.open), getString(R.string.hotel_6_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[2], R.drawable.h_thumb6, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover6);

        hotel7 = new Hotel(getString(R.string.hotel_7), getString(R.string.hotel_7_description), getString(R.string.open), getString(R.string.hotel_7_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[0], R.drawable.h_thumb7, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover7);

        hotel8 = new Hotel(getString(R.string.hotel_8), getString(R.string.hotel_8_description), getString(R.string.open), getString(R.string.hotel_8_address),
                "789844787", getString(R.string.hotel), 80, slideShowPhotos[2], R.drawable.h_thumb8, "42.246696, -83.018326", "info@example.com", "www.example.com", roomType[1], true, true, true, true, true, R.drawable.h_cover8);


        // NightClubs
        nightClub1 = new Nightclub(getString(R.string.nightclub_1), getString(R.string.nightclub_1_description), getString(R.string.open), getString(R.string.nightclub_1_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[9], R.drawable.n_thumb1, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.n_cover1);

        nightClub2 = new Nightclub(getString(R.string.nightclub_2), getString(R.string.nightclub_2_description), getString(R.string.open), getString(R.string.nightclub_2_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[10], R.drawable.n_thumb2, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.h_cover2);

        nightClub3 = new Nightclub(getString(R.string.nightclub_3), getString(R.string.nightclub_3_description), getString(R.string.open), getString(R.string.nightclub_3_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[11], R.drawable.n_thumb3, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.h_cover3);

        nightClub4 = new Nightclub(getString(R.string.nightclub_4), getString(R.string.nightclub_4_description), getString(R.string.open), getString(R.string.nightclub_4_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[9], R.drawable.n_thumb4, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.h_cover4);

        nightClub5 = new Nightclub(getString(R.string.nightclub_5), getString(R.string.nightclub_5_description), getString(R.string.open), getString(R.string.nightclub_5_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[10], R.drawable.n_thumb5, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.h_cover5);

        nightClub6 = new Nightclub(getString(R.string.nightclub_6), getString(R.string.nightclub_6_description), getString(R.string.open), getString(R.string.nightclub_6_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[11], R.drawable.n_thumb6, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.h_cover6);

        nightClub7 = new Nightclub(getString(R.string.nightclub_7), getString(R.string.nightclub_7_description), getString(R.string.open), getString(R.string.nightclub_7_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[9], R.drawable.n_thumb7, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.h_cover7);

        nightClub8 = new Nightclub(getString(R.string.nightclub_8), getString(R.string.nightclub_8_description), getString(R.string.open), getString(R.string.nightclub_8_address),
                "789844787", getString(R.string.nightclub), 10, slideShowPhotos[10], R.drawable.n_thumb8, "42.246696, -83.018326", "info@example.com", "www.example.com", true, true, true, R.drawable.h_cover8);

        // Beaches
        beach1 = new Beach(getString(R.string.beach_1), getString(R.string.beach_1_description), getString(R.string.open), getString(R.string.beach_1_address),
                "789844787", getString(R.string.beach), 5, slideShowPhotos[6], R.drawable.b_thumb1, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover1);

        beach2 = new Beach(getString(R.string.beach_2), getString(R.string.beach_2_description), getString(R.string.open), getString(R.string.beach_2_address),
                "789844787", getString(R.string.beach), 6, slideShowPhotos[7], R.drawable.b_thumb2, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover2);

        beach3 = new Beach(getString(R.string.beach_3), getString(R.string.beach_3_description), getString(R.string.open), getString(R.string.beach_3_address),
                "789844787", getString(R.string.beach), 7, slideShowPhotos[8], R.drawable.b_thumb3, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover3);

        beach4 = new Beach(getString(R.string.beach_4), getString(R.string.beach_4_description), getString(R.string.open), getString(R.string.beach_4_address),
                "789844787", getString(R.string.beach), 8, slideShowPhotos[6], R.drawable.b_thumb4, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover4);

        beach5 = new Beach(getString(R.string.beach_5), getString(R.string.beach_5_description), getString(R.string.open), getString(R.string.beach_5_address),
                "789844787", getString(R.string.beach), 9, slideShowPhotos[7], R.drawable.b_thumb5, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover5);

        beach6 = new Beach(getString(R.string.beach_6), getString(R.string.beach_6_description), getString(R.string.open), getString(R.string.beach_6_address),
                "789844787", getString(R.string.beach), 0, slideShowPhotos[8], R.drawable.b_thumb7, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover6);

        beach7 = new Beach(getString(R.string.beach_7), getString(R.string.beach_7_description), getString(R.string.open), getString(R.string.beach_7_address),
                "789844787", getString(R.string.beach), 1, slideShowPhotos[6], R.drawable.b_thumb8, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover7);

        beach8 = new Beach(getString(R.string.beach_8), getString(R.string.beach_8_description), getString(R.string.open), getString(R.string.beach_8_address),
                "789844787", getString(R.string.beach), 3, slideShowPhotos[7], R.drawable.b_thumb1, "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.b_cover8);


        // Restaurants
        restaurant1 = new Restaurant(getString(R.string.restaurant_1), getString(R.string.restaurant_1_description), getString(R.string.open),
                getString(R.string.restaurant_1_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[3], R.drawable.r_thumb1, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover1);

        restaurant2 = new Restaurant(getString(R.string.restaurant_2), getString(R.string.restaurant_2_description), getString(R.string.open),
                getString(R.string.restaurant_2_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[4], R.drawable.r_thumb2, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover2);

        restaurant3 = new Restaurant(getString(R.string.restaurant_3), getString(R.string.restaurant_3_description), getString(R.string.open),
                getString(R.string.restaurant_3_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[5], R.drawable.r_thumb3, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover3);

        restaurant4 = new Restaurant(getString(R.string.restaurant_4), getString(R.string.restaurant_4_description), getString(R.string.open),
                getString(R.string.restaurant_4_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[3], R.drawable.r_thumb4, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover4);

        restaurant5 = new Restaurant(getString(R.string.restaurant_5), getString(R.string.restaurant), getString(R.string.open),
                getString(R.string.restaurant_5_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[4], R.drawable.r_thumb5, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover5);

        restaurant6 = new Restaurant(getString(R.string.restaurant_6), getString(R.string.restaurant_6_description), getString(R.string.open),
                getString(R.string.restaurant_6_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[5], R.drawable.r_thumb6, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover6);

        restaurant7 = new Restaurant(getString(R.string.restaurant_7), getString(R.string.restaurant_7_description), getString(R.string.open),
                getString(R.string.restaurant_7_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[3], R.drawable.r_thumb7, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover7);

        restaurant8 = new Restaurant(getString(R.string.restaurant_8), getString(R.string.restaurant_8_description), getString(R.string.open),
                getString(R.string.restaurant_8_address), "789844787", getString(R.string.restaurant), 25, slideShowPhotos[4], R.drawable.r_thumb8, "42.246696, -83.018326", "info@example.com", "www.example.com", getString(R.string.foodType),
                getString(R.string.menu), true, getString(R.string.cuisine), getString(R.string.reservation), R.drawable.r_cover8);


        // Transportation
        transportation1 = new Transportation(getString(R.string.taxi), getString(R.string.taxi_availability),
                getString(R.string.transport_price), R.drawable.t_thumb1, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover1);

        transportation2 = new Transportation(getString(R.string.bus), getString(R.string.bus_availability),
                getString(R.string.transport_price), R.drawable.t_thumb2, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover2);

        transportation3 = new Transportation(getString(R.string.train), getString(R.string.train_availability),
                getString(R.string.transport_price), R.drawable.t_thumb3, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover3);

        transportation4 = new Transportation(getString(R.string.train), getString(R.string.train_availability),
                getString(R.string.transport_price), R.drawable.t_thumb4, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover4);

        transportation5 = new Transportation(getString(R.string.bus), getString(R.string.bus_availability),
                getString(R.string.transport_price), R.drawable.t_thumb5, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover5);

        transportation6 = new Transportation(getString(R.string.bus), getString(R.string.bus_availability),
                getString(R.string.transport_price), R.drawable.t_thumb6, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover6);

        transportation7 = new Transportation(getString(R.string.bike), getString(R.string.bike_availability),
                getString(R.string.transport_price), R.drawable.t_thumb7, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover7);

        transportation8 = new Transportation(getString(R.string.bus), getString(R.string.bus_availability),
                getString(R.string.transport_price), R.drawable.t_thumb8, getString(R.string.transport), getString(R.string.open), "7878787878", getString(R.string.transport_1_address), "42.246696, -83.018326", "info@example.com", "www.example.com", R.drawable.t_cover8);
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

    // Create array for photo.
    int[][] slideShowPhotos = {
            {R.drawable.h_slideshow1, R.drawable.h_slideshow2, R.drawable.h_slideshow3},
            {R.drawable.h_slideshow4, R.drawable.h_slideshow5, R.drawable.h_slideshow6},
            {R.drawable.h_slideshow7, R.drawable.h_slideshow8, R.drawable.h_slideshow9},

            {R.drawable.r_slideshow1, R.drawable.r_slideshow2, R.drawable.r_slideshow3},
            {R.drawable.r_slideshow4, R.drawable.r_slideshow5, R.drawable.r_slideshow6},
            {R.drawable.r_slideshow7, R.drawable.r_slideshow8, R.drawable.r_slideshow9},

            {R.drawable.b_slideshow1, R.drawable.b_slideshow2, R.drawable.b_slideshow3},
            {R.drawable.b_slideshow4, R.drawable.b_slideshow5, R.drawable.b_slideshow6},
            {R.drawable.b_slideshow7, R.drawable.b_slideshow8, R.drawable.b_slideshow1},

            {R.drawable.n_slideshow1, R.drawable.n_slideshow2, R.drawable.n_slideshow3},
            {R.drawable.n_slideshow4, R.drawable.n_slideshow5, R.drawable.n_slideshow6},
            {R.drawable.n_slideshow7, R.drawable.n_slideshow8, R.drawable.n_slideshow1},

            {R.drawable.a_slideshow1, R.drawable.a_slideshow2, R.drawable.a_slideshow3},
            {R.drawable.a_slideshow4, R.drawable.a_slideshow5, R.drawable.a_slideshow6},
            {R.drawable.a_slideshow7, R.drawable.a_slideshow8, R.drawable.a_slideshow1},


    };

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
