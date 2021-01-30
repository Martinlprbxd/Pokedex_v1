package com.code.apps.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class pantalla_full extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_full);

        ImageView imageView=findViewById(R.id.imageview_foto);
        TextView  tv_nombre=findViewById(R.id.tv_nombre);



        String nombre= (String) getIntent().getExtras().get("nombre");
        String link = (String) getIntent().getExtras().get("link");

       Glide.with(getApplicationContext()).load(link).into(imageView);
       tv_nombre.setText(nombre);


    }
}