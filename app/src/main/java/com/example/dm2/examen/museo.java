package com.example.dm2.examen;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

public class museo extends AppCompatActivity {

    private String nombre;
    private String localizacion;
    private String web;
    private String direccion;
    private Drawable imagen;

    public museo(String nom, String sitio, Drawable img,String web, String dire){

        nombre=nom;
        this.localizacion=sitio;
        this.imagen=img;
        this.web=web;
        this.direccion=dire;
    }

    public String getNombre() {
        return nombre;
    }
    public String getLocalizacion() {
        return localizacion;
    }

    public Drawable getImagen() {
        return imagen;
    }
    public String getWeb() {
        return web;
    }
    public String getDireccion() {
        return direccion;
    }
}
