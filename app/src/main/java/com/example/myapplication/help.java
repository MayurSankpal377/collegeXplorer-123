package com.example.myapplication;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.util.HashMap;

public class help extends AppCompatActivity {
    EditText name, mobile, message;
    Button sendmsg, viewFeedback;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        message = findViewById(R.id.message);
        sendmsg = findViewById(R.id.sendmsg);
        viewFeedback = findViewById(R.id.viewFeedback);
        imageView =findViewById(R.id.arrowIcon);

        sendmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact_data_submit();
                Toast.makeText(help.this, "Send Successfully.", Toast.LENGTH_SHORT).show();
            }

        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(help.this, MainActivity.class);
                startActivity(i);
            }
        });

        viewFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(help.this, view_feedback_of_help.class);
                startActivity(intent);
            }
        });
    }

    private void contact_data_submit() {
        String contact_name = name.getText().toString();
        String contact_mobile = mobile.getText().toString();
        String contact_message = message.getText().toString();

        HashMap<String, Object> map = new HashMap<>();
        map.put("User Name:", contact_name);
        map.put("User Mobile no:", contact_mobile);
        map.put("User Message:", contact_message);


    }
}
