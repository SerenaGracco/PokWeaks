package com.example.serena.pokweaks;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {




    ImageButton mImgBtnFire;
    ImageButton mImgBtnWater;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mImgBtnFire = (ImageButton) findViewById(R.id.imageButtonFire);
        mImgBtnWater = (ImageButton) findViewById(R.id.imageButtonWater);

        mImgBtnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, FireType.class);
                startActivity(intentLoadNewActivity);
            }

        });







    }


    }


