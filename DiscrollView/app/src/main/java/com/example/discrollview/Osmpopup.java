package com.example.discrollview;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

public class Osmpopup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osmpopup);

        ImageView efy = (ImageView) findViewById(R.id.efyim);
        ImageView campus = (ImageView) findViewById(R.id.campusim);
        ImageView college = (ImageView) findViewById(R.id.collegeim);
        ImageView buddy = (ImageView) findViewById(R.id.buddyim);
        ImageView all = (ImageView) findViewById(R.id.alleventsim);
        ImageView youth = (ImageView) findViewById(R.id.youthim);
        ImageView duim = (ImageView) findViewById(R.id.duim);
        ImageView test = (ImageView) findViewById(R.id.testim);
        ImageView brain = (ImageView) findViewById(R.id.brainim);
        ImageView ohim = (ImageView) findViewById(R.id.ohim);
        ImageView fp = (ImageView) findViewById(R.id.fpim);

        efy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://electronicsforu.com")));
            }
        });

        campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://campusdrift.com/")));
            }
        });

        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://thecollegefever.com/")));
            }
        });

        buddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://buddybits.com/amp/")));
            }
        });

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://allevents.in/")));
            }
        });

        youth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://beingstudent.com/")));
            }
        });

        duim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://dubeat.com/")));
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://testfunda.com")));
            }
        });

        brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.brainbuxa.com")));
            }
        });

        ohim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.ohcampus.com")));
            }
        });

        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://festpav.com")));
            }
        });


    }
}
