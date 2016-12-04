package com.idayanisdiazfernandez.happytravels;

import android.content.Intent;
import android.os.Parcelable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.idayanisdiazfernandez.happytravels.Models.Hotel;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.Tools.GalleryFragmentPager;

import java.io.Serializable;

import static com.idayanisdiazfernandez.happytravels.Tools.PlacesAdapter.ARG_PLACE;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HotelFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HotelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Hotel mPlace;

    private OnFragmentInteractionListener mListener;

    public HotelFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HotelFragment.
     */
    public static HotelFragment newInstance(Parcelable mParam) {
        HotelFragment fragment = new HotelFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PLACE, mParam);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mPlace = getArguments().getParcelable(ARG_PLACE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);

        ImageButton emailButton = (ImageButton) view.findViewById(R.id.emailImageButton);
        ImageButton webButton = (ImageButton) view.findViewById(R.id.webImageButton);
        ImageButton mapButton = (ImageButton) view.findViewById(R.id.locationImageButton);
        ImageButton shareButton = (ImageButton) view.findViewById(R.id.shareImageButton);
        ImageButton callButton = (ImageButton) view.findViewById(R.id.callImageButton);
        ImageButton galleryButton = (ImageButton) view.findViewById(R.id.photoImageButton);

        emailButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String[]emailAddresses = {"idayanis.diazfernandez53@stclairconnect.ca"};
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,emailAddresses);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        webButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://www.holguincuba.net/hotels.html");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(webpage);
                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        mapButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Uri geolocation = Uri.parse("geo:0,0?q=@21.1138117,-75.913768,13z(Hotel Location)");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geolocation);

                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent);

                }
                else{
                    Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No instaled software to complete the task", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                }

            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"));
                intent.putExtra("sms_body", " " );

                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(intent );
                }
                else{
                    Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No instaled software to complete the task", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                }

            }
        });

        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.slide_out);
                fragmentTransaction.replace(R.id.mainFragmenLayout, GalleryFragmentPager.newInstance(mPlace))
                        .addToBackStack("tag").commit();
            }
        });


        callButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "Your Phone_number"));
                startActivity(intent);

            }
        });


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
}
