package com.example.consumirapi.screen_catalogo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.consumirapi.R;
import java.util.ArrayList;

public class Screen_catalogo extends AppCompatActivity {

    static ArrayList<Item_casa> casas = new ArrayList<>();
    static ListView listView;
    static AdapterPersn adapter;
    Intent i = new Intent(Intent.ACTION_VIEW);
    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_catalogo);

        DownloadTask task = new DownloadTask();
        task.execute("https://facilhouse.com/");
        listView = findViewById(R.id.listView);
        adapter = new AdapterPersn(casas, this);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                switch(position) {

                    case 0:
                        url = "https://facilhouse.com/modelo-casa/elisa/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 1:
                        url = "https://facilhouse.com/modelo-casa/calella/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 2:
                        url = "https://facilhouse.com/modelo-casa/egeo-3/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 3:
                        url = "https://facilhouse.com/modelo-casa/cabrejas/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 4:
                        url = "https://facilhouse.com/modelo-casa/paris/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 5:
                        url = "https://facilhouse.com/modelo-casa/modelo-victoria/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 6:
                        url = "https://facilhouse.com/modelo-casa/alabama-3d/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 7:
                        url = "https://facilhouse.com/modelo-casa/onice/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 8:
                        url = "https://facilhouse.com/modelo-casa/modelo-barcelona/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 9:
                        url = "https://facilhouse.com/modelo-casa/lisboa/";

                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                }
            }
        });
    }

    static void cargarCasas()
    {
        for (int i = 0; i < DownloadTask.casaNames.size(); i++)
        {
            casas.add(new Item_casa(DownloadTask.casaNames.get(i), DownloadTask.casaPrices.get(i)));
        }
        listView.setAdapter(adapter);
    }
}