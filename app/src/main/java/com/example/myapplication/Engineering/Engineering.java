package com.example.myapplication.Engineering;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Animation.Animation;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Engineering extends AppCompatActivity {
    private ImageView backArrow;

    private SearchView searchView;
    private ListView listView;
    private CollegeAdapter adapter;
    private List<College> collegeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        backArrow = findViewById(R.id.arrowIcon);
        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);

        // Sample data for 100 colleges
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
        collegeList.add(new College("University of Michigan", R.drawable.iitbombay));
        collegeList.add(new College("IIT Roorkee", R.drawable.iitbombay));
        collegeList.add(new College("Duke University", R.drawable.iitbombay));
        collegeList.add(new College("University of California, San Francisco", R.drawable.iitbombay));
        collegeList.add(new College("University of Washington", R.drawable.iitbombay));
        collegeList.add(new College("University of Melbourne", R.drawable.iitbombay));
        collegeList.add(new College("ETH Zurich", R.drawable.iitbombay));
        collegeList.add(new College("University of Texas at Austin", R.drawable.iitbombay));
        collegeList.add(new College("National University of Singapore", R.drawable.iitbombay));
        collegeList.add(new College("University of Hong Kong", R.drawable.iitbombay));
        collegeList.add(new College("Peking University", R.drawable.iitbombay));
        collegeList.add(new College("Australian National University", R.drawable.iitbombay));
        collegeList.add(new College("University of Edinburgh", R.drawable.iitbombay));
        collegeList.add(new College("McGill University", R.drawable.iitbombay));
        collegeList.add(new College("University of California, Santa Barbara", R.drawable.iitbombay));
        collegeList.add(new College("University of California, Irvine", R.drawable.iitbombay));
        collegeList.add(new College("Rice University", R.drawable.iitbombay));
        collegeList.add(new College("University of Pennsylvania", R.drawable.iitbombay));
        collegeList.add(new College("University of Sydney", R.drawable.iitbombay));
        collegeList.add(new College("University of Science and Technology of China", R.drawable.iitbombay));
        collegeList.add(new College("University of British Columbia", R.drawable.iitbombay));
        collegeList.add(new College("University of Copenhagen", R.drawable.iitbombay));
        collegeList.add(new College("Kyoto University", R.drawable.iitbombay));
        collegeList.add(new College("Seoul National University", R.drawable.iitbombay));
        collegeList.add(new College("Osaka University", R.drawable.iitbombay));
        collegeList.add(new College("Swiss Federal Institute of Technology Lausanne", R.drawable.iitbombay));
        // Additional 50 Colleges for a total of 100
        collegeList.add(new College("University of California, Berkeley", R.drawable.iitbombay));
        collegeList.add(new College("National Taiwan University", R.drawable.iitbombay));
        collegeList.add(new College("University of Paris", R.drawable.iitbombay));
        collegeList.add(new College("University of Tokyo", R.drawable.iitbombay));
        collegeList.add(new College("University of Chicago", R.drawable.iitbombay));
        collegeList.add(new College("Cornell University", R.drawable.iitbombay));
        collegeList.add(new College("London School of Economics", R.drawable.iitbombay));
        collegeList.add(new College("University of Toronto", R.drawable.iitbombay));
        collegeList.add(new College("University of Melbourne", R.drawable.iitbombay));
        collegeList.add(new College("McGill University", R.drawable.iitbombay));
        collegeList.add(new College("Peking University", R.drawable.iitbombay));
        collegeList.add(new College("University of Hong Kong", R.drawable.iitbombay));
        collegeList.add(new College("Harvard University", R.drawable.iitbombay));
        collegeList.add(new College("MIT", R.drawable.iitbombay));
        collegeList.add(new College("California Institute of Technology", R.drawable.iitbombay));
        collegeList.add(new College("Princeton University", R.drawable.iitbombay));
        collegeList.add(new College("Yale University", R.drawable.iitbombay));
        collegeList.add(new College("Columbia University", R.drawable.iitbombay));
        collegeList.add(new College("Duke University", R.drawable.iitbombay));
        collegeList.add(new College("ETH Zurich", R.drawable.iitbombay));
        collegeList.add(new College("Stanford University", R.drawable.iitbombay));
        collegeList.add(new College("IIT Bombay", R.drawable.iitbombay));
        collegeList.add(new College("IIT Delhi", R.drawable.iitbombay));
        collegeList.add(new College("IIT Kharagpur", R.drawable.iitbombay));
        collegeList.add(new College("IIT Kanpur", R.drawable.iitbombay));
        collegeList.add(new College("Imperial College London", R.drawable.iitbombay));
        collegeList.add(new College("Georgia Tech", R.drawable.iitbombay));
        collegeList.add(new College("University of California, Los Angeles", R.drawable.iitbombay));
        collegeList.add(new College("Tsinghua University", R.drawable.iitbombay));
        collegeList.add(new College("University of California, San Diego", R.drawable.iitbombay));
        collegeList.add(new College("University of Texas at Austin", R.drawable.iitbombay));
        collegeList.add(new College("National University of Singapore", R.drawable.iitbombay));
        collegeList.add(new College("University of Edinburgh", R.drawable.iitbombay));
        collegeList.add(new College("University of Washington", R.drawable.iitbombay));
        collegeList.add(new College("University of California, Irvine", R.drawable.iitbombay));
        collegeList.add(new College("Purdue University", R.drawable.iitbombay));
        collegeList.add(new College("University of Pennsylvania", R.drawable.iitbombay));
        collegeList.add(new College("University of Sydney", R.drawable.iitbombay));
        collegeList.add(new College("Kyoto University", R.drawable.iitbombay));
        collegeList.add(new College("Seoul National University", R.drawable.iitbombay));
        collegeList.add(new College("Osaka University", R.drawable.iitbombay));

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

        // Handle item click
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = null;
            switch (position) {
                case 0:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 1:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 2:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 3:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 4:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 5:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 6:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 7:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 8:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 9:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 10:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 11:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 12:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 13:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 14:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 15:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 16:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 17:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 18:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 19:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 20:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 21:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 22:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 23:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 24:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 25:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 26:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 27:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 28:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 29:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 30:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 31:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 32:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 33:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 34:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 35:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 36:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 37:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 38:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 39:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 40:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 41:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 42:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 43:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 44:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 45:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 46:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 47:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 48:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 49:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 50:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 51:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 52:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 53:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 54:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 55:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 56:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 57:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 58:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 59:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 60:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 61:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 62:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 63:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 64:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 65:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 66:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 67:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 68:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 69:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 70:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 71:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 72:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 73:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 74:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 75:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 76:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 77:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 78:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 79:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 80:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 81:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 82:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 83:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 84:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 85:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 86:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 87:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 88:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 89:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 90:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 91:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 92:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 93:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 94:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 95:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 96:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 97:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 98:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                case 99:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
                default:
                    intent = new Intent(Engineering.this, iit_bombay_college.class);
                    break;
            }



            if (intent != null) {
                startActivity(intent);
            }
        });

        // Back arrow click listener to return to MainActivity
        backArrow.setOnClickListener(v -> {
            Intent intent = new Intent(Engineering.this, MainActivity.class);  // Create intent for MainActivity
            startActivity(intent);  // Start MainActivity
            finish();  // Optional: Call finish() to close the current activity and remove it from the back stack
        });
    }
}