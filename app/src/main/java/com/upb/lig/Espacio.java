package com.upb.lig;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Espacio extends AppCompatActivity {

    private Button btn_sala;
    private Button btn_baño;
    private Button btn_habitacion;
    private Button btn_cocina;

    private ImageButton imgbtn_servicios;
    private ImageButton imgbtn_creditos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_espacio);
        btn_sala = findViewById(R.id.btn_sala);
        btn_baño = findViewById(R.id.btn_baño);
        btn_cocina = findViewById(R.id.btn_cocina);
        btn_habitacion = findViewById(R.id.btn_habitacion);
        imgbtn_servicios = findViewById(R.id.imgbtn_servicios);
        imgbtn_creditos = findViewById(R.id.imgbtn_creditos);



        btn_sala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Register
                Intent intent = new Intent(Espacio.this, Servicios.class);

                // Inicia la actividad Registro de usuario
                startActivity(intent);
            }
        });

        imgbtn_servicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Register
                Intent intent = new Intent(Espacio.this, Servicios.class);

                // Inicia la actividad Registro de usuario
                startActivity(intent);
            }
        });
        imgbtn_creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Creditos
                Intent intent = new Intent(Espacio.this, Creditos.class);
                // Inicia la actividad Registro de usuario
                startActivity(intent);

            }
        });


        btn_baño.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Register
                Intent intent = new Intent(Espacio.this, Servicios.class);

                // Inicia la actividad Registro de usuario
                startActivity(intent);
            }
        });

        btn_cocina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Register
                Intent intent = new Intent(Espacio.this, Servicios.class);

                // Inicia la actividad Registro de usuario
                startActivity(intent);
            }
        });

        btn_habitacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Register
                Intent intent = new Intent(Espacio.this, Servicios.class);

                // Inicia la actividad Registro de usuario
                startActivity(intent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_home), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}