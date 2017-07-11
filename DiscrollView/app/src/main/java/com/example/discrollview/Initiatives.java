package com.example.discrollview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

/**
 * Created by jains on 30-06-2017.
 */

public class Initiatives extends AppCompatActivity {

    private FrameLayout mainLayout;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initiatives_main);
        mainLayout=(FrameLayout) findViewById(R.id.mainFrameInitiatives);
        back = (Button) findViewById(R.id.backButtonInitiatives);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Initiatives.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Picasso.with(this).load(R.drawable.mainsocialcall).resize(750,1334).centerCrop().into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                mainLayout.setBackground(new BitmapDrawable(bitmap));
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Initiatives.this, MainActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(homeIntent);
    }
}
