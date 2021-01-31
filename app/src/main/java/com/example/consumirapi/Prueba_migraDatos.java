package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Prueba_migraDatos extends AppCompatActivity {

    TextView cant_migr, cuot_migr, tin_migr;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_migra_datos);

        cant_migr = findViewById(R.id.tv_cant);
        cuot_migr = findViewById(R.id.tv_cuot);
        tin_migr = findViewById(R.id.tv_tin);

        Intent i = getIntent();

        String cantidad_migrada =  i.getStringExtra("cantidad");
        String cuota_migrada =  i.getStringExtra("cuota");
        String tin_migrado =  i.getStringExtra("tin");


        cant_migr.setText(cantidad_migrada);
        cuot_migr.setText(cuota_migrada);
        tin_migr.setText(tin_migrado);



//=============================================================================\\










    }
}