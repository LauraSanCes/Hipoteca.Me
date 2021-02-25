package com.example.consumirapi.screen_conver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.consumirapi.Mains.MainActivity2;
import com.example.consumirapi.R;

import org.json.JSONException;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Screen_conver extends AppCompatActivity
{

    static DecimalFormat form = new DecimalFormat("0.00");

    static EditText txt_result;
    static EditText txt_intro;
    static Spinner origen;
    static Spinner end;


    static double primerCalculo;
    static double segundoCalculo;

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

//--------------------------------------------------------------------------------
        DowloadTask task = new DowloadTask();
        task.execute("https://currencyscoop.p.rapidapi.com/latest");
//--------------------------------------------------
        txt_result.setFocusable(false);
//---------------------------------------------------------------------------------
    } //End onCreate



    static void prueba()
    {

        for (int i = 0; i < DowloadTask.jsonArrayRates.length() ; i++)
        {
            try
            {
                valores.add(DowloadTask.jsonArrayRates.get(i));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }


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
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (int) valores.get(0);
                    }
                }
                else if(origen.getSelectedItemPosition() == 2)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(1);
                    }
                }
                else if(origen.getSelectedItemPosition() == 3)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(2);
                    }
                }
                else if(origen.getSelectedItemPosition() == 4)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(3);
                    }
                }
                else if(origen.getSelectedItemPosition() == 5)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(4);
                    }
                }
                else if(origen.getSelectedItemPosition() == 6)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(5);
                    }
                }
                else if(origen.getSelectedItemPosition() == 7)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(6);
                    }
                }
                else if(origen.getSelectedItemPosition() == 8)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(7);
                    }
                }
                else if(origen.getSelectedItemPosition() == 9)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(8);
                    }
                }
                else if(origen.getSelectedItemPosition() == 10)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(9);
                    }
                }
                else if(origen.getSelectedItemPosition() == 11)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(10);
                    }
                }
                else if(origen.getSelectedItemPosition() == 12)
                {
                    if (txt_intro.getText().toString().isEmpty())
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir", Toast.LENGTH_SHORT).show();
                        origen.setSelection(0);
                    }
                    else
                    {
                        moneda = txt_intro.getText().toString();
                        cantidad = Double.parseDouble(moneda);
                        primerCalculo = cantidad / (double) valores.get(11);
                    }
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
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
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (int) valores.get(0);
                        double absolute_resul = Math.abs(segundoCalculo);
                        String resul_final_fixed = form.format(absolute_resul);
                        txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 2)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(1);
                            double absolute_resul = Math.abs(segundoCalculo);
                            String resul_final_fixed = form.format(absolute_resul);
                            txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 3)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(2);
                            double absolute_resul = Math.abs(segundoCalculo);
                            String resul_final_fixed = form.format(absolute_resul);
                            txt_result.setText(resul_final_fixed);
                    }
                }

                else if(end.getSelectedItemPosition() == 4)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(3);
                            double absolute_resul = Math.abs(segundoCalculo);
                            String resul_final_fixed = form.format(absolute_resul);
                            txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 5)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(4);
                            double absolute_resul = Math.abs(segundoCalculo);
                            String resul_final_fixed = form.format(absolute_resul);
                            txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 6)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(5);
                        double absolute_resul = Math.abs(segundoCalculo);
                        String resul_final_fixed = form.format(absolute_resul);
                        txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 7)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(6);
                        double absolute_resul = Math.abs(segundoCalculo);
                        String resul_final_fixed = form.format(absolute_resul);
                        txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 8)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(7);
                        double absolute_resul = Math.abs(segundoCalculo);
                        String resul_final_fixed = form.format(absolute_resul);
                        txt_result.setText(resul_final_fixed);
                    }
                }

                else if(end.getSelectedItemPosition() == 9)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(8);
                            double absolute_resul = Math.abs(segundoCalculo);
                            String resul_final_fixed = form.format(absolute_resul);
                            txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 10)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(9);
                        double absolute_resul = Math.abs(segundoCalculo);
                        String resul_final_fixed = form.format(absolute_resul);
                        txt_result.setText(resul_final_fixed);
                    }
                }

                else if(end.getSelectedItemPosition() == 11)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(10);
                        double absolute_resul = Math.abs(segundoCalculo);
                        String resul_final_fixed = form.format(absolute_resul);
                        txt_result.setText(resul_final_fixed);
                    }
                }
                else if(end.getSelectedItemPosition() == 12)
                {
                    if (txt_intro.getText().toString().isEmpty() || origen.getSelectedItemPosition() == 0 )
                    {
                        Toast.makeText(context, "¡ERROR!", Toast.LENGTH_SHORT).show();
                        Toast.makeText(context, "Debes poner primero la cantidad que deseas convertir y además, elegir la moneda", Toast.LENGTH_SHORT).show();
                        end.setSelection(0);
                    }
                    else
                    {
                        segundoCalculo = primerCalculo * (double) valores.get(11);
                        double absolute_resul = Math.abs(segundoCalculo);
                        String resul_final_fixed = form.format(absolute_resul);
                        txt_result.setText(resul_final_fixed);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

    public void onClickInfo(View v)
    {
        Intent i = new Intent(this, Screen_info.class);

        startActivity(i);
    }
}