package com.example.consumirapi.screen_amort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.consumirapi.R;
import com.example.consumirapi.screen_amort.AdapterPersn;
import com.example.consumirapi.screen_amort.Item_fila;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity_AdpPrs extends AppCompatActivity {

    double aux;

    ListView listView;

    ArrayList<Item_fila> registros = new ArrayList<>();
    ArrayList<Item_fila> getResgistros() {return registros;}

    DecimalFormat form = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_migra_datos);

        listView = findViewById(R.id.listView_ID);

        Intent i = getIntent();

        String cantidad_migrada =  i.getStringExtra("cantidad");
        String cuota_migrada =  i.getStringExtra("cuota");
        String tin_migrado =  i.getStringExtra("tin");


        int cantidad = Integer.parseInt(cantidad_migrada);
        int cuotas = Integer.parseInt(cuota_migrada);
        int tin = Integer.parseInt(tin_migrado);


        double cuotaFija = 0;
        double interes = ((tin/100f)/12);
        double capitalPendiente = cantidad;


//===================================CUENTAS + IMPRESIÓN TABLA=====================================\\


        for (int j = 1; j < cuotas+1; j++)
        {
            //---------------------CUOTAS----------------------\\

            cuotaFija = cantidad/cuotas+1;

            String cuota_fixed = form.format(cuotaFija);

            //---------------------INTERESES----------------------\\

            double interesCuota = interes * capitalPendiente;

            String interes_fixed = form.format(interesCuota);

            //---------------------CAP. PEND----------------------\\

            capitalPendiente = capitalPendiente - cuotaFija;

            if(j == cuotas - 1)
            {
                aux = capitalPendiente;
            }

            if (j == cuotas)
            {
                cuotaFija = aux;
                cuota_fixed = form.format(cuotaFija);
                capitalPendiente = 0;
            }

            String cap_pend_fixed = form.format(capitalPendiente);

            //---------------------INSERT----------------------\\

            registros.add(new Item_fila(j, cuota_fixed, interes_fixed, cap_pend_fixed));

        }

    AdapterPersn adapter = new AdapterPersn(registros, this);

    listView.setAdapter(adapter);
    }
}