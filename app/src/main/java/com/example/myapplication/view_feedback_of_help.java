package com.example.myapplication;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class view_feedback_of_help extends AppCompatActivity {

    private ListView feedbackListView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> feedbackList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_feedback_of_help);

        feedbackListView = findViewById(R.id.feedbackListView);
        feedbackList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, feedbackList);
        feedbackListView.setAdapter(adapter);


    }
}
