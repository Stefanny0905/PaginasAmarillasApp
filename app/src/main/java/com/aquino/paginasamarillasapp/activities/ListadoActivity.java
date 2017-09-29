package com.aquino.paginasamarillasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import com.aquino.paginasamarillasapp.R;
import com.aquino.paginasamarillasapp.model.Empresa;
import com.aquino.paginasamarillasapp.repository.EmpresaRepository;

import java.util.ArrayList;
import java.util.List;

public class ListadoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);

        Intent intent = getIntent();

        String nombreEmpresa = intent.getStringExtra("nombre");

        EmpresaRepository emp= EmpresaRepository.getInstance();
        List<Empresa> empresas = emp.getEmpresas();

        List<Empresa> nuevos = new ArrayList<>();

        for (Empresa empresa : empresas) {
            if (empresa.getRubro().toLowerCase().equals(nombreEmpresa.toLowerCase())) {
                nuevos.add(empresa);
            }
        }
        RVAdapter adaprv = new RVAdapter(nuevos, nombreEmpresa, ListadoActivity.this);
        rv.setAdapter(adaprv);

    }





}
