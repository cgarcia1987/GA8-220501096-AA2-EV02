package com.ejemplo.miproyecto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class BienvenidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
    }

    public void irPaginaCRMCALL(View view) {
        // Navegar a la página CRMCALL (esto es un ejemplo, cambiar según sea necesario)
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.crmpagina.com"));
        startActivity(browserIntent);
    }
}