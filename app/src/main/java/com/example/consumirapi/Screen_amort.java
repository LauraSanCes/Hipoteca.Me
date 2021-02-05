package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Screen_amort extends AppCompatActivity {

    Spinner spinner_select;
    TextView txt_tin, txt_tae;
    EditText ed_txt_cant, ed_txt_cuot;

    int cantidad, cuotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_amort);

        spinner_select = findViewById(R.id.spinner);
        txt_tin = findViewById(R.id.textView_tin);
        txt_tae = findViewById(R.id.textView_tae);
        ed_txt_cant = findViewById(R.id.editText_cant);
        ed_txt_cuot = findViewById(R.id.editText_cuot);


        final String[] opciones = {"Prestamo hipotecario", "Prestamo personal"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, opciones);

        spinner_select.setAdapter(adapter);

        spinner_select.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


               if (spinner_select.getSelectedItemPosition() == 0)
               {
                   txt_tin.setText("2");
                   txt_tae.setText("4");
               } else {
                   txt_tin.setText("3");
                   txt_tae.setText("5");
               }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    } //End onCreate

public void calcular(View v)
{

    if(ed_txt_cant.getText().toString().isEmpty())
    {
        Toast.makeText(this, "¡ERROR!", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "¡Campo cantidad vacío!", Toast.LENGTH_SHORT).show();
    }
    else
    {
        String cantidad_txt = ed_txt_cant.getText().toString();

         cantidad = Integer.parseInt(cantidad_txt);
    }

    if (ed_txt_cuot.getText().toString().isEmpty())
    {
        Toast.makeText(this, "¡ERROR!", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "¡Campo cuotas vacío!", Toast.LENGTH_SHORT).show();
    }
    else
    {
        String cuotas_txt = ed_txt_cuot.getText().toString();

         cuotas = Integer.parseInt(cuotas_txt);
    }


    if (spinner_select.getSelectedItemPosition() == 0) {

        if ((cantidad < 30000 || cantidad > 500000) || (cuotas < 60 || cuotas > 360)) {
            Toast.makeText(this, "¡ERROR!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Cantidad MIN = 30.000 - Cantidad MAX = 500.000", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Cuotas MIN = 60 - Cuotas MAX = 360", Toast.LENGTH_SHORT).show();
        } else {

          String tin_str = (String) txt_tin.getText();
          int tin_int = Integer.parseInt(tin_str);
          String cant_user = String.valueOf(ed_txt_cant.getText());
          int cant_int = Integer.parseInt(cant_user);
          String cuot_user = String.valueOf(ed_txt_cuot.getText());
          int cuot_int = Integer.parseInt(cuot_user);

            Intent i = new Intent(this, MainActivity_AdpPrs.class);

            i.putExtra("cantidad", cant_user);
            i.putExtra("cuota", cuot_user);
            i.putExtra("tin", tin_str);

            startActivity(i);

        }
    } else {

        if ((cantidad < 3000 || cantidad > 20000) || (cuotas < 12 || cuotas > 84)) {
            Toast.makeText(this, "¡ERROR!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Cantidad MIN = 3.000 - Cantidad MAX = 20.000", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Cuotas MIN = 12 - Cuotas MAX = 84", Toast.LENGTH_SHORT).show();
        } else {

            String tin_str = (String) txt_tin.getText();
            int tin_int = Integer.parseInt(tin_str);
            String cant_user = String.valueOf(ed_txt_cant.getText());
            int cant_int = Integer.parseInt(cant_user);
            String cuot_user = String.valueOf(ed_txt_cuot.getText());
            int cuot_int = Integer.parseInt(cuot_user);

            Intent i = new Intent(this, MainActivity_AdpPrs.class);

            i.putExtra("cantidad", cant_user);
            i.putExtra("cuota", cuot_user);
            i.putExtra("tin", tin_str);

            startActivity(i);

        }
    }
 }
} //End class