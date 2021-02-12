package com.example.consumirapi.screen_catalogo;

public class Item_casa
{
    String name, precio;


    public Item_casa(String name, String precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public String getPrecio() {
        return precio;
    }
}
