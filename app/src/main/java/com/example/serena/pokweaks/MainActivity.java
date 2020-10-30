package com.example.serena.pokweaks;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    TextView mDebole;
    TextView mForte;

    Spinner mSpinner;



    String fuoco = "<font color='#ffa500'> Fuoco  </font>";
    String acqua = "<font color='#0000ff'> Acqua  </font>";
    String elettro = "<font color='#ffff00'> Elettro  </font> ";
    String terra = "<font color='#800000'> Terra  </font> ";
    String erba = "<font color='#7fff00'> Erba </font> ";
    String volante = "<font color='#7fffd4'> Volante  </font> ";
    String acciaio = "<font color='#c0c0c0'> Acciaio  </font> ";
    String veleno = "<font color='#800080'> Veleno  </font> ";
    String roccia = "<font color='#d2691e'> Roccia  </font> ";
    String ghiaccio = "<font color='#008b8b'> Ghiaccio  </font> ";
    String coleottero = "<font color='#556b2f'> Coleottero  </font> ";
    String drago = "<font color='#4b0082'> Drago  </font> ";



    String testobianco= "<font color='#ffffff'> bianco  </font> ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDebole = (TextView) findViewById(R.id.textDebole);
        mForte = (TextView) findViewById(R.id.textForte);

        mSpinner = findViewById(R.id.spinner1);


        ArrayAdapter<CharSequence> adapterBox = ArrayAdapter.createFromResource(this, R.array.tipi, android.R.layout.simple_spinner_item );
        adapterBox.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapterBox);
        mSpinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
           String text = adapterView.getItemAtPosition(i).toString();
        //Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
        switch (text){
            case "Fuoco":
                mDebole.setText(Html.fromHtml(acqua +  terra  + roccia + fuoco + drago));
                mForte.setText(Html.fromHtml(erba  + testobianco +  acciaio + ghiaccio + coleottero ));


                break;

            case "Acqua":
                mDebole.setText(" Elettro \n Erba" );
                mForte.setText(" Fuoco \n Terra \n Roccia");
                break;


            case "Elettro":
                mDebole.setText(" Terra" );
                mForte.setText(" Acqua \n Volante");
                break;

            case "Erba":
                mDebole.setText(" Fuoco \n Ghiaccio \n Veleno \n Volante \n Coleottero" );
                mForte.setText(" Acqua \n Roccia \n Terra");
                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(adapterView.getContext(), "Seleziona un tipo", Toast.LENGTH_SHORT).show();

    }
}