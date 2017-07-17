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
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

/**
 * Created by jains on 30-06-2017.
 */

public class Initiatives extends AppCompatActivity {

    private LinearLayout mainLayout;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initiatives_main);
        mainLayout = (LinearLayout) findViewById(R.id.mainFrameInitiatives);
        back = (Button) findViewById(R.id.backButtonInitiatives);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Initiatives.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Bitmap initiativesBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mainsocialcall);
        Bitmap newResizedBMP = Bitmap.createScaledBitmap(initiativesBitmap, 1280, 1280, true);
        Bitmap finalBMP = Bitmap.createBitmap(newResizedBMP, 250, 0, 768, 1280);
        mainLayout.setBackground(new BitmapDrawable(finalBMP));


    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Initiatives.this, MainActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(homeIntent);
    }
}
