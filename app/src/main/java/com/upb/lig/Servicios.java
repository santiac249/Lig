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

public class Servicios extends AppCompatActivity {

    private ImageButton btn_cerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_servicios);
        btn_cerrar = findViewById(R.id.btn_cerrar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_home), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Creditos
                Intent intent = new Intent(Servicios.this, Espacio.class);
                // Inicia la actividad Registro de usuario
                startActivity(intent);

            }
        });
    }
}