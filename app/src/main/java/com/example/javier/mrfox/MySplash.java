package com.example.javier.mrfox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MySplash extends AppCompatActivity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);
        img = findViewById(R.id.imSplash);

        Animation decre = AnimationUtils.loadAnimation(this,R.anim.alpha_animation2);
        decre.setStartOffset(2500);
        img.setAnimation(decre);

        Thread tiempo = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(MySplash.this,MyLogin.class);
                    startActivity(intent);
                }
            }
        };
        tiempo.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}