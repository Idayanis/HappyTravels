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

import com.idayanisdiazfernandez.happytravels.Models.Emergency;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.Tools.GalleryFragmentPager;

import static com.idayanisdiazfernandez.happytravels.Tools.PlacesAdapter.ARG_PLACE;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EmergencyFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EmergencyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EmergencyFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Emergency mPlace;

    private OnFragmentInteractionListener mListener;

    public EmergencyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment EmergencyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EmergencyFragment newInstance(Parcelable mParam) {
        EmergencyFragment fragment = new EmergencyFragment();
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
        View view = inflater.inflate(R.layout.fragment_emergency, container, false);

        /**
         * Set content to text boxes.
         * Set cover image.
         */
        ImageView coverPhoto = (ImageView) view.findViewById(R.id.coverPhoto);
        coverPhoto.setImageResource(mPlace.getCover());

        TextView nameText = (TextView) view.findViewById(R.id.nameText);
        nameText.setText(mPlace.getName());

        TextView departmentText = (TextView) view.findViewById(R.id.departmentText);
        departmentText.setText(mPlace.getDepartment());

        TextView timingText = (TextView) view.findViewById(R.id.timingText);
        timingText.setText(getString(R.string.open_time) + ": " + mPlace.getTiming());

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
        emailButton.setOnClickListener(EmergencyFragment.this);

        ImageButton webButton = (ImageButton) view.findViewById(R.id.webImageButton);
        webButton.setOnClickListener(EmergencyFragment.this);

        ImageButton mapButton = (ImageButton) view.findViewById(R.id.locationImageButton);
        mapButton.setOnClickListener(EmergencyFragment.this);

        ImageButton shareButton = (ImageButton) view.findViewById(R.id.shareImageButton);
        shareButton.setOnClickListener(EmergencyFragment.this);

        ImageButton callButton = (ImageButton) view.findViewById(R.id.callImageButton);
        callButton.setOnClickListener(EmergencyFragment.this);

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
