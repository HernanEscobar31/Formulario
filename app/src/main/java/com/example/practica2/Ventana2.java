package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity{
        public TextView nom,pater,mater,ca,co,es,num,carr,sem;
        Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        nom=findViewById(R.id.nom);
        pater=findViewById(R.id.pater);
        mater=findViewById(R.id.mater);
        ca=findViewById(R.id.ca);
        co=findViewById(R.id.co);
        es=findViewById(R.id.es);
        num=findViewById(R.id.num);
        carr=findViewById(R.id.carr);
        sem=findViewById(R.id.sem);
        datos=getIntent().getExtras();
        nom.setText(datos.getString("nombre"));
        pater.setText(datos.getString("paterno"));
        mater.setText(datos.getString("materno"));
        ca.setText(datos.getString("calle"));
        co.setText(datos.getString("colonia"));
        es.setText(datos.getString("estado"));
        num.setText(datos.getString("control"));
        carr.setText(datos.getString("carrera"));
        sem.setText(datos.getString("semestre"));

    }
    public void salir(View view){

        finish();
    }
}