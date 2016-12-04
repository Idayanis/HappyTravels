package com.idayanisdiazfernandez.happytravels;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.idayanisdiazfernandez.happytravels.Models.Airport;
import com.idayanisdiazfernandez.happytravels.Tools.GalleryFragmentPager;

import static com.idayanisdiazfernandez.happytravels.Tools.PlacesAdapter.ARG_PLACE;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AirportFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AirportFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AirportFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Airport mPlace;

    private OnFragmentInteractionListener mListener;

    public AirportFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AirportFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AirportFragment newInstance(Parcelable mParam) {
        AirportFragment fragment = new AirportFragment();
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
        View view = inflater.inflate(R.layout.fragment_airport, container, false);

        /**
         * Set content to text boxes.
         * Set cover image.
         */
        ImageView coverPhoto = (ImageView) view.findViewById(R.id.coverPhoto);
        coverPhoto.setImageResource(mPlace.getThumbnail());

        TextView nameText = (TextView) view.findViewById(R.id.nameText);
        nameText.setText(mPlace.getName());

        TextView descriptionText = (TextView) view.findViewById(R.id.descriptionText);
        descriptionText.setText(mPlace.getDescription());

        TextView timingText = (TextView) view.findViewById(R.id.timingText);
        timingText.setText(mPlace.getTiming());

        TextView priceText = (TextView) view.findViewById(R.id.priceText);
        priceText.setText(String.valueOf(mPlace.getPrice()));

        TextView flightsText = (TextView) view.findViewById(R.id.flightsText);
        flightsText.setText(mPlace.getFlightsAvailability());

        TextView addressText = (TextView) view.findViewById(R.id.addressText);
        addressText.setText(mPlace.getAddress());

        TextView phoneNumber = (TextView) view.findViewById(R.id.phoneNumber);
        phoneNumber.setText(mPlace.getPhoneNumber());

        TextView emailAddress = (TextView) view.findViewById(R.id.emailAddress);
        emailAddress.setText(mPlace.getEmail());

        TextView webPage = (TextView) view.findViewById(R.id.webPage);
        webPage.setText(mPlace.getWebPage());

        /**
         *  Find the ImageButtons and set OnClick listener
         */
        ImageButton emailButton = (ImageButton) view.findViewById(R.id.emailImageButton);
        emailButton.setOnClickListener(AirportFragment.this);

        ImageButton webButton = (ImageButton) view.findViewById(R.id.webImageButton);
        webButton.setOnClickListener(AirportFragment.this);

        ImageButton mapButton = (ImageButton) view.findViewById(R.id.locationImageButton);
        mapButton.setOnClickListener(AirportFragment.this);

        ImageButton shareButton = (ImageButton) view.findViewById(R.id.shareImageButton);
        shareButton.setOnClickListener(AirportFragment.this);

        ImageButton callButton = (ImageButton) view.findViewById(R.id.callImageButton);
        callButton.setOnClickListener(AirportFragment.this);

        ImageButton photoButton = (ImageButton) view.findViewById(R.id.photoImageButton);
        photoButton.setOnClickListener(AirportFragment.this);

        return view;
    }

    @Override
    public void onClick(View view) {

        Intent intent = null;

        switch (view.getId()) {
            case R.id.emailImageButton:
                String emailAddresses = "idayanis.diazfernandez53@stclairconnect.ca";
                intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, emailAddresses);
                break;

            case R.id.webImageButton:
                Uri webPage = Uri.parse("http://holguin.airportcuba.net");
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(webPage);
                break;

            case R.id.locationImageButton:
                Uri geolocation = Uri.parse("geo:0,0?q=@20.785278,-76.317194,17z(Airport Location)");
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geolocation);
                break;

            case R.id.shareImageButton:
                intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Checkout " + R.string.app_name + " app!");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="
                        + getActivity().getPackageName());
                intent.createChooser(intent, "Share via");
                break;

            case R.id.callImageButton:
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "Your Phone_number"));
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
        if (view.getId() != R.id.photoImageButton) {
            if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(intent);
            } else {
                if (view.getId() == R.id.shareImageButton) {
                    intent.setData(Uri.parse("smsto:"));
                    intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Checkout " + R.string.app_name + " app!");
                    intent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="
                            + getActivity().getPackageName());
                    startActivity(intent);
                } else {
                    Snackbar.make(getActivity().findViewById(android.R.id.content),
                            "No installed application to complete the task", Snackbar.LENGTH_SHORT).show();
                }
            }
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
