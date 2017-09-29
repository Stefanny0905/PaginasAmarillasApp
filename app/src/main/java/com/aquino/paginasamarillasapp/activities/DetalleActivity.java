package com.aquino.paginasamarillasapp.activities;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aquino.paginasamarillasapp.R;
import com.aquino.paginasamarillasapp.model.Empresa;

public class DetalleActivity extends AppCompatActivity {

    TextView empresaNombre;
    TextView empresaTelefono;
    TextView empresaDescripcion;
    TextView empresaRubro;
    TextView empresaDireccion;
    ImageView empresaLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        empresaNombre = (TextView)findViewById(R.id.empresa_nombre);
        empresaTelefono = (TextView)findViewById(R.id.empresa_telefono);
        empresaRubro = (TextView)findViewById(R.id.empresa_rubro);
        empresaDireccion = (TextView)findViewById(R.id.empresa_direccion);
        empresaLogo = (ImageView)findViewById(R.id.empresa_logo);
        empresaDescripcion = (TextView)findViewById(R.id.empresa_descripcion);

        Intent intent = getIntent();
        Empresa empresa = (Empresa)intent.getSerializableExtra("empresa");
        String nombreEmpresa = empresa.getNombre();
        final String email = empresa.getCorreo();
        final String url = empresa.getUrl();
        final String rubro = empresa.getRubro();
        final String direccion = empresa.getDireccion();
        final int telefono = empresa.getTelefono();
        final String descripcion = empresa.getInfo();
        int imagen = empresa.getLogo();

        empresaNombre.setText(nombreEmpresa);
        empresaRubro.setText(rubro);
        empresaDireccion.setText(direccion);
        empresaTelefono.setText(String.valueOf(telefono));
        empresaLogo.setImageResource(imagen);
        empresaDescripcion.setText(descripcion);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_website:
                        Intent webintent = new Intent(Intent.ACTION_VIEW );
                        webintent.setData(Uri.parse(url));
                        startActivity(webintent);
                        break;
                    case R.id.menu_email:
                        Intent emailintent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+email));
                        startActivity(emailintent);
                        break;
                    case R.id.menu_sms:
                        Intent smsintent = new Intent(Intent.ACTION_SENDTO);
                        smsintent.setData(Uri.parse("smsto:"+telefono));
                        startActivity(smsintent);
                        break;
                    case R.id.menu_compartir:
                        Intent shareintent = new Intent(Intent.ACTION_SEND);
                        shareintent.setType("text/plain");
                        shareintent.putExtra(Intent.EXTRA_TEXT, descripcion);
                        startActivity(shareintent);
                        break;
                    case R.id.menu_llamar:
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:"+telefono));
                        startActivity(callIntent);
                        break;
                }
                return true;
            }
        });

    }




}
