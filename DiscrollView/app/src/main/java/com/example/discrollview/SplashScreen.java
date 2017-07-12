package com.example.discrollview;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.model.ConfigSplash;

/**
 * Created by jains on 12-07-2017.
 */

public class SplashScreen extends AwesomeSplash {

    @Override
    public void initSplash(ConfigSplash configSplash) {

			/* you don't have to override every property */

        configSplash.setBackgroundColor(R.color.white);
        configSplash.setAnimCircularRevealDuration(50);
        configSplash.setPathSplash("M 135.44554,259.48515 191.52475,259.9604 274.21782,344.07921 131.64356,344.55446 45.623762,257.58416 V 129.26733 L 132.11881,42.772277 257.58416,42.29703 342.65347,129.74257 342.17822,194.85149 264.71287,271.36634 187.24752,192.9505 253.78218,193.90099 254.25743,127.36634 135.44554,128.31683 Z"); //set path String
        configSplash.setOriginalHeight(384); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(389); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(4); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.black); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setPathSplashFillColor(R.color.esyaLogoColor); //path object filling color
        configSplash.setTitleSplash("Esya'17");
        configSplash.setTitleTextColor(R.color.black);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FadeIn);



    }

    @Override
    public void animationsFinished() {

        Intent mainIntent= new Intent(SplashScreen.this,MainActivity.class);
        startActivity(mainIntent);

    }

}
