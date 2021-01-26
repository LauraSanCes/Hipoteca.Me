package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Screen_amort extends AppCompatActivity {

    Spinner spinner_select;
    TextView txt_drop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_amort);

        spinner_select = findViewById(R.id.spinner);
        txt_drop = findViewById(R.id.txtv);


        final String[] opciones = {"Prestamo hipotecario", "Prestamo personal"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, opciones);

        spinner_select.setAdapter(adapter);

        spinner_select.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // get selected item and assign to textview
                // ex: textView.setText(spinner.getSelectedItem().toString());

               if (spinner_select.getSelectedItemPosition() == 0)
               {
                   txt_drop.setText("Prestamo hipotecario");
               } else {
                   txt_drop.setText("Prestamo personal");
               }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // handle if you'd like to
            }
        });


    } //End onCreate

//TODO terminar diseño pantalla y programar componentes



}