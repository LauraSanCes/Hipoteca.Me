package com.example.consumirapi.screen_catalogo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.consumirapi.R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class AdapterPersn
{
    ArrayList<Item_casa> casaList;
    Context context;

    public AdapterPersn(ArrayList<Item_casa> casaList, Context context)
    {
        this.casaList = casaList;
        this.context = context;
    }


    @Override
    public int getCount() {
        return casaList.size();
    }

    @Override
    public Object getItem(int position) {
        return casaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Item_casa casa = (Item_casa) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list, null);
        ImageView casaImage = convertView.findViewById(R.id.casa_imag);
        TextView casaNombre = convertView.findViewById(R.id.casa_name);
        TextView casaPrecio = convertView.findViewById(R.id.casa_price);


        Picasso.get().load(DownloadTask.casaImgs.get(position)).into(casaImage);
        casaNombre.setText(casa.getName());
        casaPrecio.setText(casa.getPrecio());
        return convertView;
    }
}
