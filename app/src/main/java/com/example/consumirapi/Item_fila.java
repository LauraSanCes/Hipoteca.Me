package com.example.consumirapi;


public class Item_fila
{


    int id;
    String cuota_const, interes, cap_pend;


    public Item_fila(int id, String cuota_const, String interes, String cap_pend)
    {
        this.id = id;
        this.cuota_const = cuota_const;
        this.interes = interes;
        this.cap_pend = cap_pend;
    }

    public int getId() {
        return id;
    }

    public String getCuota_const() {
        return cuota_const;
    }

    public String getInteres() {
        return interes;
    }

    public String getCap_pend() {
        return cap_pend;
    }
}