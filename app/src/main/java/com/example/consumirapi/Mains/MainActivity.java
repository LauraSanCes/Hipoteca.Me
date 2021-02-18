package com.example.consumirapi.Mains;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.consumirapi.R;
import com.example.consumirapi.screen_catalogo.Screen_catalogo;
import com.example.consumirapi.screen_credits.Screen_credits;
import com.example.consumirapi.screen_curiosity.MainActivity_Curiosity;

public class MainActivity extends AppCompatActivity
{

    Button herramientas, exit, creditos;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        herramientas = findViewById(R.id.tools);
        exit = findViewById(R.id.btn_exit);
        creditos = findViewById(R.id.btn_cred);
    }

    public void onClickTools(View v)
    {
        Intent i = new Intent(this, MainActivity2.class);

        startActivity(i);
    }

    public void onClickCatalog(View v)
    {
    Intent i = new Intent(this, Screen_catalogo.class);

    startActivity(i);
    }

    public void onClickCuriosity(View v)
    {
        Intent i = new Intent(this, MainActivity_Curiosity.class);

        startActivity(i);
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