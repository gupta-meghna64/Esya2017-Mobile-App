package com.example.discrollview;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.jaredrummler.android.widget.AnimatedSvgView;


import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jains on 12-07-2017.
 */

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        AnimatedSvgView svgView = (AnimatedSvgView) findViewById(R.id.animated_svg_view);
        svgView.start();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {

                //here you can start your Activity B.
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

            }

        }, 3000);
    }

}