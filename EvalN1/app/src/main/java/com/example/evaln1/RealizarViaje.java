package com.example.evaln1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RealizarViaje extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_viaje);
    }

    public void viajarMetro(View view){
        int valorMetro = 750;

        Intent intent = new Intent(this, Menu.class);
        intent.putExtra("Metro", valorMetro);
    }

    public void viajarTaxi(View view){
        int valorTaxi = 600;

        Intent intent = new Intent(this, Menu.class);
        intent.putExtra("Taxi", valorTaxi);
    }
}