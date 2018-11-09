package com.example.dm2.examen;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class museas extends AppCompatActivity {

    private ListView lista;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museas);
        this.setTitle(R.string.listamuseos);

        lista=(ListView)findViewById(R.id.lista_museo);
        final museo[] museos= new museo[]{new museo("Museo Guggenheim de Bilbao","Bilbo(Bizkaia)",getDrawable(R.mipmap.ic_guggen),"https://www.guggenheim-bilbao.eus/","Abandoibarra Et.2, 48001 Bilbao"),
                new museo("Museo de Bellas Artes de Bilbao","Bilbo(Bizkaia)",getDrawable(R.mipmap.ic_bartebilbo),"https://www.museobilbao.com","Museo Plaza 2 Estacion de metro de Moyua 48809 Bilbao"),
                new museo("Museo San Telmo","Donostia(Gipuzkoa)",getDrawable(R.mipmap.ic_telmo),"https://www.santelmomuseoa.eus","Plaza Zuloaga1, 20003 San Sebastian - Donostia"),
                new museo("Azkuna Zentroa","Bilbo (Bizkaia)",getDrawable(R.mipmap.ic_azkuna),"https://www.azkunazentroa.eus","Plaza Arriquibar, 4, 4008 Bilbao"),
                new museo("Museo de Bellas Artes","Gasteiz(Araba)",getDrawable(R.mipmap.ic_bgasteiz),"http://moodle.icjardin.com","Paseo Fray Francisco, 8, 01107 Vitoria-Gasteiz"),
                new museo("Tabakalera","Donostia(Gipuzkoa)",getDrawable(R.mipmap.ic_tabakalera),"https://www.tabakalera.eu/eu","Plaza de las cigarreras,1, 20012 San Sebastian - Donostia"),
                new museo("Museo Diocesano de Arte Sacro","Gasteiz(Araba)",getDrawable(R.mipmap.ic_sacro),"http://moodle.icjardin.com","Catedral de Maria Inmaculada c/ Cadena y Eleta s/n 01108 Vitoria-Gasteiz"),
                new museo("Museo de Arte Sacro","Bilbao(Bizakai)",getDrawable(R.mipmap.ic_diocesano),"https://www.eleizmuseoa.com/","Plaza de la Encarnacion, 9, 48006 Bilbao"),
                new museo("Artium","Gasteiz(Araba)",getDrawable(R.mipmap.ic_artium),"https://www.artium.org/es/","Calle Francia 24,01102 Vitoria-Gasteiz")};
                // NO VOY A PONER MAS POR FALTA DE TIEMPO
        AdaptadorPropio adaptador= new AdaptadorPropio(this,museos);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intento = new Intent(Intent.ACTION_VIEW, Uri.parse(museos[position].getWeb()));
                startActivity(intento);
            }
        });
    }
}
