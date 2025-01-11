package com.example.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.Toast;

public class BrightnessDialog {

    public static void show(Context context) {
        // Step 1: Check if the WRITE_SETTINGS permission is granted
        if (!Settings.System.canWrite(context)) {
            // Redirect the user to grant WRITE_SETTINGS permission
            Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            context.startActivity(intent);
            Toast.makeText(context, "Please grant permission to adjust brightness", Toast.LENGTH_SHORT).show();
            return;
        }

        // Step 2: Create a custom dialog for brightness adjustment
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_brightness); // Custom layout for the dialog
        dialog.setCancelable(true);

        // Step 3: Initialize the SeekBar for brightness adjustment
        SeekBar seekBar = dialog.findViewById(R.id.seekBar);

        // Get the current screen brightness
        int currentBrightness;
        try {
            currentBrightness = Settings.System.getInt(context.getContentResolver(), Settings.System.SCREEN_BRIGHTNESS);
        } catch (Settings.SettingNotFoundException e) {
            Toast.makeText(context, "Cannot access brightness settings", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        }

        // Set the SeekBar's max value and current progress
        seekBar.setMax(255); // Maximum brightness level
        seekBar.setProgress(currentBrightness); // Current brightness level

        // Step 4: Handle SeekBar changes for live brightness adjustment
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) { // Only update if the user is interacting with the SeekBar
                    try {
                        Settings.System.putInt(context.getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, progress);
                    } catch (Exception e) {
                        Toast.makeText(context, "Failed to adjust brightness", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Optional: Add logic when SeekBar interaction starts
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Optional: Add logic when SeekBar interaction ends
            }
        });

        // Step 5: Show the dialog
        dialog.show();
    }
}
