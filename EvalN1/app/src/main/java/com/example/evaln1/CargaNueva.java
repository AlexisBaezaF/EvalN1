package com.example.evaln1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CargaNueva extends AppCompatActivity {

    TextView cargaAdicional;
    Button botonCargaAdicional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga_nueva);

        cargaAdicional = (TextView) findViewById(R.id.cargaInicialvalue2);
        botonCargaAdicional = (Button) findViewById(R.id.buttonCargar2);
        
    }

    public void realizarCargaAdicional(View view){
        int montoCargado = Integer.parseInt(cargaAdicional.getText().toString());
        if(montoCargado > 1000){
            Toast.makeText(CargaNueva.this, "Error. El monto mínimo es de $1000", Toast.LENGTH_SHORT).show();
        }
        
        int montoActual = montoCargado;

        Intent intent = new Intent(this, Menu.class);
        intent.putExtra("SaldoAdicional", montoActual);
    }
}