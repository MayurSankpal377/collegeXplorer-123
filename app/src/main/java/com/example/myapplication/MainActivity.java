package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

import android.content.DialogInterface;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;



import android.view.MenuItem;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;

import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.myapplication.Animation.Animation;
import com.example.myapplication.Art.Art;
import com.example.myapplication.Commerce.Commerce;
import com.example.myapplication.Engineering.Engineering;
import com.example.myapplication.Login.loginpage;
import com.example.myapplication.Medical.Medical;
import com.example.myapplication.Management.Management;
import com.example.myapplication.Science.Science;
import com.example.myapplication.Agriculture.*;
import com.example.myapplication.Hotel.*;
import com.example.myapplication.Law.*;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    private int feedbackCount = 0; // Total feedback count
    private float totalRating = 0; // Total rating value

    private static final String PREFS_NAME = "RatingPrefs";
    private static final String KEY_FEEDBACK_COUNT = "FeedbackCount";
    private static final String KEY_TOTAL_RATING = "TotalRating";


    private DrawerLayout drawerLayout;
    private ImageButton menubutton, settingbutton;
    private NavigationView navigationView, settingsNavigationView;
    public ImageView imageView1;
    public ImageView imageView2;
    public ImageView imageView3;
    public ImageView imageView4;
public ImageView imageView5;
public ImageView imageView6;
    public ImageView imageView7;

    public ImageView imageView8;
    public ImageView imageView9;
    public ImageView imageView10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadRatingData();
        FirebaseMessaging.getInstance().subscribeToTopic("notification");

        // Initialize views for the navigation drawer and buttons
        drawerLayout = findViewById(R.id.main_activity);
        menubutton = findViewById(R.id.menubutton1);
        settingbutton = findViewById(R.id.settingbutton);
        navigationView = findViewById(R.id.navigationview);
        settingsNavigationView = findViewById(R.id.settingsNavigationView);

        // Initialize the ImageView for click functionality
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        // Set the onClickListener for the image to navigate to Engineering activity
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Engineering.class);
                startActivity(i);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Medical.class);
                startActivity(i);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Management.class);
                startActivity(i);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Law.class);
                startActivity(i);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Agriculture.class);
                startActivity(i);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Hotel.class);
                startActivity(i);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Science.class);
                startActivity(i);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Commerce.class);
                startActivity(i);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Art.class);
                startActivity(i);
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Animation.class);
                startActivity(i);
            }
        });
        // Open main drawer when the menu button is clicked
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);  // Open the main drawer from the left
            }
        });

        // Open settings drawer when the setting button is clicked
        settingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.END);  // Open settings drawer from the right
            }
        });

        // Set listener for the main drawer
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.navhome) {
                    // Go to Home Activity
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navhelp) {
                    // Go to Home Activity
                    Intent intent = new Intent(MainActivity.this, help.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navprivacy) {
                    // Go to Home Activity
                    Intent intent = new Intent(MainActivity.this, privacy.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Privacy", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navcontactus) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+91 8108289602"));
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Contact Us", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navshare) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_TEXT, "Shared Text");
                    intent.setPackage("com.whatsapp");
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navlogout) {

                    Toast.makeText(MainActivity.this, "Log Out", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, loginpage.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Logout Success", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navrateus) {
                    // Go to Home Activity
                    showRatingPopup();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }


            private int feedbackCount = 0; // Tracks total feedback count
            private float totalRating = 0; // Tracks total rating value

        });
    }
    private void showRatingPopup() {
        // Inflate the custom layout
        LayoutInflater inflater = LayoutInflater.from(this);
        View popupView = inflater.inflate(R.layout.popup_rating, null);

        // Create AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(popupView);
        AlertDialog dialog = builder.create();
        dialog.show();

        // Initialize views
        RatingBar ratingBar = popupView.findViewById(R.id.ratingBar);
        TextView tvFeedbackCount = popupView.findViewById(R.id.tv_feedback_count);
        Button btnOk = popupView.findViewById(R.id.btn_ok);

        // Update feedback count and rating initially
        float averageRating = feedbackCount > 0 ? totalRating / feedbackCount : 0;
        tvFeedbackCount.setText("Feedbacks: Avg " + String.format("%.1f", averageRating) + " (" + feedbackCount + ")");

        // Handle OK button click
        btnOk.setOnClickListener(v -> {
            float rating = ratingBar.getRating();
            if (rating > 0) {
                feedbackCount++;
                totalRating += rating;

                // Save updated data
                saveRatingData();

                // Update feedback count and average rating
                float updatedAverage = totalRating / feedbackCount;
                tvFeedbackCount.setText("Feedbacks: Avg " + String.format("%.1f", updatedAverage) + " (" + feedbackCount + ")");
                Toast.makeText(this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            } else {
                Toast.makeText(this, "Please provide a rating.", Toast.LENGTH_SHORT).show();
            }

        });




        // Set listener for the settings drawer
        settingsNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.navhome) {
                    // Show the brightness adjustment dialog
                 Intent i = new Intent(MainActivity.this,MainActivity.class);
                 startActivity(i);
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();

                }
                if (itemId == R.id.navBrightness) {
                    // Show the brightness adjustment dialog
                    Toast.makeText(MainActivity.this, "Brightness", Toast.LENGTH_SHORT).show();
                    showBrightnessDialog();
                }
                if (itemId == R.id.navswitchtheme) {
                    Intent intent = new Intent(MainActivity.this, setThemes.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Theme", Toast.LENGTH_SHORT).show();
                }
                if (itemId == R.id.navRefresh) {
                    // Implement refresh logic here
                    Toast.makeText(MainActivity.this, "Refresh", Toast.LENGTH_SHORT).show();
                    refreshApplication();
                }
                if (itemId == R.id.navVersion) {
                    // Show the version dialog
                    Toast.makeText(MainActivity.this, "Version", Toast.LENGTH_SHORT).show();
                    showVersionDialog();
                }
                drawerLayout.closeDrawer(GravityCompat.END);
                return true;
            }
        });



    }

    private void showBrightnessDialog() {
        BrightnessDialog.show(this);
    }

    private void saveRatingData() {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_FEEDBACK_COUNT, feedbackCount);
        editor.putFloat(KEY_TOTAL_RATING, totalRating);
        editor.apply();
    }

    private void loadRatingData() {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        feedbackCount = prefs.getInt(KEY_FEEDBACK_COUNT, 0);
        totalRating = prefs.getFloat(KEY_TOTAL_RATING, 0f);
    }





    // Method to refresh the application
    private void refreshApplication() {
        // Implement refresh functionality here (relaunch the activity or reset app state)
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // Optional: finish the current activity if you want to reload it
    }

    private void showVersionDialog() {
        try {
            // Get the PackageManager and retrieve PackageInfo for the app
            PackageManager packageManager = getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);

            // Extract the version name from PackageInfo
            String versionName = packageInfo.versionName;

            // Display the version in an AlertDialog
            new AlertDialog.Builder(this)
                    .setTitle("App Version")
                    .setMessage("Current Version: " + versionName)
                    .setPositiveButton("OK", (dialog, which) -> dialog.dismiss()) // Modern way to handle dismiss
                    .show();
        } catch (PackageManager.NameNotFoundException e) {
            // Handle the exception and show an error message
            e.printStackTrace();
            Toast.makeText(this, "Error retrieving version information", Toast.LENGTH_SHORT).show();
        }
    }

    // Override onBackPressed to show a confirmation dialog before exiting the app
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Do you really want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.super.onBackPressed(); // Exit the app
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
