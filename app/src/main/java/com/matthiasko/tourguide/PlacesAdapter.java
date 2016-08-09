package com.matthiasko.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by matthiasko on 7/31/16.
 * Custom Adapter based on http://www.vogella.com/tutorials/AndroidListView/article.html#adapterown_custom
 */
public class PlacesAdapter extends ArrayAdapter<Places>{

    private final Context context;
    private final Places[] values;

    public PlacesAdapter(Context context, Places[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);

        TextView nameTextView = (TextView) rowView.findViewById(R.id.row_name);
        TextView addressTextView = (TextView) rowView.findViewById(R.id.row_address);
        TextView scheduleTextView = (TextView) rowView.findViewById(R.id.row_schedule);
        TextView descriptionTextView = (TextView) rowView.findViewById(R.id.row_description);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.row_imageview);

        nameTextView.setText(values[position].getName());
        addressTextView.setText(values[position].getAddress());
        imageView.setImageDrawable(values[position].getPhoto());
        scheduleTextView.setText(values[position].getSchedule());
        descriptionTextView.setText(values[position].getDescription());

        return rowView;
    }
}
