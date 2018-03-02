package com.example.javier.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyLogin extends AppCompatActivity {
    private TextView titulo;
    private RelativeLayout rel;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);
        titulo = findViewById(R.id.tvLogin);
        rel = findViewById(R.id.relLogin);
        img = findViewById(R.id.ivLogo);
        Animation scale = AnimationUtils.loadAnimation(
                this, R.anim.scale_animation1);
        scale.setStartOffset(1000);
        img.setAnimation(scale);
        Animation alpha = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);
        rel.setAnimation(alpha);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        titulo.setTypeface(face);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, MyMain.class);
        startActivity(intent);
    }
}