package com.example.discrollview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;


/**
 * Created by jains on 30-06-2017.
 */

public class Accomodation extends AppCompatActivity {

    private LinearLayout mainLayout;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accomodation_main);
        mainLayout = (LinearLayout) findViewById(R.id.accomodationFrame);
        back = (Button) findViewById(R.id.backButtonAccomodation);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Accomodation.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Bitmap comedyBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mainaccomodation);
        Bitmap newResizedBMP = Bitmap.createScaledBitmap(comedyBitmap, 1280, 1280, true);
        Bitmap finalBMP = Bitmap.createBitmap(newResizedBMP, 250, 0, 768, 1280);
        mainLayout.setBackground(new BitmapDrawable(finalBMP));
    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Accomodation.this, MainActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(homeIntent);
    }

}