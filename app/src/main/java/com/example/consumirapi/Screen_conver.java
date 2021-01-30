package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import org.json.JSONException;

import java.util.ArrayList;

public class Screen_conver extends AppCompatActivity
{

    static EditText txt_result;
    static Spinner origen;
    static Spinner end;

    static Context context;

    static ArrayList<Object> valores = new ArrayList<Object>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_conver);

        origen = findViewById(R.id.drop_from);
        end = findViewById(R.id.drop_to);
        txt_result = findViewById(R.id.editText_result);
        context = getApplicationContext();

//---------------------------------------------------------------------------
        DowloadTask task = new DowloadTask();
        task.execute("https://currencyscoop.p.rapidapi.com/latest");
//---------------------------------------------------------------------------------
        txt_result.setFocusable(false);
//---------------------------------------------------------------------------------

    } //End onCreate


    static void prueba()
    {
        for (int i = 0; i < DowloadTask.jsonArrayRates.length() ; i++)
        {
            try {
                valores.add(DowloadTask.jsonArrayRates.get(i));

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        //Log.i("TAG", "Estos son los valores: " + valores);

       //System.out.println(valores.get(0)); //imprime los valores correctos segun el numero del array que le asigne

        txt_result.setText(String.valueOf(valores.get(1)));  //ENTRAN LOS NUMEROS EN EL EMULADOR

        final String[] opciones = {"USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.spinner_item, opciones);

        final String[] opciones2 = {"USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner_item, opciones2);


        origen.setAdapter(adapter);
        end.setAdapter(adapter2);


        origen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

                if (origen.getSelectedItemPosition() == 0)
                {
                    txt_result.setText(String.valueOf(valores.get(0)));
                }
                else if(origen.getSelectedItemPosition() == 1)
                {

                    // txt_result.setText(String.valueOf(valores.get(1)));



                }


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




    }

    }
