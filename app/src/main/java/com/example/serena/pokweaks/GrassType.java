package com.example.serena.pokweaks;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GrassType extends AppCompatActivity {

    Button mBtnWater1;
    Button mBtnWater2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grass_type);

        mBtnWater1 = (Button) findViewById(R.id.buttonWater1);
        mBtnWater2 = (Button) findViewById(R.id.buttonWater2);


        mBtnWater1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(com.example.serena.pokweaks.GrassType.this, WaterType.class);
                startActivity(intentLoadNewActivity);
            }

        });

        mBtnWater2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(com.example.serena.pokweaks.GrassType.this, WaterType.class);
                startActivity(intentLoadNewActivity);
            }

        });









    }
}
