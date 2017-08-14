package com.example.discrollview;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

/**
 * Created by jains on 30-06-2017.
 */

public class Workshops extends AppCompatActivity {

    private Button back;
    private LinearLayout mainLayout;
    private ImageView canon;
    private Button registerInfizeal;
    private Button registerCanon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshops_main);
        registerCanon = (Button) findViewById(R.id.applyCanon);
        registerInfizeal = (Button) findViewById(R.id.applyInfizeal);
        canon = (ImageView) findViewById(R.id.canonImageView);
//        canon.getLayoutParams().height = Resources.getSystem().getDisplayMetrics().widthPixels;
//        canon.getLayoutParams().width = Resources.getSystem().getDisplayMetrics().widthPixels;
//        canon.requestLayout();
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent homeIntent = new Intent(Workshops.this, MainActivity.class);
//                startActivity(homeIntent);
//            }
//        });

        registerInfizeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/a/iiitd.ac.in/forms/d/e/1FAIpQLSfoEaKC2FEVrF-SSz8IVhDwKkQtyVTC7Zvik7FNNCCre6Ofgw/viewform")));
            }
        });

        registerCanon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/150ghm70SYdQKSCn_HjGh3cq4lfhI1Twi8dJHqGT0JEs/viewform?edit_requested=true")));
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Workshops.this, MainActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(homeIntent);
    }
}