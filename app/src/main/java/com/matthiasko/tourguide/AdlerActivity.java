package com.matthiasko.tourguide;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by matthiasko on 7/31/16.
 */
public class AdlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adler);

        Places[] values = new Places[1];

        Places sheddAquarium = new Places();
        sheddAquarium.setName(getResources().getString(R.string.adler_name));
        sheddAquarium.setAddress(getResources().getString(R.string.adler_address));
        Drawable photo = ContextCompat.getDrawable(this, R.drawable.adler_external_640px);
        sheddAquarium.setPhoto(photo);
        sheddAquarium.setSchedule(getResources().getString(R.string.adler_schedule));
        sheddAquarium.setDescription(getResources().getString(R.string.adler_description));

        values[0] = sheddAquarium;

        ListView listview = (ListView) findViewById(R.id.adler_listview);

        PlacesAdapter placesAdapter = new PlacesAdapter(this, values);

        listview.setAdapter(placesAdapter);
    }
}
