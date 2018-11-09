package com.example.dm2.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class comprobardora extends AppCompatActivity {

    private int n1;
    private int n2;
    private int res;
    private TextView num1;
    private TextView num2;
    private TextView prf1;
    private TextView prf2;
    private TextView prf3;
    private EditText resultado;
    private Spinner menudesplegable;
    private Intent intentomuseo;
    private Intent intentoalta;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprobardora);


        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        resultado=findViewById(R.id.resultado);
        prf1=findViewById(R.id.prf1);
        prf2=findViewById(R.id.prf2);
        prf3=findViewById(R.id.prf3);

        n1=Integer.parseInt((int) Math.floor(Math.random()*100+1)+"");
        n2=Integer.parseInt((int) Math.floor(Math.random()*100+1)+"");

        num1.setText(n1+"");
        num2.setText(n2+"");

        intentoalta= new Intent(this,alta.class);
        intentomuseo= new Intent(this,museas.class);
    }

    public void exito(){

        final String[] elementos= new String[]{"","Darse de Alta", "Ver Listado Museos"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,elementos);
        menudesplegable=(Spinner)findViewById(R.id.desplegable);
        menudesplegable.setAdapter(adaptador);
        menudesplegable.setVisibility(View.VISIBLE);
        menudesplegable.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String eleccion = (String) menudesplegable.getSelectedItem();
                switch (eleccion) {

                    case "Darse de Alta":
                        startActivity(intentoalta);
                        break;
                    case "Ver Listado Museos":
                        startActivity(intentomuseo);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    public void Comprobar(View view){

        res=Integer.parseInt(resultado.getText().toString());

        if (res==(n1+n2)){

            prf1.setText("¡ PERFECTO !");
            prf2.setText("No eres una maquina");
            prf3.setText("Elije una de las opciones en el desplegable");
            this.exito();
        }
        else{
            finish();
        }
    }
}
