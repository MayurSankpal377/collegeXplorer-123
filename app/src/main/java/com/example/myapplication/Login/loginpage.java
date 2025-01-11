package com.example.myapplication.Login;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        // Get the login and signup buttons
        Button loginButton = findViewById(R.id.loginButton);
        Button signupButton = findViewById(R.id.signupButton);

        // Set click listener for the login button
        loginButton.setOnClickListener(v -> {
            // Perform action on login button click
            // For example, navigate to LoginActivity (you can create this activity)
            Intent intent = new Intent(loginpage.this, userlogin.class);
            startActivity(intent);
        });

        // Set click listener for the sign-up button
        signupButton.setOnClickListener(v -> {
            // Perform action on sign up button click
            // For example, navigate to SignUpActivity (you can create this activity)
            Intent intent = new Intent(loginpage.this, usersignup.class);
            startActivity(intent);
        });
    }
}
