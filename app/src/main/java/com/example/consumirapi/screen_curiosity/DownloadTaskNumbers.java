package com.example.consumirapi.screen_curiosity;


import android.os.AsyncTask;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;

public class DownloadTaskNumbers extends AsyncTask<String, Void, Void>
{
    static String respuestaResponseNumbers;

    @Override
    protected Void doInBackground(String... endPoint)
    {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(endPoint[0])
                .get()
                .addHeader("x-rapidapi-key", "f3b4031890msh7bdd9d4ec3754c3p1b3801jsn0c74a3997fab")
                .addHeader("x-rapidapi-host", "numbersapi.p.rapidapi.com")
                .build();
        try
        {
            Response response = client.newCall(request).execute();
            String jsonData = response.body().string();
            JSONObject json = new JSONObject(jsonData);
            respuestaResponseNumbers = (String) json.get("text");
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
       Screen_numbers.methodNumbers();
    }
}

