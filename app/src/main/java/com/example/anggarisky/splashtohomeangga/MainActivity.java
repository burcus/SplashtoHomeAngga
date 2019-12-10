package com.example.anggarisky.splashtohomeangga;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp, clover;
    LinearLayout textsplash, texthome, menus;
    Animation frombottom;
    Button splash;
    TextInputLayout mail,passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);
        splash = (Button) findViewById(R.id.splash);
        mail = (TextInputLayout)findViewById(R.id.email);
        passwd= (TextInputLayout) findViewById(R.id.password);
        menus.setVisibility(View.GONE);
        texthome.setVisibility(View.GONE);


        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animate();
            }
        });
    }

    public void Animate(){
        menus.setVisibility(View.VISIBLE);
        texthome.setVisibility(View.VISIBLE);
        bgapp.animate().translationY(-1900).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        splash.setVisibility(View.GONE);
        mail.setVisibility(View.GONE);
        passwd.setVisibility(View.GONE);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);
        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);
    }
}
