package com.example.discrollview;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.starterImage);
        img.setBackgroundResource(R.drawable.progress_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        frameAnimation.start();

        ImageView cat1 = (ImageView) findViewById(R.id.iconCat1);
        ImageView cat2 = (ImageView) findViewById(R.id.iconCat2);
        ImageView cat3 = (ImageView) findViewById(R.id.iconCat3);
        ImageView cat4 = (ImageView) findViewById(R.id.iconCat4);
        ImageView cat5 = (ImageView) findViewById(R.id.iconCat5);
        ImageView cat6 = (ImageView) findViewById(R.id.iconCat6);

        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"I will redirect to 1", Toast.LENGTH_LONG).show();
            }
        });

        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"I will redirect to 1", Toast.LENGTH_LONG).show();
            }
        });

        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"I will redirect to 2", Toast.LENGTH_LONG).show();
            }
        });

        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"I will redirect to 3", Toast.LENGTH_LONG).show();
            }
        });

        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"I will redirect to 4", Toast.LENGTH_LONG).show();
            }
        });

        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"I will redirect to 5", Toast.LENGTH_LONG).show();
            }
        });

        cat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"I will redirect to 6", Toast.LENGTH_LONG).show();
            }
        });
    }
}
