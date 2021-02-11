package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class laitudlongitud extends AppCompatActivity {

    Button btnLontigutd;
    EditText latitud;
    EditText longitud;
    EditText makertplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laitudlongitud);

        btnLontigutd = findViewById(R.id.button2);
        latitud = findViewById(R.id.latitud);
        longitud = findViewById(R.id.longitud);
        makertplace = findViewById(R.id.marketplace);

        // Definir el evento click sobre el botón de login
        btnLontigutd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(laitudlongitud.this, MapsActivity.class);
                i.putExtra("latitud", Integer.parseInt(latitud.getText().toString()));
                i.putExtra("longitud", Integer.parseInt(longitud.getText().toString()));
                i.putExtra("marketPlace", makertplace.getText().toString());
                startActivity(i);
            }
        });

    }
}