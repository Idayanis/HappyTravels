package com.idayanisdiazfernandez.happytravels;

import android.content.Intent;
import android.os.Parcelable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.idayanisdiazfernandez.happytravels.Models.Restaurant;
import com.idayanisdiazfernandez.happytravels.Tools.GalleryFragmentPager;

import static com.idayanisdiazfernandez.happytravels.Tools.PlacesAdapter.ARG_PLACE;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RestaurantFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RestaurantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Restaurant mPlace;

    private OnFragmentInteractionListener mListener;

    public RestaurantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment RestaurantFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantFragment newInstance(Parcelable mParam) {
        RestaurantFragment fragment = new RestaurantFragment();
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
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        /**
         * Set content to text boxes.
         * Set cover image.
         */
        ImageView coverPhoto = (ImageView) view.findViewById(R.id.coverPhoto);
        coverPhoto.setImageResource(mPlace.getCover());

        TextView nameText = (TextView) view.findViewById(R.id.nameText);
        nameText.setText(mPlace.getName());

        TextView descriptionText = (TextView) view.findViewById(R.id.descriptionText);
        descriptionText.setText(mPlace.getDescription());

        TextView timingText = (TextView) view.findViewById(R.id.timingText);
        timingText.setText(getString(R.string.open_time) + ": " + mPlace.getTiming());

        TextView priceText = (TextView) view.findViewById(R.id.priceText);
        priceText.setText(getString(R.string.price) + ": " + String.valueOf(mPlace.getPrice()));

        TextView TypeOfFoodText = (TextView) view.findViewById(R.id.TypeOfFoodText);
        TypeOfFoodText.setText(getString(R.string.food_type) + ": " + mPlace.getTypeOfFood());

        TextView menuListText = (TextView) view.findViewById(R.id.menuListText);
        menuListText.setText(getString(R.string.menu_list) + ": " + mPlace.getMenuList());

        TextView drinkText = (TextView) view.findViewById(R.id.drinkText);
        if(mPlace.getDrink() == true) {
            drinkText.setText(getString(R.string.drink_text) + ": " + getString(R.string.no));
        } else {
            drinkText.setText(getString(R.string.drink_text) + ": " + getString(R.string.no));
        }

        TextView cuisineText = (TextView) view.findViewById(R.id.cuisineText);
        cuisineText.setText(getString(R.string.cuisine_text) + ": " + mPlace.getCuisine());

        TextView reservationsText = (TextView) view.findViewById(R.id.reservationsText);
        reservationsText.setText(getString(R.string.reservation_text) + ": " + mPlace.getReservations());

        TextView addressText = (TextView) view.findViewById(R.id.addressText);
        addressText.setText(mPlace.getAddress());

        TextView phoneNumber = (TextView) view.findViewById(R.id.phoneNumber);
        phoneNumber.setText((getString(R.string.phone) + ": " + mPlace.getPhoneNumber()));

        TextView emailAddress = (TextView) view.findViewById(R.id.emailAddress);
        emailAddress.setText(mPlace.getEmail());

        TextView webPage = (TextView) view.findViewById(R.id.webPage);
        webPage.setText(mPlace.getWebPage());

        /**
         *  Find the ImageButtons and set OnClick listener
         */
        ImageButton emailButton = (ImageButton) view.findViewById(R.id.emailImageButton);
        emailButton.setOnClickListener(RestaurantFragment.this);

        ImageButton webButton = (ImageButton) view.findViewById(R.id.webImageButton);
        webButton.setOnClickListener(RestaurantFragment.this);

        ImageButton mapButton = (ImageButton) view.findViewById(R.id.locationImageButton);
        mapButton.setOnClickListener(RestaurantFragment.this);

        ImageButton shareButton = (ImageButton) view.findViewById(R.id.shareImageButton);
        shareButton.setOnClickListener(RestaurantFragment.this);

        ImageButton callButton = (ImageButton) view.findViewById(R.id.callImageButton);
        callButton.setOnClickListener(RestaurantFragment.this);

        ImageButton photoButton = (ImageButton) view.findViewById(R.id.photoImageButton);
        photoButton.setOnClickListener(RestaurantFragment.this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.emailImageButton:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Checkout this place! " + mPlace.getName() + " " + mPlace.getAddress()
                        + mPlace.getPhoneNumber());
                emailIntent.putExtra(Intent.EXTRA_EMAIL, mPlace.getEmail());

                if (emailIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(emailIntent);
                } else {
                    Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No installed application to complete the task", Snackbar.LENGTH_SHORT).show();
                }
                break;

            case R.id.webImageButton:
                String webPage = "http://" + mPlace.getWebPage();
                Intent webIntent  = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(webPage));
                if (webIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(webIntent);
                } else {
                    Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No installed application to complete the task", Snackbar.LENGTH_SHORT).show();
                }                break;

            case R.id.locationImageButton:
                Uri geolocation = Uri.parse("geo:0,0?q=@"+mPlace.getGeoCode());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(geolocation);
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No installed application to complete the task", Snackbar.LENGTH_SHORT).show();
                }
                break;

            case R.id.shareImageButton:
                Intent shareIntent = new Intent(Intent.ACTION_SENDTO);
                //intent.setType("text/plain");
                shareIntent.setData(Uri.parse("smsto:"));
                shareIntent.putExtra("sms_body", "Checkout this place! " + mPlace.getName() + " " + mPlace.getAddress()
                        + mPlace.getPhoneNumber());
                if (shareIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(shareIntent);
                } else {
                    Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No installed application to complete the task", Snackbar.LENGTH_SHORT).show();
                }
                break;

            case R.id.callImageButton:
                Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mPlace.getPhoneNumber()));
                if (callIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(callIntent);
                } else {
                    Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No installed application to complete the task", Snackbar.LENGTH_SHORT).show();
                }
                break;

            case R.id.photoImageButton:
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.slide_in, R.anim.slide_out);
                fragmentTransaction.replace(R.id.mainFragmenLayout, GalleryFragmentPager.newInstance(mPlace))
                        .addToBackStack("tag").commit();
                break;

            default:
                break;
        }
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
