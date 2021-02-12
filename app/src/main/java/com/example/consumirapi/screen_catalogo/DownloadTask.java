package com.example.consumirapi.screen_catalogo;

import android.os.AsyncTask;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.ArrayList;

public class DownloadTask extends AsyncTask<String, Void, Void>
{
    static ArrayList<String> casaNames = new ArrayList<>();
    static ArrayList<String> casaPrices = new ArrayList<>();
    static ArrayList<String> casaImgs = new ArrayList<>();
    static ArrayList<String> casasNombresMios = new ArrayList<>();
    static ArrayList<String> casasNombresPropios = new ArrayList<>();
    static ArrayList<String> completarUrlsFotos = new ArrayList<>();
    static ArrayList<String> casasPreciosMios = new ArrayList<>();


    ArrayList<String> casaUrls = new ArrayList<>();
    String casitas, precios;


    @Override
    protected Void doInBackground(String... url)
    {
        try {
            Document resultadoCompleto = Jsoup.connect(url[0]).get();

            //----------------------------------------------------------------- Para consumir las fotos de la web

            casasNombresMios.add("elisa");
            casasNombresMios.add("calella");
            casasNombresMios.add("egeo-3");
            casasNombresMios.add("cabrejas");
            casasNombresMios.add("paris");
            casasNombresMios.add("modelo-victoria");
            casasNombresMios.add("alabama-3d");
            casasNombresMios.add("onice");
            casasNombresMios.add("modelo-barcelona");
            casasNombresMios.add("lisboa");

            //----------------------------------------------------------------- Para Setear los nombres de las casas

            casasNombresPropios.add("Elisa");
            casasNombresPropios.add("Calella");
            casasNombresPropios.add("Egeo 3");
            casasNombresPropios.add("Cabrejas");
            casasNombresPropios.add("Paris");
            casasNombresPropios.add("Mod. Victoria");
            casasNombresPropios.add("Alabama 3D");
            casasNombresPropios.add("Ónice");
            casasNombresPropios.add("Mod. Barcelona");
            casasNombresPropios.add("Lisboa");

            //----------------------------------------------------------------- Para Setear los precios de las casas

            casasPreciosMios.add("115.376€");
            casasPreciosMios.add("154.890€");
            casasPreciosMios.add("205.564€");
            casasPreciosMios.add("69.500€");
            casasPreciosMios.add("65.340€");
            casasPreciosMios.add("124.600€");
            casasPreciosMios.add("85.782€");
            casasPreciosMios.add("359.500€");
            casasPreciosMios.add("400.356€");
            casasPreciosMios.add("56.128€");


            //INTENTAMOS PROBAR A CONSUMIR LOS NOMBRES DESDE LA WEB, PERO POR ACTUALIZARSE CONSTANTEMENTE, ES IMPOSIBLE, LOS NOMBRES DESAPARECEN\\

        /*
            for (int j = 0; j < casasNombresMios.size() ; j++)
            {
                 casitas = resultadoCompleto.select("[href^=https://facilhouse.com/modelo-casa/" + casasNombresMios.get(j) + "/]") ;
                 //casaNames = (ArrayList<String>) casitas.eachText();
                casaNames.add(String.valueOf(casitas.eachText()));
            }
         */



            for (int j = 0; j < casasNombresMios.size() ; j++)
            {
                casitas = casasNombresPropios.get(j) ;
                casaNames.add(String.valueOf(casitas));
            }


            for (int i = 0; i < casasNombresMios.size(); i++)
            {
                casaUrls.add("https://facilhouse.com/modelo-casa/" + casasNombresMios.get(i) + "/");
            }


            for (int j = 0; j < casasPreciosMios.size() ; j++)
            {
                precios = casasPreciosMios.get(j) ;
                casaPrices.add(String.valueOf(precios));
            }



//----------------------------------------------IMPRIME LAS URLS DE LAS IMAGENES DE LAS CASAS-----------------------------------------------------------------------------------------
            completarUrlsFotos.add("/2019/07/micasademadera_elisa_1-800x430");
            completarUrlsFotos.add("/2020/07/casa-acero-hormigon-homecenter-calella-700x430");
            completarUrlsFotos.add("/2020/04/casa-modular-hormigon-modunova-egeo3");
            completarUrlsFotos.add("/2020/12/casa-acero-soriamodular-cabrejas");
            completarUrlsFotos.add("/2020/07/casa-madera-ecotown-ref208-700x430");
            completarUrlsFotos.add("/2020/11/casa-madera-modularisclimad-victoria-700x430");
            completarUrlsFotos.add("/2020/11/casa-movil-alucasa-alabama3d");
            completarUrlsFotos.add("/2020/09/casa-acero-hormigon-atlantidahomes-onice");
            completarUrlsFotos.add("/2020/11/casa-hormigon-theconcretehome-barcelona-2-1");
            completarUrlsFotos.add("/2020/08/casa-madera-ecotown-casa178-700x430");

            for (int i = 0; i < casaUrls.size(); i++)
            {
                String thisUrl = "https://facilhouse.com/wp-content/uploads" + completarUrlsFotos.get(i) + ".jpg";
                casaImgs.add(thisUrl);
            }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid)
    {
        super.onPostExecute(aVoid);
        Screen_catalogo.cargarCasas();
    }
}
