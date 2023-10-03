package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button1);

        // Agrega un listener al botón para manejar el evento de clic
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para abrir MainActivity2
                Intent intent = new Intent(MainActivity.this, Register.class);

                // Inicia la actividad MainActivity2
                startActivity(intent);

            }
        });
    }
}