package com.idayanisdiazfernandez.happytravels;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by MaihanNijat on 2016-11-22.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {
    FragmentManager fragmentManager = null;


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
                //FragmentManager fm = (((Activity)mContext).getFragmentManager());
                FragmentTransaction ft = fragmentManager.beginTransaction();

                if(place.getPlaceType() == "hotel") {
                    ft.replace(R.id.mainFragmenLayout, new hotelFragment());
                    ft.addToBackStack("tag").commit();
                } else if(place.getPlaceType() == "beach"){
                   ft.replace(R.id.mainFragmenLayout, new beachFragment());
                    ft.addToBackStack("tag").commit();
                }else if(place.getPlaceType() == "restaurant"){
                    ft.replace(R.id.mainFragmenLayout, new restaurantsFragment());
                    ft.addToBackStack("tag").commit();

                }else if (place.getPlaceType() == "nightClub"){
                    ft.replace(R.id.mainFragmenLayout, new clubsFragments());
                    ft.addToBackStack("tag").commit();

                }else if (place.getPlaceType() == "airport"){
                    ft.replace(R.id.mainFragmenLayout, new airportFragment());
                    ft.addToBackStack("tag").commit();

                }else if (place.getPlaceType() == "transportation"){
                    ft.replace(R.id.mainFragmenLayout, new trasportationFragment());
                    ft.addToBackStack("tag").commit();

                }else if (place.getPlaceType() == "emergency"){
                    ft.replace(R.id.mainFragmenLayout, new emergencyFragment());
                    ft.addToBackStack("tag").commit();

                }else if (place.getPlaceType() ==  "place"){
                    ft.replace(R.id.mainFragmenLayout, new placeFragment());
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
