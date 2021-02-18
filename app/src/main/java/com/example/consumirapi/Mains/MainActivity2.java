package com.example.consumirapi.Mains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.consumirapi.R;
import com.example.consumirapi.screen_amort.Screen_amort;
import com.example.consumirapi.screen_calculadora.Screen_calculadora;
import com.example.consumirapi.screen_conver.Screen_conver;

public class MainActivity2 extends AppCompatActivity {

    Button amort, conversor, calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        amort = findViewById(R.id.btn_amort);
        conversor = findViewById(R.id.btn_conver);
        calculadora = findViewById(R.id.btn_calc);
    }

    public void onClickAmort(View v)
    {
        Intent i = new Intent(this, Screen_amort.class);

        startActivity(i);
    }

    public void onClickConver(View v)
    {
        Intent i = new Intent(this, Screen_conver.class);

        startActivity(i);
    }

    public void onClickCalc(View v)
    {
        Intent i = new Intent(this, Screen_calculadora.class);

        startActivity(i);
    }
}