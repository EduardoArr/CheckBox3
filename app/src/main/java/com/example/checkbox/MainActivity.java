package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText nom;
    EditText apell;
    CheckBox j;
    CheckBox py;
    CheckBox k;
    CheckBox c;
    TextView resu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = (EditText) findViewById(R.id.Nombre);
        apell = (EditText) findViewById(R.id.Apellido);

        j = (CheckBox)  findViewById(R.id.Java);
        py = (CheckBox) findViewById(R.id.Python);
        k = (CheckBox) findViewById(R.id.Kotlin);
        c = (CheckBox) findViewById(R.id.C);

        resu = (TextView) findViewById(R.id.Resultado);
    }

    public void resultado(View w){
        String nombre = nom.getText().toString();
        String apellido = apell.getText().toString();
        String java = j.getText().toString();
        String python = py.getText().toString();
        String kotlin = k.getText().toString();
        String C =  c.getText().toString();
        int contador = 0;
        String respuesta = "";
        if(nombre.isEmpty() && apellido.isEmpty() || nombre.isEmpty() | apellido.isEmpty()){
            Toast.makeText(this,"Ponme algo en nombre y apellido", Toast.LENGTH_SHORT).show();
        }else{
            String aux = nombre + " " + apellido + " ha usado: ";

            if(j.isChecked()){
              respuesta = respuesta + java + ", ";
              contador++;

            }

            if(py.isChecked()){
                respuesta = respuesta + python + ", ";
                contador++;

            }
            if(k.isChecked()){
                respuesta = respuesta  + kotlin + ", ";
                contador++;

            }
            if(c.isChecked()) {
               respuesta = respuesta + C + ", ";
               contador++;

            }
            if(contador == 0){
                resu.setText(aux + " no sabe programar nada");
            }else {
                resu.setText(aux + respuesta + " un total de " + contador);
            }

        }


    }
}