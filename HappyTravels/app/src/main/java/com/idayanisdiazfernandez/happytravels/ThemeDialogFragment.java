package com.idayanisdiazfernandez.happytravels;

import android.support.v4.app.DialogFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static com.idayanisdiazfernandez.happytravels.MainActivity.setStyleKey;

public class ThemeDialogFragment extends DialogFragment implements View.OnClickListener {
    static ThemeDialogFragment newInstance() {
        return new ThemeDialogFragment();
    }

    // Create style buttons
    Button redButton, pinkButton, purpleButton, indigoButton, blueButton, cyanButton, tealButton,
            greenButton, lightGreenButton, orangeButton, deepOrangeButton, brownButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_theme_dialog, container, false);
        getDialog().setTitle("Color Theme Chooser");

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

    /**
     * Restart MainActivity once the theme is selected.
     * Get the intent of the current activity and start it with startActivity method.
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        getActivity().finish();
        startActivity(getActivity().getIntent());
    }

    /**
     * The method is created to handle buttons clicks to change the color of the app.
     *
     * @param v Receives the view of the context.
     */
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
                setStyleKey(R.style.TealTheme);
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