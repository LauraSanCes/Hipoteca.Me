package com.example.consumirapi.screen_amort;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.consumirapi.R;

import java.util.ArrayList;

public class AdapterPersn extends BaseAdapter
{

    ArrayList<Item_fila> registros;
    Context context;


    public AdapterPersn(ArrayList<Item_fila> registros, Context context)
    {
        this.registros = registros;
        this.context = context;
    }


    @Override
    public int getCount() {
        return registros.size();
    }

    @Override
    public Item_fila getItem(int position) {
        return registros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {


        convertView = LayoutInflater.from(context).inflate(R.layout.item_fila, null);

        TextView pkmID = convertView.findViewById(R.id.txt_view_id);
        TextView pkmCUOTA_CONST = convertView.findViewById(R.id.txt_view_result);
        TextView pkmINTERES = convertView.findViewById(R.id.txt_view_interes);
        TextView pkmCAPEND = convertView.findViewById(R.id.txt_view_pend);


        Item_fila curremtpk = getItem(position);
        pkmID.setText("" + curremtpk.getId());
        pkmCUOTA_CONST.setText("" + curremtpk.getCuota_const());
        pkmINTERES.setText("" + curremtpk.getInteres());
        pkmCAPEND.setText("" + curremtpk.getCap_pend());

        return convertView;
    }
}
