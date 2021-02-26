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

public class Screen_dates extends AppCompatActivity {

    Button obtener;
    EditText dia;
    EditText mes;

    static TextView curiositytres;
    static Editable dias;
    static Editable meses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_dates);

        obtener = findViewById(R.id.obtencion);
        dia = findViewById(R.id.Dia);
        mes = findViewById(R.id.Mes);
        curiositytres = findViewById(R.id.CuriosidadTres);

        dias = dia.getText();
        meses = mes.getText();
    }

    public void obtenerCuriosidadTres(View v)
    {

        String dia_user = dia.getText().toString();

        String mes_user = mes.getText().toString();


        if (dia.getText().toString().isEmpty() || mes.getText().toString().isEmpty() )
        {
            Toast.makeText(this, "¡ERROR! Debes introducir tanto el día como el mes", Toast.LENGTH_SHORT).show();
            curiositytres.setText(" ");
        }
        else
        {
            int dia_user_int = Integer.parseInt(dia_user);
            int mes_user_int = Integer.parseInt(mes_user);

            if((dia_user_int > 30 || dia_user_int < 1 ) || (mes_user_int > 12 || mes_user_int < 1) || (dia_user_int == 30 && mes_user_int == 2) )
            {
                Toast.makeText(this, "¡ERROR! Día o mes inválido", Toast.LENGTH_SHORT).show();
            }
            else
            {
                DownloadTaskDates task = new DownloadTaskDates();
                task.execute("https://numbersapi.p.rapidapi.com/" + meses + "/" + dias + "/date?fragment=true&json=true");
            }
        }
    }

    static void methodDates()
    {
        curiositytres.setText(DownloadTaskDates.respuestaResponseDates);
    }
}