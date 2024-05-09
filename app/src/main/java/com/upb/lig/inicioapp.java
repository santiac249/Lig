package com.upb.lig;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class inicioapp extends AppCompatActivity {

    private Button btn_login;

    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicioapp);

        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Login
                Intent intent = new Intent(inicioapp.this, Login.class);

                // Inicia la actividad Login
                startActivity(intent);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent que apunte a la actividad Login
                Intent intent = new Intent(inicioapp.this, Registro.class);

                // Inicia la actividad Login
                startActivity(intent);
            }
        });
    }

}