package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity_AdpPrs extends AppCompatActivity {

    TextView cant_migr, cuot_migr, tin_migr;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_migra_datos);


        Intent i = getIntent();

        String cantidad_migrada =  i.getStringExtra("cantidad");
        String cuota_migrada =  i.getStringExtra("cuota");
        String tin_migrado =  i.getStringExtra("tin");


        int cantidad = Integer.parseInt(cantidad_migrada);
        int cuota = Integer.parseInt(cuota_migrada);
        int tin = Integer.parseInt(tin_migrado);

        double interes = ((tin/100f)/12);

        DecimalFormat form = new DecimalFormat("0.00");

        




//=============================================================================\\










    }
}