package com.tesoem.g7s21p6hgle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    EditText txtcadena, nombre, comidaFavorita, colorFavorito, numFavorito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcadena = findViewById(R.id.txtcadena);
        nombre = findViewById(R.id.nombre);
        comidaFavorita = findViewById(R.id.comidaFavorita);
        colorFavorito = findViewById(R.id.colorfavorito);
        numFavorito = findViewById(R.id.numFavorito);

    }

    public void cclase(View v){
        try {
            //String json ="{\"nombre\":\"Fernando Gomez\",\"colorfavorito\":\"Red\",\"comidaFavorita\":\"Pollo\",\"numFavorito\":15}";
            String json =txtcadena.getText().toString();
            Gson gson = new Gson();


            Datos datos = gson.fromJson(json,Datos.class);
            nombre.setText(datos.getNombre());
            comidaFavorita.setText(datos.getComidaFavorita());
            colorFavorito.setText(datos.getColorFavorito());
            numFavorito.setText(datos.getNumFavorito());


        }catch (Exception e){
            Toast.makeText(this, "Algo salio mal o dejaste el campo vacio", Toast.LENGTH_SHORT).show();

        }




    }
}