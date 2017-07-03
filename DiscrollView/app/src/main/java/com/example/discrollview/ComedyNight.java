package com.example.discrollview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * Created by jains on 30-06-2017.
 */

public class ComedyNight extends AppCompatActivity {

    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comedynight_main);
        back=(Button) findViewById(R.id.backButtonComedy);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent=new Intent(ComedyNight.this,MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }

}