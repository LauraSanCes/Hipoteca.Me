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
    static EditText txt_intro;
    static Spinner origen;
    static Spinner end;


    static Double Primercalculo;
    static Double Segundocalculo;

    static Context context;

    static ArrayList<Object> valores = new ArrayList<Object>();


    static String moneda;
    static double cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_conver);

        origen = findViewById(R.id.drop_from);
        end = findViewById(R.id.drop_to);
        txt_result = findViewById(R.id.editText_result);
        txt_intro = findViewById(R.id.editText_cant);
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



       // txt_result.setText(String.valueOf(valores.get(1)));  //ENTRAN LOS NUMEROS EN EL EMULADOR

        final String[] opciones = {"---","USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.spinner_item, opciones);

        final String[] opciones2 = {"---", "USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.spinner_item, opciones2);


        origen.setAdapter(adapter);
        end.setAdapter(adapter2);


        origen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (origen.getSelectedItemPosition() == 0)
                {
                    //txt_intro.setText("0");
                }
                else if (origen.getSelectedItemPosition() == 1)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (int) valores.get(0);


                    //txt_intro.setText("12");
                }
                else if(origen.getSelectedItemPosition() == 2)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(1);
                   // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 3)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(2);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 4)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(3);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 5)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(4);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 6)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(5);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 7)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(6);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 8)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(7);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 9)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(8);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 10)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(9);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 11)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(10);
                    // System.out.println(Primercalculo);
                }
                else if(origen.getSelectedItemPosition() == 12)
                {
                    moneda = txt_intro.getText().toString();
                    cantidad = Double.parseDouble(moneda);
                    Primercalculo = cantidad / (double) valores.get(11);
                    // System.out.println(Primercalculo);
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

                if (end.getSelectedItemPosition() == 0)
                {
                    txt_result.setText("0");
                }

               else if (end.getSelectedItemPosition() == 1)
                {
                    Segundocalculo = Primercalculo * (int) valores.get(0);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));
                }
                else if(end.getSelectedItemPosition() == 2)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(1);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }
                else if(end.getSelectedItemPosition() == 3)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(2);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }

                else if(end.getSelectedItemPosition() == 4)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(3);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }
                else if(end.getSelectedItemPosition() == 5)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(4);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }
                else if(end.getSelectedItemPosition() == 6)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(5);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }
                else if(end.getSelectedItemPosition() == 7)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(6);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }
                else if(end.getSelectedItemPosition() == 8)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(7);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }

                else if(end.getSelectedItemPosition() == 9)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(8);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }
                else if(end.getSelectedItemPosition() == 10)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(9);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }

                else if(end.getSelectedItemPosition() == 11)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(10);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }
                else if(end.getSelectedItemPosition() == 12)
                {

                    Segundocalculo = Primercalculo * (double) valores.get(11);
                    // System.out.println(Segundocalculo);
                    txt_result.setText(String.valueOf(Segundocalculo));

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                //Apriori va a estar vacio
            }
        });




    }

    }
