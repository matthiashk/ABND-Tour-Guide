package com.matthiasko.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button thirdButton = (Button) findViewById(R.id.thirdButton);
        Button fourthButton = (Button) findViewById(R.id.fourthButton);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sheddIntent = new Intent(getApplicationContext(), SheddActivity.class);
                startActivity(sheddIntent);
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artIntent = new Intent(getApplicationContext(), ArtInstituteActivity.class);
                startActivity(artIntent);
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // launch activity
            }
        });

        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // launch activity
            }
        });
    }
}
