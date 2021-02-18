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



public class Screen_numbers extends AppCompatActivity
{
    Button obtener;
    EditText number;

    static TextView curiosity;
    static Editable numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_numbers);

        obtener = findViewById(R.id.Converti_btn);
        number = findViewById(R.id.Numero_Int);
        curiosity = findViewById(R.id.curiosidadTrescpy);
        numeros = number.getText();
    }

    public void obtenerCuriosidad(View v)
    {
        if(number.getText().toString().isEmpty())
        {
            Toast.makeText(this, "¡ERROR! Debes introducir un número", Toast.LENGTH_SHORT).show();
            curiosity.setText(" ");
        }
        else
        {
            DownloadTaskNumbers task = new DownloadTaskNumbers();
            task.execute("https://numbersapi.p.rapidapi.com/" + numeros + "/math?fragment=true&json=true");
        }
    }


    static void methodNumbers()
    {
        curiosity.setText(DownloadTaskNumbers.respuestaResponseNumbers);
    }



}