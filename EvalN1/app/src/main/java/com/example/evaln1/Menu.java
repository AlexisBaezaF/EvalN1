package com.example.evaln1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    TextView saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        saldo = (TextView) findViewById(R.id.saldoMonto);
        String saldoNuevo = getIntent().getStringExtra("Saldo");
        saldo.setText(saldoNuevo);

        String saldoAdicional = getIntent().getStringExtra("saldoAdicional");

        String costeMetro = getIntent().getStringExtra("Metro");

        String costeTaxi = getIntent().getStringExtra("Taxi");

    }

    public void realizarCargaNueva(View view){
        Intent intent = new Intent(this, CargaNueva.class);
    }

    public void verHistorial(View view){
        Intent intent = new Intent(this, HistorialViajes.class);
    }

    public void realizarViaje(View view){
        Intent intent = new Intent(this, RealizarViaje.class);
    }
}