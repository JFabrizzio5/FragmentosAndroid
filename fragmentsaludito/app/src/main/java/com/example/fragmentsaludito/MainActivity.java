package com.example.fragmentsaludito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};

        // Adaptador para el ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones);

        // Configurar el ListView
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcionSeleccionada = opciones[position];

                // Crear el intent para la actividad correspondiente
                Intent intent;
                switch (opcionSeleccionada) {
                    case "Opción 1":
                        intent = new Intent(MainActivity.this, dobletriple.class);
                        break;
                    case "Opción 2":
                        intent = new Intent(MainActivity.this, saludos.class);
                        break;
                    case "Opción 3":
                        intent = new Intent(MainActivity.this, calculacausas.class);
                        break;
                    default:
                        intent = null;
                        break;
                }

                // Iniciar la actividad correspondiente si el intent no es nulo
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });
    }
}