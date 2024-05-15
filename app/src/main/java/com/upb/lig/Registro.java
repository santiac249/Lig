package com.upb.lig;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {

    private Button btn_home;
    private Button btn_clip;
    private Button btn_fam;

    private Button btn_registrar;
    private FirebaseAuth mAuth;  // Agrega una instancia de FirebaseAuth

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        mAuth = FirebaseAuth.getInstance();  // Inicializa Firebase Auth

        btn_registrar = findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Supongamos que tienes campos EditText para email y contraseña en tu layout
                EditText emailField = findViewById(R.id.txtName);  // Asegúrate de tener un EditText con id 'email'
                EditText passwordField = findViewById(R.id.txtPassword);  // Asegúrate de tener un EditText con id 'password'

                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                registerUser(email, password);  // Llama a la función para registrar el usuario
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_home), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void registerUser(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        // El registro fue exitoso, procede con el flujo de la aplicación
                        Toast.makeText(Registro.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Registro.this, Espacio.class);
                        startActivity(intent);
                    } else {
                        // Si el registro falla, muestra un mensaje al usuario
                        Toast.makeText(Registro.this, "Registro fallido: " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}
