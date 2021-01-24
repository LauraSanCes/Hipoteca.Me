package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Screen_amort extends AppCompatActivity
{

    Spinner dropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_amort);

        dropdown = findViewById(R.id.spinner);


        String[] opciones = {"Prestamo hipotecario", "Prestamo personal"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout., opciones);

        dropdown.setAdapter(adapter);
    }

    public void dropDown(View v)
    {

        String seleccion = dropdown.getSelectedItem().toString();

        switch (seleccion)
        {
            case "Prestamo hipotecario":
                Toast.makeText(this, "Prestamo hipotecario", Toast.LENGTH_SHORT).show();
                break;
            case "Prestamo personal":
                Toast.makeText(this, "Prestamo personal", Toast.LENGTH_SHORT).show();
                break;

        }
    }




}