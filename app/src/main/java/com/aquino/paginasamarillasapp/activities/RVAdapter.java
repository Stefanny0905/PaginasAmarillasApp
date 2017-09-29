package com.aquino.paginasamarillasapp.activities;


import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aquino.paginasamarillasapp.R;
import com.aquino.paginasamarillasapp.model.Empresa;

import java.io.Serializable;
import java.util.List;


public class RVAdapter extends RecyclerView.Adapter<RVAdapter.EmpresaViewHolder> {

    public static class EmpresaViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView empresaNombre;
        TextView empresaTelefono;
        ImageView empresaLogo;

        EmpresaViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            empresaNombre = itemView.findViewById(R.id.empresa_nombre);
            empresaTelefono = itemView.findViewById(R.id.empresa_telefono);
            empresaLogo = itemView.findViewById(R.id.empresa_logo);

        }
    }

    List<Empresa> empresas;
    String nombreEmpresa;
    Context context;
    RVAdapter(List<Empresa> empresas, String nombreEmpresa, Context context){

        this.empresas = empresas;
        this.nombreEmpresa = nombreEmpresa;
        this.context = context;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
    @Override
    public EmpresaViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        final EmpresaViewHolder pvh = new EmpresaViewHolder(v);
        return pvh;


    }

    @Override
    public void onBindViewHolder(EmpresaViewHolder empresaViewHolder, final int i) {

            empresaViewHolder.empresaNombre.setText(empresas.get(i).getNombre());
            empresaViewHolder.empresaTelefono.setText(empresas.get(i).getDireccion());
            empresaViewHolder.empresaLogo.setImageResource(empresas.get(i).getLogo());


             empresaViewHolder.cv.setOnClickListener(new View.OnClickListener() {

                 @Override
                 public void onClick(View view) {

                     Intent intent= new Intent(context, DetalleActivity.class);
                     intent.putExtra("empresa", empresas.get(i));
                     context.startActivity(intent);
                 }
                 });

    }


    @Override
    public int getItemCount() {
        return empresas.size();
    }

}
