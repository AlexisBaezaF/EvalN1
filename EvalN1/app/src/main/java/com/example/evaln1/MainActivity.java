package com.example.evaln1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView carga;
    Button botonCargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carga = (TextView) findViewById(R.id.cargaInicialvalue);
        botonCargar = (Button) findViewById(R.id.buttonCargar);
    }

    public void realizarCarga(View view){
        int montoCargado = Integer.parseInt(carga.getText().toString());
        if(montoCargado < 5000){
            Toast.makeText(MainActivity.this, "Error. El monto inicial mínimo es de $5000", Toast.LENGTH_SHORT).show();
        }
        int montoActual = montoCargado;

        Intent intent = new Intent(this, Menu.class);
        intent.putExtra("Saldo", montoActual);
    }
}