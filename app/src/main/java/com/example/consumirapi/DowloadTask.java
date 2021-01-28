package com.example.consumirapi;

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


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected Void doInBackground(String... endPoint)
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

            //System.out.println(response);
//-------------------------------------------------------------------------------HASTA AQUI FUNCIONA, COGE LA API-------------------------------------------------------------------------------------//
            String jsonData = response.body().string();
            //Log.i("Respuesta", jsonData);
//-----------------------------------------------------------------------------------Esto parece fucionar tambien--------------------------------------------------------------------------------//

            //------------------------------------------------------------------Aqui es donde comienza el error, esta al crear el jsonArray--------------------------------------------------------//
//------------------------------------------------Aqui es donde meto el object en el Array-----------------------------------
            JSONObject json = new JSONObject(jsonData);

            //System.out.println(json);
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
            JSONArray jsonArrayRates = new JSONArray();

            while (j.hasNext())
            {
                String key = (String) j.next();
                jsonArrayRates.put(respuestaRates.get(key));
            }
            for (int k = 0; k < jsonArrayRates.length() ; k++) {
                System.out.println(jsonArrayRates.get(k));
            }


           //Me parece que el error se encuentra en que en nuestra API no usamos hay ningun JSOArray, sino que deberiamos usar directamente el JSONObject

           /* JSONObject valor = new JSONObject(jsonData);
            System.out.println(valor);
            */
       //JSONObject jsonObject = new JSONObject(jsonData);
            //System.out.println(jsonObject);

     /*  JSONArray monedas = jsonObject.getJSONArray("base");

            for (int i = 0; i < monedas.length() ; i++)
            {
                JSONObject c = monedas.getJSONObject(i);

                String dinero = c.getString("rates");

                System.out.println(dinero);

            }

      */



/*            JSONArray jsonArray = new JSONArray(jsonData);

            for (int i = 0; i < jsonArray.length() ; i++)
            {
                JSONObject valor = jsonArray.getJSONObject(i);
                System.out.println(valor.getString("EUR"));
            }

 */
        }
        catch (IOException | JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}/*
    JSONObject json = new JSONObject
    JSONArray jarray = new JSONArray
jarray.put("primer insert", "segundo insert"...)
        json.put("insert",jarray);

 */
