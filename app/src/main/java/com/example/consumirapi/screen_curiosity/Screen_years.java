package com.example.consumirapi.screen_curiosity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.consumirapi.R;

public class Screen_years extends AppCompatActivity {

    Button obtener;
    EditText number;

    static TextView curiositydos;
    static Editable años;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_years);

        obtener = findViewById(R.id.obtener_btn);
        number = findViewById(R.id.año_int);
        curiositydos = findViewById(R.id.curiosidadTrescpy3);
        años = number.getText();
    }

    public void obtenerCuriosidadYears(View v)
    {
        if(number.getText().toString().isEmpty())
        {
            Toast.makeText(this, "¡ERROR! Debes introducir un número", Toast.LENGTH_SHORT).show();
            curiositydos.setText(" ");
        }
        else
        {
            DownloadTaskYears task = new DownloadTaskYears();
            task.execute("https://numbersapi.p.rapidapi.com/" + años + "/year?fragment=true&json=true");
        }
    }

    static void methodYears()
    {
        curiositydos.setText(DownloadTaskYears.respuestaResponseYears);
    }
}