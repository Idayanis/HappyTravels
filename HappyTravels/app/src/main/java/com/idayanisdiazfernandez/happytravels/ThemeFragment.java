package com.idayanisdiazfernandez.happytravels;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.idayanisdiazfernandez.happytravels.MainActivity.setStyleKey;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ThemeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ThemeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThemeFragment extends DialogFragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // Create style buttons
    Button redButton, pinkButton, purpleButton, indigoButton, blueButton, cyanButton, tealButton,
            greenButton, lightGreenButton, orangeButton, deepOrangeButton, brownButton;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ThemeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThemeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThemeFragment newInstance(String param1, String param2) {
        ThemeFragment fragment = new ThemeFragment();
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
        View view = inflater.inflate(R.layout.fragment_theme, container, false);

        redButton = (Button) view.findViewById(R.id.button_red);
        pinkButton = (Button) view.findViewById(R.id.button_pink);
        purpleButton = (Button) view.findViewById(R.id.button_purple);
        indigoButton = (Button) view.findViewById(R.id.button_indigo);
        blueButton = (Button) view.findViewById(R.id.button_blue);
        cyanButton = (Button) view.findViewById(R.id.button_cyan);
        tealButton = (Button) view.findViewById(R.id.button_teal);
        greenButton = (Button) view.findViewById(R.id.button_green);
        lightGreenButton = (Button) view.findViewById(R.id.button_light_green);
        orangeButton = (Button) view.findViewById(R.id.button_orange);
        deepOrangeButton = (Button) view.findViewById(R.id.button_deep_orange);
        brownButton = (Button) view.findViewById(R.id.button_brown);

        redButton.setOnClickListener(this);
        pinkButton.setOnClickListener(this);
        purpleButton.setOnClickListener(this);
        indigoButton.setOnClickListener(this);
        blueButton.setOnClickListener(this);
        cyanButton.setOnClickListener(this);
        tealButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        lightGreenButton.setOnClickListener(this);
        orangeButton.setOnClickListener(this);
        deepOrangeButton.setOnClickListener(this);
        brownButton.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_red: {
                setStyleKey(R.style.RedTheme);
                break;
            }
            case R.id.button_pink: {
                setStyleKey(R.style.PinkTheme);
                break;
            }
            case R.id.button_purple: {
                setStyleKey(R.style.PurpleTheme);
                break;
            }
            case R.id.button_indigo: {
                setStyleKey(R.style.IndigoTheme);
                break;
            }
            case R.id.button_blue: {
                setStyleKey(R.style.AppTheme); // default theme
                break;
            }
            case R.id.button_cyan: {
                setStyleKey(R.style.CyanTheme);
                break;
            }
            case R.id.button_teal: {
                //preferencesEditor.putInt(STYLE_KEY, R.style.TealTheme);
                break;
            }
            case R.id.button_green: {
                setStyleKey(R.style.GreenTheme);
                break;
            }
            case R.id.button_light_green: {
                setStyleKey(R.style.LightGreenTheme);
                break;
            }
            case R.id.button_orange: {
                setStyleKey(R.style.OrangeTheme);
                break;
            }
            case R.id.button_deep_orange: {
                setStyleKey(R.style.DeepOrange);
                break;
            }
            case R.id.button_brown: {
                setStyleKey(R.style.BrownTheme);
                break;
            }
        }
    }
}
