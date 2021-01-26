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

        txt_result = findViewById(R.id.editText_result);


        txt_result.setFocusable(false);
        txt_result.setText("98");

    }
}