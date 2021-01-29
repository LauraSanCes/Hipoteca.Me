package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Screen_conver extends AppCompatActivity {

    EditText txt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Spinner origen;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_conver);

        origen = findViewById(R.id.drop_from);


        DowloadTask task = new DowloadTask();
        task.execute("https://currencyscoop.p.rapidapi.com/latest");

        //---------------------------------------------------------------------------------


        txt_result = findViewById(R.id.editText_result);


        txt_result.setFocusable(false);
        txt_result.setText("98");

        //---------------------------------------------------------------------------------

        final String[] opciones = {"USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, opciones);

        origen.setAdapter(adapter);

        origen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // handle if you'd like to
            }
        });


    } //End onCreate



    }
