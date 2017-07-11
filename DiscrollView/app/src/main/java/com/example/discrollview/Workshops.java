package com.example.discrollview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

public class Workshops extends AppCompatActivity {

    private Button back;
    private FrameLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshops_main);
        mainLayout= (FrameLayout) findViewById(R.id.mainFrameWorkshops);
        back = (Button) findViewById(R.id.backButtonWorkshops);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Workshops.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Bitmap workshopsBitmap= BitmapFactory.decodeResource(getResources(),R.drawable.mainworkshops);
        Bitmap newResizedBMP= Bitmap.createScaledBitmap(workshopsBitmap,1280,1280,true);
        Bitmap finalBMP= Bitmap.createBitmap(newResizedBMP,250,0,768,1280);
        mainLayout.setBackground(new BitmapDrawable(finalBMP));
    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Workshops.this, MainActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(homeIntent);
    }
}
