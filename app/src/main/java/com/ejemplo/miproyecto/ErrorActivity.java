package com.ejemplo.miproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ErrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        Button usersButton = findViewById(R.id.btn_users);
        Button createUserButton = findViewById(R.id.btn_create_user);

        // Manejar clic en el botón "Usuarios"
        usersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de inicio de sesión
                Intent intent = new Intent(ErrorActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Opcional: Cierra la actividad actual
            }
        });

        // Manejar clic en el botón "Crear Nuevo Usuario"
        createUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de registro de nuevo usuario
                Intent intent = new Intent(ErrorActivity.this, NuevoUsuarioActivity.class);
                startActivity(intent);
                finish(); // Opcional: Cierra la actividad actual
            }
        });
    }
}