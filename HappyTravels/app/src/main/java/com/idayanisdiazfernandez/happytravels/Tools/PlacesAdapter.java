package com.idayanisdiazfernandez.happytravels.Tools;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.idayanisdiazfernandez.happytravels.AirportFragment;
import com.idayanisdiazfernandez.happytravels.BeachFragment;
import com.idayanisdiazfernandez.happytravels.HotelFragment;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.NightClubFragment;
import com.idayanisdiazfernandez.happytravels.R;
import com.idayanisdiazfernandez.happytravels.EmergencyFragment;
import com.idayanisdiazfernandez.happytravels.RestaurantFragment;
import com.idayanisdiazfernandez.happytravels.TransportationFragment;

import java.util.List;

/**
 * Created by MaihanNijat on 2016-11-22.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {
    FragmentManager fragmentManager = null;

    public static final String ARG_PLACE = "place";


    // Create variables
    private Context mContext;
    private List<Place> placeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }

    public PlacesAdapter(Context mContext, List<Place> placeList, FragmentManager fragmentManager) {
        this.mContext = mContext;
        this.placeList = placeList;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.place_card, parent, false);

        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Place place = placeList.get(position);
        holder.title.setText(place.getName());


        // loading place cover using Glide library
        holder.thumbnail.setImageResource(place.getThumbnail());

        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = fragmentManager.beginTransaction();

                // Pass object to fragments.
                Bundle bundle = new Bundle();
                bundle.putParcelable(ARG_PLACE, place);

                if (place.getPlaceType() == "Hotel") {
                    // Instantiate HotelFragment and set bundle as argument.
                    Fragment hotelFragment = new HotelFragment();
                    hotelFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, hotelFragment);
                    ft.addToBackStack("tag").commit();
                } else if (place.getPlaceType() == "Beach") {
                    // Instantiate BeachFragment and set bundle as argument.
                    Fragment beachFragment = new BeachFragment();
                    beachFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, beachFragment);
                    ft.addToBackStack("tag").commit();
                } else if (place.getPlaceType() == "Restaurant") {
                    // Instantiate BeachFragment and set bundle as argument.
                    Fragment restaurantFragment = new RestaurantFragment();
                    restaurantFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, restaurantFragment);
                    ft.addToBackStack("tag").commit();
                } else if (place.getPlaceType() == "Nightclub") {
                    // Instantiate BeachFragment and set bundle as argument.
                    Fragment nightClubFragment = new NightClubFragment();
                    nightClubFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, nightClubFragment);
                    ft.addToBackStack("tag").commit();
                } else if (place.getPlaceType() == "Airport") {
                    // Instantiate AirportFragment and set bundle as argument.
                    Fragment airFragment = new AirportFragment();
                    airFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout,  airFragment);
                    ft.addToBackStack("tag").commit();
                } else if (place.getPlaceType() == "Transportation") {
                    // Instantiate BeachFragment and set bundle as argument.
                    Fragment transportationFragment = new TransportationFragment();
                    transportationFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, transportationFragment);
                    ft.addToBackStack("tag").commit();
                } else if (place.getPlaceType() == "Emergency") {
                    // Instantiate BeachFragment and set bundle as argument.
                    Fragment emergencyFragment = new EmergencyFragment();
                    emergencyFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, emergencyFragment);
                    ft.addToBackStack("tag").commit();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }
}
