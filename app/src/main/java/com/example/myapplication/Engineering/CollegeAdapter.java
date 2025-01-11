package com.example.myapplication.Engineering;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class CollegeAdapter extends BaseAdapter implements Filterable {
    private Context context;
    private List<College> originalList;
    private List<College> filteredList;
    private CollegeFilter collegeFilter;

    public CollegeAdapter(Context context, List<College> collegeList) {
        this.context = context;
        this.originalList = new ArrayList<>(collegeList); // Make a copy of the original list
        this.filteredList = new ArrayList<>(collegeList);
        getFilter(); // Initialize the filter
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public Object getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public List<College> getFilteredColleges() {
        return filteredList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_colleges, parent, false);
        }

        College college = filteredList.get(position);

        TextView nameTextView = convertView.findViewById(R.id.collegeName);
        ImageView imageView = convertView.findViewById(R.id.collegeImage);

        nameTextView.setText(college.getName());
        imageView.setImageResource(college.getImageResId());

        return convertView;
    }

    @Override
    public Filter getFilter() {
        if (collegeFilter == null) {
            collegeFilter = new CollegeFilter();
        }
        return collegeFilter;
    }

    private class CollegeFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            List<College> filtered = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                // No filter applied
                filtered.addAll(originalList);
            } else {
                // Perform filtering
                String query = constraint.toString().toLowerCase().trim();
                for (College college : originalList) {
                    if (college.getName().toLowerCase().contains(query)) {
                        filtered.add(college);
                    }
                }
            }

            results.values = filtered;
            results.count = filtered.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredList.clear();
            filteredList.addAll((List<College>) results.values);
            notifyDataSetChanged();
        }
    }
}
