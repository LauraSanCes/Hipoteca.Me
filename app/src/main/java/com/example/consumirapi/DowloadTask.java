package com.example.consumirapi;

import android.os.AsyncTask;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class DowloadTask extends AsyncTask<String, Void, Void>
{

    @Override
    protected Void doInBackground(String... endPoint)
    {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(endPoint[0])
                .get()
                .addHeader("x-rapidapi-key", "f3b4031890msh7bdd9d4ec3754c3p1b3801jsn0c74a3997fab")
                .addHeader("x-rapidapi-host", "football98.p.rapidapi.com")
                .build();

        try
        {
            Response response = client.newCall(request).execute();
            //Recupero la informacion en formato string
            String jsonData = response.body().string();
            //La informacio tipo string la convertimos en informacion tipo JSONArray
            JSONArray jsonArray = new JSONArray(jsonData);
           //Una vez tengamos el array, podemos acceder a cada uno de los objetos contenido en este
            //for para mostrar los equipos

            for (int i = 0; i < jsonArray.length() ; i++)
            {
                JSONObject equipo = jsonArray.getJSONObject(i);
                System.out.println(equipo.getString("squad_name"));
                System.out.println(equipo.getString("squad_points"));
            }
           // System.out.println(jsonData);
        }
        catch (IOException | JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
