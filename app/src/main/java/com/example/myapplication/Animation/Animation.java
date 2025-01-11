package com.example.myapplication.Animation;

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

public class Animation extends AppCompatActivity {
    private ImageView backArrow;

    private SearchView searchView;
    private ListView listView;
    private CollegeAdapter adapter;
    private List<College> collegeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);  // Change to activity_animation if it's the new layout

        // Initialize views
        backArrow = findViewById(R.id.arrowIcon);
        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);

        // Reduced sample data for 25 colleges
        collegeList = new ArrayList<>();
        collegeList.add(new College("Indian Institute of Technology Bombay,Mumbai", R.drawable.iitbombay));
        collegeList.add(new College("Amity University,Mumbai", R.drawable.amityuniver));
        collegeList.add(new College("Fergusson College,Pune", R.drawable.fergussanclg));
        collegeList.add(new College("MIT Art, Design and Technology University,Pune", R.drawable.mitadt));
        collegeList.add(new College("Suryadatta College of Management, Information Research & Technology,Pune", R.drawable.suryadattaclg));
        collegeList.add(new College("Modern College of Arts, Science and Commerce,Pune", R.drawable.modercollegeart));
        collegeList.add(new College("Symbiosis Institute of Design,Pune", R.drawable.animationsid));
        collegeList.add(new College("University of Mumbai,Mumbai", R.drawable.mum_uni_anima));
        collegeList.add(new College("Dr. D. Y. Patil Vidya Pratishthan,Pune", R.drawable.dyp_vidhya_animatoion));
        collegeList.add(new College("Thakur College of Engineering & Technology,Mumbai", R.drawable.thakur_mum_animat));
        collegeList.add(new College("Dr D.Y. Patil Arts, Commerce and Science College,Pune", R.drawable.dyp_animation_college_art));
        collegeList.add(new College("Whistling Woods International (WWI),Mumbai", R.drawable.anima_wisling_wood));
        collegeList.add(new College("Suryadatta College Of Management Information Research & Technology,Pune", R.drawable.suryadatta_anima));
        collegeList.add(new College(" P. A. Inamdar College of Visual Effects, Design & Arts,Pune", R.drawable.inamdar_college_pune_anima));
        collegeList.add(new College("Ajeenkya DY Patil University,Pune", R.drawable.ajinkya_uni_anima));
        collegeList.add(new College("Tilak Maharashtra Vidyapeeth (TMV),Pune", R.drawable.tilak_vidya_cole_anima));
        collegeList.add(new College("Chhatrapati Shivaji Maharaj University,navi Mumbai", R.drawable.chtrapti_uni_animation));
        collegeList.add(new College("International School of Business and Media,Pune", R.drawable.isbm));
        collegeList.add(new College("mage Institute Of Digital Technology Ltd,Mumbai", R.drawable.megadatta_college_aniam));
        collegeList.add(new College("Arihant College of Arts, Commerce and Science,Pune", R.drawable.arihant_col_anima));
        collegeList.add(new College("Changu Kana Thakur Arts, Commerce and Science College,Raigard", R.drawable.iitbombay));
        collegeList.add(new College("University of California, San Diego", R.drawable.changu_kna_tahkur_ani));
        collegeList.add(new College("Mumbai Digital Films Academy - [MDFA], Mumbai", R.drawable.mdfa_colleg_anima));
        collegeList.add(new College("Vishwakarma Creative-i College,Pune", R.drawable.vishwakarnam_col_anima));
        collegeList.add(new College(" Wigan & Leigh College India,Pune", R.drawable.wigan_col_anima));

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
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 1:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 2:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 3:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 4:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 5:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 6:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 7:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 8:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 9:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 10:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 11:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 12:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 13:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 14:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 15:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 16:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 17:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 18:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 19:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 20:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 21:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 22:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 23:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
                case 24:
                    intent = new Intent(Animation.this, iit_bombay_college.class);
                    break;
            }

            if (intent != null) {
                startActivity(intent);
            }
        });

        // Back arrow click listener to return to MainActivity
        backArrow.setOnClickListener(v -> {
            Intent intent = new Intent(Animation.this, MainActivity.class);  // Create intent for MainActivity
            startActivity(intent);  // Start MainActivity
            finish();  // Optional: Call finish() to close the current activity and remove it from the back stack
        });
    }
}
