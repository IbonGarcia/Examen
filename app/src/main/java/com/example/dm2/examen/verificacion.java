package com.example.dm2.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class verificacion extends AppCompatActivity {

    private TextView nombre;
    private TextView apellido;
    private TextView sexo;
    private TextView interes;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacion);

        nombre=findViewById(R.id.vnombre);
        apellido=findViewById(R.id.vapellido);
        sexo=findViewById(R.id.vsexo);
        interes=findViewById(R.id.vinteres);

        Bundle extras = getIntent().getExtras();
        nombre.setText(extras.getString("nombre"));
        apellido.setText(extras.getString("apellido"));
        sexo.setText(extras.getString("sexo"));
        interes.setText(extras.getString("interes"));

    }

    public void ClickAceptar(View view){

        // NO ME HA DADO TIEMPO

    }

    public void ClickCancelar(View view){
        finish();
    }
}
