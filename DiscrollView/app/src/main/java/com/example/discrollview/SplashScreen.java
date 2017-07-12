package com.example.discrollview;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;

import com.jaredrummler.android.widget.AnimatedSvgView;
import com.tomer.fadingtextview.FadingTextView;


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
        FadingTextView changingText=(FadingTextView) findViewById(R.id.fadingTextView);
        Typeface tf = Typeface.createFromAsset(getAssets(),"Roboto-Light.ttf");
        changingText.setTypeface(tf);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {

                //here you can start your Activity B.
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);

            }

        }, 3000);

    }

}