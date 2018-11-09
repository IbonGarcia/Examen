package com.example.dm2.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class alta extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private RadioButton masculino;
    private CheckBox arte;
    private CheckBox ciencia;
    private CheckBox otros;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta);
        this.setTitle(R.string.alta);
        nombre=findViewById(R.id.editnombre);
        apellido=findViewById(R.id.editapellido);
        masculino=findViewById(R.id.masculino);
        arte=findViewById(R.id.checkarte);
        ciencia=findViewById(R.id.checkciencia);
        otros=findViewById(R.id.checkotros);

    }

    public void ClickCancelar(View view){
        finish();
    }
    public void ClickAlta(View view){

        Intent intento= new Intent(this,verificacion.class);
        String interes="Intereses: ";

        if (masculino.isSelected()){
            String nombres= nombre.getText().toString();
            String apellidos= apellido.getText().toString();

            intento.putExtra("nombre", "Nombre: "+nombres);
            intento.putExtra("apellido", "Apellido: "+apellidos);
            intento.putExtra("sexo", "Sexo: "+"Masculino");

            if(arte.isChecked()){
                interes=interes+"ARTE ";
            }
            if(ciencia.isChecked()){
                interes=interes+" CIENCIA ";
            }
            if(otros.isChecked()){
                interes=interes+" OTROS ";
            }
            intento.putExtra("interes", interes.toString());
        }
        else{
            String nombres= nombre.getText().toString();
            String apellidos= apellido.getText().toString();

            intento.putExtra("nombre", "Nombre: "+nombres);
            intento.putExtra("apellido", "Apellido: "+apellidos);
            intento.putExtra("sexo", "Sexo: "+"Femenino");
            if(arte.isChecked()){
                interes=interes+"ARTE ";
            }
            if(ciencia.isChecked()){
                interes=interes+" CIENCIA ";
            }
            if(otros.isChecked()){
                interes=interes+" OTROS ";
            }
            intento.putExtra("interes", interes.toString());
        }

        startActivity(intento);
    }
}
