package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
    }

    public void incrementa(View v) {
        contador++;
        mostrar();
    }

    public void decremente(View v) {
        contador--;
        mostrar();
    }

    public void reset(View v) {
        contador = 0;
        mostrar();
    }

    public void mostrar() {
        TextView micontador = findViewById(R.id.txtContador);
        micontador.setText("" + contador);
    }
}