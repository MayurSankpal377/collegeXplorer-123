package com.example.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class setThemes extends AppCompatActivity {

    private static final String PREFS_NAME = "ThemePrefs"; // SharedPreferences name
    private static final String KEY_THEME = "selected_theme"; // Key to store theme preference

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Load the saved theme before setting the content view
        loadTheme();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_themes);

        Button btnLightTheme = findViewById(R.id.btnLightTheme);
        Button btnDarkTheme = findViewById(R.id.btnDarkTheme);

        // Set Light Theme
        btnLightTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                saveTheme(AppCompatDelegate.MODE_NIGHT_NO); // Save the selected theme
                recreate(); // Recreate the activity to apply the theme immediately
            }
        });

        // Set Dark Theme
        btnDarkTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                saveTheme(AppCompatDelegate.MODE_NIGHT_YES); // Save the selected theme
                recreate(); // Recreate the activity to apply the theme immediately
            }
        });
    }

    // Save the selected theme to SharedPreferences
    private void saveTheme(int mode) {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(KEY_THEME, mode); // Store the theme mode
        editor.apply();
    }

    // Load the theme from SharedPreferences when the app starts
    private void loadTheme() {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        int themeMode = preferences.getInt(KEY_THEME, AppCompatDelegate.MODE_NIGHT_NO); // Default is Light Mode
        AppCompatDelegate.setDefaultNightMode(themeMode); // Apply the saved theme
    }
}
