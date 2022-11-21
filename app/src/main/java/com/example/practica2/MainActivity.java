package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1. Declarar datos
 private EditText nombre;
 private EditText apeP;
 private EditText apeM;
 private EditText calle;
 private EditText colonia;
 private EditText estado;
 private EditText nc;
 private EditText carrera;
 private EditText semestre;
 private TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2. Construir objetos
        nombre=(EditText)findViewById(R.id.nombre);
        apeP=(EditText)findViewById(R.id.apeP);
        apeM=(EditText)findViewById(R.id.apeM);
        calle=(EditText)findViewById(R.id.calle);
        colonia=(EditText)findViewById(R.id.colonia);
        estado=(EditText)findViewById(R.id.estado);
        nc=(EditText)findViewById(R.id.nc);
        carrera=(EditText)findViewById(R.id.carrera);
        semestre=(EditText)findViewById(R.id.semestre);
        mensaje=(TextView)findViewById(R.id.mensaje);
    }
    //3. Creamos los metodos
    public void captura(View view){
        String nom;
        String pat;
        String mat;
        String cal;
        String co;
        String es;
        String ctrl;
        String carr;
        String sem;
        nom=nombre.getText().toString();
        pat=apeP.getText().toString();
        mat=apeM.getText().toString();
        cal=calle.getText().toString();
        co=colonia.getText().toString();
        es=estado.getText().toString();
        ctrl=nc.getText().toString();
        carr=carrera.getText().toString();
        sem=semestre.getText().toString();
        //if (nombre.getText().toString().trim().length()>0){
            //mensaje.setText("Datos personales: "+nom +pat +mat+"\n"+"Datos domicilio: "+cal +co +es+"\n"+"Datos escuela: "+ctrl +carr +sem);
        //}else {
            //mensaje.setText("Escribe tu nombre por favor");
        //}
        Intent v1 = new Intent(MainActivity.this,Ventana2.class);
        v1.putExtra("nombre",nom);
        v1.putExtra("paterno",pat);
        v1.putExtra("materno",mat);
        v1.putExtra("calle",cal);
        v1.putExtra("colonia",co);
        v1.putExtra("estado",es);
        v1.putExtra("control",ctrl);
        v1.putExtra("carrera",carr);
        v1.putExtra("semestre",sem);//Se agrega como extra
        startActivity(v1);
    }
    public void limpiar(View view){

        l();
    }
    public void l(){
        nombre.setText("");
        apeP.setText("");
        apeM.setText("");
        calle.setText("");
        colonia.setText("");
        estado.setText("");
        nc.setText("");
        carrera.setText("");
        semestre.setText("");
        mensaje.setText("");
    }

}