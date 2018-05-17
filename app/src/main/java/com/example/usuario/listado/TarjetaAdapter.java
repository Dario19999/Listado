package com.example.usuario.listado;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Usuario on 26/04/2018.
 */

public class TarjetaAdapter extends BaseAdapter {

    ArrayList<tarjeta> dataAdapter;
    Context contexto;
    ArrayList<String> Imagenes;
    @Override
    public int getCount() {
        return dataAdapter.size();
    }

    @Override
    public Object getItem(int i) {
        return dataAdapter.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater vinculo = LayoutInflater.from(contexto);
        View v = vinculo.inflate(R.layout.tarjeta,null);

        TextView tvNombre =(TextView) v.findViewById(R.id.uName);
        tvNombre.setText(dataAdapter.get(i).getNombre());

        TextView tvEdad = (TextView) v.findViewById(R.id.uEdad);
        tvEdad.setText(dataAdapter.get(i).getEdad());

        TextView tvDesc = (TextView) v.findViewById(R.id.uDesc);
        tvDesc.setText(dataAdapter.get(i).getDesc());

        ImageView Imagewachar = (ImageView) v.findViewById(R.id.imgUsuario);
        Picasso.with(contexto).load(Imagenes.get(i)).into(Imagewachar);

        return v;
    }
}
