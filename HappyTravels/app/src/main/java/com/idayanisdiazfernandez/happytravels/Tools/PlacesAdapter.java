package com.idayanisdiazfernandez.happytravels.Tools;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.idayanisdiazfernandez.happytravels.AirportFragment;
import com.idayanisdiazfernandez.happytravels.BeachFragment;
import com.idayanisdiazfernandez.happytravels.HotelFragment;
import com.idayanisdiazfernandez.happytravels.MainActivity;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.NightclubFragment;
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
        public TextView nameText;
        public TextView typeText;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            nameText = (TextView) view.findViewById(R.id.nameText);
            typeText = (TextView) view.findViewById(R.id.typeText);
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
        holder.nameText.setText(place.getName());
        holder.typeText.setText(place.getPlaceType());


        // loading place cover using Glide library
        holder.thumbnail.setImageResource(place.getThumbnail());

        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.setCustomAnimations(R.anim.slide_in, R.anim.slide_out);

                // Pass object to fragments.
                Bundle bundle = new Bundle();
                bundle.putParcelable(ARG_PLACE, place);

                if (place.getPlaceType() == mContext.getString(R.string.hotel)) {
                    // Instantiate HotelFragment and set bundle as argument.
                    Fragment hotelFragment = new HotelFragment();
                    hotelFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, hotelFragment);
                } else if (place.getPlaceType() == mContext.getString(R.string.beach)) {
                    Fragment beachFragment = new BeachFragment();
                    beachFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, beachFragment);
                } else if (place.getPlaceType() == mContext.getString(R.string.restaurant)) {
                    Fragment restaurantFragment = new RestaurantFragment();
                    restaurantFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, restaurantFragment);
                } else if (place.getPlaceType() == mContext.getString(R.string.nightclub)) {
                    Fragment nightClubFragment = new NightclubFragment();
                    nightClubFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, nightClubFragment);
                } else if (place.getPlaceType() == mContext.getString(R.string.airport)) {
                    Fragment airFragment = new AirportFragment();
                    airFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout,  airFragment);
                } else if (place.getPlaceType() == mContext.getString(R.string.transport)) {
                    Fragment transportationFragment = new TransportationFragment();
                    transportationFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, transportationFragment);
                } else if (place.getPlaceType() == mContext.getString(R.string.emergency)) {
                    Fragment emergencyFragment = new EmergencyFragment();
                    emergencyFragment.setArguments(bundle);
                    ft.replace(R.id.mainFragmenLayout, emergencyFragment);
                }
                ft.addToBackStack("tag").commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }
}
