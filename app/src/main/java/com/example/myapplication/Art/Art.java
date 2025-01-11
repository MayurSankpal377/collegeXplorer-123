package com.example.myapplication.Art;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Engineering.College;
import com.example.myapplication.Engineering.CollegeAdapter;
import com.example.myapplication.Engineering.iit_bombay_college;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Art extends AppCompatActivity {
    private ImageView backArrow;

    private SearchView searchView;
    private ListView listView;
    private CollegeAdapter adapter;
    private List<College> collegeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);  // Change to activity_art if it's the new layout

        // Initialize views
        backArrow = findViewById(R.id.arrowIcon);
        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);

        // Reduced sample data for 25 colleges
        collegeList = new ArrayList<>();
        collegeList.add(new College("IIT Bombay", R.drawable.iitbombay));
        collegeList.add(new College("Stanford University", R.drawable.stanford));
        collegeList.add(new College("MIT", R.drawable.mit));
        collegeList.add(new College("IIT Delhi", R.drawable.iitbombay));
        collegeList.add(new College("Harvard University", R.drawable.harvard));
        collegeList.add(new College("California Institute of Technology", R.drawable.iitbombay));
        collegeList.add(new College("Princeton University", R.drawable.iitbombay));
        collegeList.add(new College("IIT Madras", R.drawable.iitbombay));
        collegeList.add(new College("University of Cambridge", R.drawable.iitbombay));
        collegeList.add(new College("University of Oxford", R.drawable.oxford));
        collegeList.add(new College("University of California, Berkeley", R.drawable.iitbombay));
        collegeList.add(new College("IIT Kanpur", R.drawable.iitbombay));
        collegeList.add(new College("University of Chicago", R.drawable.iitbombay));
        collegeList.add(new College("Columbia University", R.drawable.iitbombay));
        collegeList.add(new College("Yale University", R.drawable.iitbombay));
        collegeList.add(new College("IIT Kharagpur", R.drawable.iitbombay));
        collegeList.add(new College("Imperial College London", R.drawable.iitbombay));
        collegeList.add(new College("Georgia Tech", R.drawable.iitbombay));
        collegeList.add(new College("University of California, Los Angeles", R.drawable.iitbombay));
        collegeList.add(new College("Tsinghua University", R.drawable.iitbombay));
        collegeList.add(new College("Cornell University", R.drawable.iitbombay));
        collegeList.add(new College("University of California, San Diego", R.drawable.iitbombay));
        collegeList.add(new College("University of Toronto", R.drawable.iitbombay));
        collegeList.add(new College("Purdue University", R.drawable.iitbombay));
        collegeList.add(new College("Johns Hopkins University", R.drawable.iitbombay));

        // Set up the adapter
        adapter = new CollegeAdapter(this, collegeList);
        listView.setAdapter(adapter);

        // Handle search functionality
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false; // No action needed on submit
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText); // Properly call the filter method
                return true;
            }
        });

        // Handle item click for remaining colleges
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = null;
            // Handle item clicks based on the position of the item in the list
            switch (position) {
                case 0:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 1:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 2:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 3:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 4:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 5:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 6:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 7:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 8:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 9:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 10:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 11:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 12:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 13:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 14:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 15:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 16:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 17:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 18:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 19:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 20:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 21:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 22:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 23:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
                case 24:
                    intent = new Intent(Art.this, iit_bombay_college.class);
                    break;
            }

            if (intent != null) {
                startActivity(intent);
            }
        });

        // Back arrow click listener to return to MainActivity
        backArrow.setOnClickListener(v -> {
            Intent intent = new Intent(Art.this, MainActivity.class);  // Create intent for MainActivity
            startActivity(intent);  // Start MainActivity
            finish();  // Optional: Call finish() to close the current activity and remove it from the back stack
        });
    }
}
