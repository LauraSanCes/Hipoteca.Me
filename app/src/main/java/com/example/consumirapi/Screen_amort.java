package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Screen_amort extends AppCompatActivity {

    Spinner spinner_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_amort);

        spinner_select = findViewById(R.id.spinner);


        String[] opciones = {"Prestamo hipotecario", "Prestamo personal"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, opciones);

        spinner_select.setAdapter(adapter);

    }
/*
    public void spinner_info(View a)
    {

        String seleccion = spinner_select.getSelectedItem().toString();


        switch (seleccion)
        {
            case "Prestamo hipotecario":
                Toast.makeText(this, "Prestamo hipotecario", Toast.LENGTH_SHORT).show();
                break;
            case "Prestamo personal":
                Toast.makeText(this, "Prestamo personal", Toast.LENGTH_SHORT).show();
                break;
        }
        //tv1.setText(seleccion);
    }

 */


}