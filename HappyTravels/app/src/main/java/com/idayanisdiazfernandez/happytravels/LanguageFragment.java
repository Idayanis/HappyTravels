package com.idayanisdiazfernandez.happytravels;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Locale;


public class LanguageFragment extends DialogFragment {

    String languageToLoad;
    // Create array to store languages.
    String[] languagesArray = {"en", "es"};

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Set the dialog title
        builder.setTitle("Select Language")
                // Specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive callbacks when items are selected
                .setSingleChoiceItems(languagesArray, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        if (languagesArray[item] == "en") {
                            languageToLoad = "en_US";
                        } else {
                            languageToLoad = "es_ES";
                        }
                    }
                })
                // Set the action buttons
                .setPositiveButton("Set", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK, so change the language.
                        Locale locale = new Locale(languageToLoad);
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        Context mContext = getActivity().getApplicationContext();
                        mContext.getResources().updateConfiguration(config, mContext.getResources().getDisplayMetrics());
                        getActivity().recreate();

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        return builder.create();
    }

}
