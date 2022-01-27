package com.example.scienceiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LandingActivity extends AppCompatActivity {

    ImageView landingGif;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        button = findViewById(R.id.button);
        landingGif = findViewById(R.id.landingGif);

        Glide.with(this).load(R.drawable.landing).into(landingGif);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WaterCycleActivity.class);
                startActivity(intent);
            }
        });
    }
}