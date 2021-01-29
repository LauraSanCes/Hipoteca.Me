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
    Spinner origen;
    Spinner end;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_conver);

        origen = findViewById(R.id.drop_from);
        end = findViewById(R.id.drop_to);

        final String resul = String.valueOf(DowloadTask.resul);


        DowloadTask task = new DowloadTask();
        task.execute("https://currencyscoop.p.rapidapi.com/latest");

        //---------------------------------------------------------------------------------


        txt_result = findViewById(R.id.editText_result);


        txt_result.setFocusable(false);
        txt_result.setText("98");

        //---------------------------------------------------------------------------------

        final String[] opciones = {"USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, opciones);

        final String[] opciones2 = {"USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item, opciones2);


        origen.setAdapter(adapter);
        end.setAdapter(adapter2);


        origen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

                //System.out.println(resul);
                txt_result.setText(resul);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                    //Apriori va a estar vacio
            }
        });



        end.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                //Apriori va a estar vacio
            }
        });

    } //End onCreate



    }
