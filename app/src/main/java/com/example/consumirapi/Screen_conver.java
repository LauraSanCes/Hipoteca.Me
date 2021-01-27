package com.example.consumirapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Screen_conver extends AppCompatActivity {

    EditText txt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_conver);

        DowloadTask task = new DowloadTask();
        task.execute("https://currencyscoop.p.rapidapi.com/latest");


        //------------------------------------------------------------------------------


        txt_result = findViewById(R.id.editText_result);


        txt_result.setFocusable(false);
        txt_result.setText("98");

    }
}