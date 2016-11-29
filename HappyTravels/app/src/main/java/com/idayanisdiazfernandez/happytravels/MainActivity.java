package com.idayanisdiazfernandez.happytravels;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        MainFragment.OnFragmentInteractionListener,
        hotelFragment.OnFragmentInteractionListener,
        GalleryFragment.OnFragmentInteractionListener,
        GalleryFragmentPager.OnFragmentInteractionListener {

    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft;

    String languageToLoad;
    // Create array to store languages.
    String[] languagesArray = {"English", "Spanish"};

    // Language Dialog
    AlertDialog langDialog;

    public static SharedPreferences mSharedPreferences;
    public static SharedPreferences.Editor mEditor;
    public static String STYLE_KEY = "STYLE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Apply custom theme using SharedPreferences and getTheme().applyStyle.
        mSharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();

        if (mSharedPreferences == null) {
            getTheme().applyStyle(R.style.AppTheme, true);
        } else getTheme().applyStyle(mSharedPreferences.getInt(STYLE_KEY, -1), true);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Host main Fragment
        ft = fm.beginTransaction();
        ft.replace(R.id.mainFragmenLayout, new MainFragment());
        ft.addToBackStack("tag");
        ft.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_themes) {
            showDialog();
        } else if (id == R.id.action_reset) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure to reset data?").setPositiveButton("Yes", dialogClickListener)
                    .setNegativeButton("No", dialogClickListener).show();
        } else {
            languageDialog();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_hotel) {
            // Handle the hotel action here
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new MainFragment());
            ft.addToBackStack("tag");
            ft.commit();

        } else if (id == R.id.nav_restaurants) {
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new GalleryFragmentPager());
            ft.addToBackStack("tag");
            ft.commit();

        } else if (id == R.id.nav_beach) {
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new MainFragment());
            ft.addToBackStack("tag");
            ft.commit();

        } else if (id == R.id.nav_clubs) {
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new MainFragment());
            ft.addToBackStack("tag");
            ft.commit();

        } else if (id == R.id.nav_airport) {
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new MainFragment());
            ft.addToBackStack("tag");
            ft.commit();

        } else if (id == R.id.nav_other) {
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new MainFragment());
            ft.addToBackStack("tag");
            ft.commit();

        } else if (id == R.id.nav_transport) {
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new MainFragment());
            ft.addToBackStack("tag");
            ft.commit();

        } else if (id == R.id.nav_emergency) {
            ft = fm.beginTransaction();
            ft.replace(R.id.mainFragmenLayout, new MainFragment());
            ft.addToBackStack("tag");
            ft.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    // Custom Shared Preferences method for applying theme.
    public static void setStyleKey(int styleKey) {
        mEditor.putInt(STYLE_KEY, styleKey);
        mEditor.apply();
    }

    /**
     * Creating and Building the AlertDialog for Language
     */
    public void languageDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Select Language");

        builder.setSingleChoiceItems(languagesArray, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0:
                        languageToLoad = "en_US";
                        break;
                    case 1:
                        languageToLoad = "es_ES";
                        break;
                }
            }
        }).setPositiveButton("Set", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK, so change the language.
                Locale locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                Context mContext = getApplicationContext();
                mContext.getResources().updateConfiguration(config, mContext.getResources().getDisplayMetrics());
                recreate(); // recreate activity to apply changes.
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                langDialog.dismiss();
            }
        });

        langDialog = builder.create();
        langDialog.show();
    }

    /**
     * The showDialog method which instantiates object from ThemeDialogFragment.
     */
    void showDialog() {
        // Create the fragment and show it as a dialog.
        DialogFragment themeDialogFragment = ThemeDialogFragment.newInstance();
        themeDialogFragment.show(getSupportFragmentManager(), "dialog");
    }

    /**
     * Create Dialog box to ask user to confirm the request to reset app data.
     */
    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                case DialogInterface.BUTTON_POSITIVE:
                    resetData();
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    dialog.dismiss();
                    break;
            }
        }
    };

    /**
     * Delete the directory which holds temporary data for the application.
     */
    public void resetData() {
        Toast.makeText(this, "Data reset completed.", Toast.LENGTH_SHORT).show();
        File cache = getCacheDir();
        File appDir = new File(cache.getParent());
        if (appDir.exists()) {
            String[] children = appDir.list();
            for (String s : children) {
                if (!s.equals("lib")) {
                    deleteDir(new File(appDir, s));

                }
            }
        }
    }

    /**
     * Helper method for resetData() to delete directories.
     *
     * @param dir Receives dir as parameter from the resetData() method to delete it.
     * @return dir.delete()
     */
    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        return dir.delete();
    }

}