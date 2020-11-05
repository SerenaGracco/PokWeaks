package com.example.serena.pokweaks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaterType extends AppCompatActivity {

    Button mBtnFire1;
    Button mBtnFire2;
    Button mBtnGrass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_type);

        mBtnFire1 = (Button) findViewById(R.id.buttonFire1);
        mBtnFire2 = (Button) findViewById(R.id.buttonFire2);
        mBtnGrass1 = (Button) findViewById(R.id.buttonGrass1);

        mBtnGrass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(com.example.serena.pokweaks.WaterType.this, GrassType.class);
                startActivity(intentLoadNewActivity);
            }

        });

        mBtnFire1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(com.example.serena.pokweaks.WaterType.this, FireType.class);
                startActivity(intentLoadNewActivity);
            }

        });

        mBtnFire2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(com.example.serena.pokweaks.WaterType.this, FireType.class);
                startActivity(intentLoadNewActivity);
            }

        });

    }
}
