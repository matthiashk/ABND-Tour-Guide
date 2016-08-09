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
public class SheddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shedd);

        Places[] values = new Places[1];

        Places sheddAquarium = new Places();
        sheddAquarium.setName(getResources().getString(R.string.shedd_name));
        sheddAquarium.setAddress(getResources().getString(R.string.shedd_address));
        Drawable photo = ContextCompat.getDrawable(this, R.drawable.shedd_aquarium_4635996_500px);
        sheddAquarium.setPhoto(photo);
        sheddAquarium.setSchedule(getResources().getString(R.string.shedd_schedule));
        sheddAquarium.setDescription(getResources().getString(R.string.shedd_description));

        values[0] = sheddAquarium;

        ListView listview = (ListView) findViewById(R.id.shedd_listview);

        PlacesAdapter placesAdapter = new PlacesAdapter(this, values);

        listview.setAdapter(placesAdapter);
    }
}
