package com.example.dm2.examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPropio extends ArrayAdapter<museo> {

    private museo[] datos;

    public AdaptadorPropio(Context context, museo[] datos) {

        super(context, R.layout.museos, datos);
        this.datos=datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.museos, null);

        TextView nombre = (TextView)item.findViewById(R.id.nombremuseo);
        nombre.setText(datos[position].getNombre());

        TextView lblSubtitulo = (TextView)item.findViewById(R.id.localizacion);
        lblSubtitulo.setText(datos[position].getLocalizacion());

        ImageView imagen = (ImageView) item.findViewById(R.id.fotomuseo);
        imagen.setImageDrawable(datos[position].getImagen());
        return(item);
    }
}
