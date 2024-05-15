package com.upb.lig;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Creditos extends AppCompatActivity {

    private ImageButton imgbtn_servicios;
    private ImageButton imgbtn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_creditos);
        imgbtn_servicios = findViewById(R.id.imgbtn_servicios);
        imgbtn_home = findViewById(R.id.imgbtn_home);

        imgbtn_servicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Creditos.this, Servicios.class);
                startActivity(intent);
            }

        });

        imgbtn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Creditos.this, Espacio.class);
                startActivity(intent);
            }

        });



    }
}