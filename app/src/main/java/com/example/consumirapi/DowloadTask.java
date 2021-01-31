package com.example.consumirapi;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class DowloadTask extends AsyncTask<String, Void, Void>
{



  static JSONArray jsonArrayRates = new JSONArray();


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)

    @Override

    protected  Void doInBackground(String... endPoint)
    {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(endPoint[0])
                .get()
                .addHeader("x-rapidapi-key", "f3b4031890msh7bdd9d4ec3754c3p1b3801jsn0c74a3997fab")
                .addHeader("x-rapidapi-host", "currencyscoop.p.rapidapi.com")
                .build();


        try
        {
            Response response = client.newCall(request).execute();
            String jsonData = response.body().string();

            JSONObject json = new JSONObject(jsonData);


            JSONObject respuestaResponse= json.getJSONObject("response");
            Iterator i = respuestaResponse.keys();
            JSONArray jsonArrayResponse = new JSONArray();

            while (i.hasNext())
            {
                String key = (String) i.next();
                jsonArrayResponse.put(respuestaResponse.get(key));
            }

            JSONObject respuestaRates= (JSONObject) jsonArrayResponse.get(2);
            Iterator j = respuestaRates.keys();


            while (j.hasNext())
            {
                String key = (String) j.next();
                jsonArrayRates.put(respuestaRates.get(key));
            }

        }
        catch (IOException | JSONException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid)
    {
        super.onPostExecute(aVoid);
        Screen_conver.prueba();
    }

}