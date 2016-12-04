package com.idayanisdiazfernandez.happytravels.Tools;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.idayanisdiazfernandez.happytravels.GalleryFragment;
import com.idayanisdiazfernandez.happytravels.Models.Place;
import com.idayanisdiazfernandez.happytravels.R;

import static com.idayanisdiazfernandez.happytravels.Tools.PlacesAdapter.ARG_PLACE;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GalleryFragmentPager.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GalleryFragmentPager#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragmentPager extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Place mPlace;

    private OnFragmentInteractionListener mListener;

    public GalleryFragmentPager() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     */
    public static GalleryFragmentPager newInstance(Place mParam) {
        GalleryFragmentPager fragment = new GalleryFragmentPager();
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
        View view = inflater.inflate(R.layout.fragment_gallery_pager, container, false);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getActivity().getSupportFragmentManager());
        mViewPager = (ViewPager) view.findViewById(R.id.viewPager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        ImageButton nextButton = (ImageButton) view.findViewById(R.id.nextButton);
        ImageButton prevButton = (ImageButton) view.findViewById(R.id.prevButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager.setCurrentItem((mViewPager.getCurrentItem()+1), true);
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager.setCurrentItem((mViewPager.getCurrentItem()-1), true);
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
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return GalleryFragment.newInstance(mPlace.getPhotos()[position]);

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }

}
