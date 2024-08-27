package com.ejemplo.miproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);

        Button loginButton = findViewById(R.id.login_button);
        Button registerButton = findViewById(R.id.register_button);

        // Manejar clic en el botón de inicio de sesión
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Validar credenciales
                if ("carlos".equals(username) && "123".equals(password)) {
                    // Ir a la pantalla de bienvenida
                    Intent intent = new Intent(LoginActivity.this, BienvenidaActivity.class);
                    startActivity(intent);
                    finish(); // Opcional: Cierra la actividad actual para que el usuario no pueda volver a ella con el botón de retroceso
                } else {
                    // Ir a la página de error
                    Intent intent = new Intent(LoginActivity.this, ErrorActivity.class);
                    startActivity(intent);
                }
            }
        });

        // Manejar clic en el botón de registrar usuario
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de registro de nuevo usuario
                Intent intent = new Intent(LoginActivity.this, NuevoUsuarioActivity.class);
                startActivity(intent);
            }
        });
    }
}