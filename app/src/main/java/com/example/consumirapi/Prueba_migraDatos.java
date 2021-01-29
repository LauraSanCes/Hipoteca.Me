package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Prueba_migraDatos extends AppCompatActivity {

    TextView cant_migr, cuot_migr;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_migra_datos);

        cant_migr = findViewById(R.id.tv_cant);
        cuot_migr = findViewById(R.id.tv_cuot);





    }
}