package com.example.consumirapi.screen_curiosity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.consumirapi.R;

public class MainActivity_Curiosity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__curiosity);
    }

    public void numberos(View v)
    {
        Intent i = new Intent(this, Screen_numbers.class);

        startActivity(i);
    }

    public void years(View v)

    {
        Intent i = new Intent(this, Screen_years.class);

        startActivity(i);
    }

    public void dates(View v)
    {
        Intent i = new Intent(this, Screen_dates.class);

        startActivity(i);
    }

}