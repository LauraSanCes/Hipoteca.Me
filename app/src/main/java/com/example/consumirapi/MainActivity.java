package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button amort, conversor, calculadora, exit, creditos;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amort = findViewById(R.id.btn_amort);
        conversor = findViewById(R.id.btn_conver);
        calculadora = findViewById(R.id.btn_calc);
        exit = findViewById(R.id.btn_exit);
        creditos = findViewById(R.id.btn_cred);
    }


   public void onClickAmort(View v)
   {

   }

    public void onClickConver(View v)
    {

    }

    public void onClickCalc(View v)
    {

    }

    public void onClickExit(View v)
    {
        System.exit(0);
    }

    public void onClickCredit(View v)
    {
        Intent i = new Intent(this, Screen_credits.class);

        startActivity(i);
    }
}