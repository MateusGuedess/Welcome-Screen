package com.example.guedes.welcomescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1, l2;
    Button  btnSubs;
    Animation uptodown;
    Animation downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubs = findViewById(R.id.buttonSub);
        l1 = findViewById(R.id.line1);
        l2 = findViewById(R.id.line2);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        l1.setAnimation(uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        l2.setAnimation(downtoup);
    }
}
