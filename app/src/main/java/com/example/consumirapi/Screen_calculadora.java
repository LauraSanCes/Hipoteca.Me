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
        btnMultiplica = findViewById(R.id.Multiplica);
        btnDivide = findViewById(R.id.Divide);
        btnClean = findViewById(R.id.Clean);
        btnBorrar = findViewById(R.id.Borrar);
        Resultado = findViewById(R.id.Etiqueta);
        btnPunto = findViewById(R.id.Punto);
        btnIgual = findViewById(R.id.Igual);



        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "0";
                Resultado.setText(mostrar);
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("-");
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });






    }
}