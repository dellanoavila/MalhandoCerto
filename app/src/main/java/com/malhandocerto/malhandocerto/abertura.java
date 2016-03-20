package com.malhandocerto.malhandocerto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class abertura extends AppCompatActivity {

    public Button Abdome;
    public Button Biceps;
    public Button Costas;
    public Button Ombro;
    public Button Peito;
    public Button Perna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abertura);
    }
    public void Abdome(View view){
        Intent it = new Intent(abertura.this, Abdomen.class);
        startActivity(it);
    }

    public void Biceps(View view){
        Intent it = new Intent(abertura.this, Biceps.class);
        startActivity(it);
    }
    public void Costas(View view){
        Intent it = new Intent(abertura.this, Costas.class);
        startActivity(it);
    }
    public void Ombro(View view){
        Intent it = new Intent(abertura.this, Ombro.class);
        startActivity(it);
    }
    public void Peito(View view){
        Intent it = new Intent(abertura.this, Peito.class);
        startActivity(it);
    }
    public void Perna(View view){
        Intent it = new Intent(abertura.this, Perna.class);
        startActivity(it);
    }
}
