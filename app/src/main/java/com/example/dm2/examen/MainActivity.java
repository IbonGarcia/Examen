package com.example.dm2.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle(R.string.app_name);
    }

    public void ClickEntrar(View view){
        Intent intento = new Intent(this,comprobardora.class);
        startActivity(intento);
    }
    public void ClickSalir(View view){
        this.finish();
    }
}
