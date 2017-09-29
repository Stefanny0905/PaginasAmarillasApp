package com.aquino.paginasamarillasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.aquino.paginasamarillasapp.R;
import com.aquino.paginasamarillasapp.repository.EmpresaRepository;

public class MainActivity extends AppCompatActivity {

    private EditText empresa_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         empresa_text= (EditText) findViewById(R.id.empresa_text);

        EmpresaRepository emp= EmpresaRepository.getInstance();
        emp.agregarEmpresa();

    }
    
    public void buscar(View view) {

        String nom = empresa_text.getText().toString();

        Intent intent = new Intent(this, ListadoActivity.class);
        intent.putExtra("nombre",nom);
        startActivity(intent);


    }
}
