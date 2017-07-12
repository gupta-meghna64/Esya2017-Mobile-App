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

        configSplash.setBackgroundColor(R.color.black);
        configSplash.setLogoSplash(R.mipmap.esyalogo);
        configSplash.setAnimLogoSplashDuration(2000);
        configSplash.setAnimLogoSplashTechnique(Techniques.Landing);
        configSplash.setTitleSplash("Esya'17");
        configSplash.setTitleTextColor(R.color.white);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.Landing);

    }

    @Override
    public void animationsFinished() {

        Intent mainIntent= new Intent(SplashScreen.this,MainActivity.class);
        startActivity(mainIntent);

    }

}
