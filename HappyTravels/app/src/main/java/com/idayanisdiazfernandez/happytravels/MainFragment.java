package com.idayanisdiazfernandez.happytravels;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    // Create RecycleView, PlaceAdapter and List variables
    private RecyclerView recyclerView;
    private PlacesAdapter adapter;
    private List<Place> placeList;

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

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        placeList = new ArrayList<>();
        adapter = new PlacesAdapter(getActivity().getApplicationContext(), placeList);

        // The GridLayout is used for displaying content instead of default list.
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator()); // use default animation.
        recyclerView.setAdapter(adapter);

        // Initialize places
        initPlaces();

        try {
            Glide.with(getActivity().getApplicationContext()).load(R.drawable.place1).into((ImageView) view.findViewById(R.id.backdrop));
        } catch (Exception e){
            e.printStackTrace();
        }

        return view;
    }

    /**
     * Adding few albums for testing
     */
    private void initPlaces() {
        int[] covers = new int[]{
                R.drawable.place1,
                R.drawable.place2,
                R.drawable.place3,
                R.drawable.place4,
                R.drawable.place5,
                R.drawable.place6,
                R.drawable.place7,
                R.drawable.place8,
                R.drawable.place9,
                R.drawable.place10,
                R.drawable.place11};

        Place a = new Place("True Romance", 13, covers[0]);
        placeList.add(a);

        a = new Place("Xscpae", 8, covers[1]);
        placeList.add(a);

        a = new Place("Maroon 5", 11, covers[2]);
        placeList.add(a);

        a = new Place("Born to Die", 12, covers[3]);
        placeList.add(a);

        a = new Place("Honeymoon", 14, covers[4]);
        placeList.add(a);

        a = new Place("I Need a Doctor", 1, covers[5]);
        placeList.add(a);

        a = new Place("Loud", 11, covers[6]);
        placeList.add(a);

        a = new Place("Legend", 14, covers[7]);
        placeList.add(a);

        a = new Place("Hello", 11, covers[8]);
        placeList.add(a);

        a = new Place("Greatest Hits", 17, covers[9]);
        placeList.add(a);

        adapter.notifyDataSetChanged();
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
