package com.example.consumirapi;

import android.os.AsyncTask;
import android.util.Log;

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
                .addHeader("x-rapidapi-host", "currencyscoop.p.rapidapi.com")
                .build();

        try
        {
            Response response = client.newCall(request).execute();

            System.out.println(response);
//-------------------------------------------------------------------------------HASTA AQUI FUNCIONA, COGE LA API-------------------------------------------------------------------------------------//
            String jsonData = response.body().string();
            System.out.println(jsonData);
//-----------------------------------------------------------------------------------Esto parece fucionar tambien--------------------------------------------------------------------------------//
            JSONArray jsonArray = new JSONArray(jsonData);


            //------------------------------------------------------------------Aqui es donde comienza el error, este debe estar en el array--------------------------------------------------------//

           /* JSONArray jsonArray = new JSONArray(jsonData);

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
}
