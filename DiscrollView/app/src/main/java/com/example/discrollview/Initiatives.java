package com.example.discrollview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jains on 30-06-2017.
 */

public class Initiatives extends AppCompatActivity {

    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initiatives_main);
        back=(Button) findViewById(R.id.backButtonInitiatives);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent=new Intent(Initiatives.this,MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent homeIntent= new Intent(Initiatives.this,MainActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(homeIntent);
    }
}
