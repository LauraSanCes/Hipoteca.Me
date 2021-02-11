package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Screen_calculadora extends AppCompatActivity
{
    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve,
            btnSuma, btnResta, btnMultiplica, btnDivide, btnClean, btnBorrar, btnPunto, btnIgual;

    TextView Resultado;

    double resultado;

    String operador = "";
    String mostrar , reserva;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_calculadora);

        btnCero = findViewById(R.id.Cero);
        btnUno = findViewById(R.id.Uno);
        btnDos = findViewById(R.id.Dos);
        btnTres = findViewById(R.id.Tres);
        btnCuatro = findViewById(R.id.Cuatro);
        btnCinco = findViewById(R.id.Cinco);
        btnSeis = findViewById(R.id.Seis);
        btnSiete = findViewById(R.id.Siete);
        btnOcho = findViewById(R.id.Ocho);
        btnNueve = findViewById(R.id.Nueve);
        btnSuma = findViewById(R.id.Suma);
        btnResta = findViewById(R.id.Resta);






    }
}