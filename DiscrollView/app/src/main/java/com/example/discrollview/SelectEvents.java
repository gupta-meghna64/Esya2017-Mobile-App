package com.example.discrollview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 01-07-2017.
 */

public class SelectEvents extends AppCompatActivity {

    Button cse;
    Button ece;
    Button nt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_select);

        cse = (Button) findViewById(R.id.buttonCSE);
        ece = (Button) findViewById(R.id.buttonECE);
        nt = (Button) findViewById(R.id.buttonNT);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(SelectEvents.this, CSEMainActivity.class);
                startActivity(eventsIntent);
            }
        });

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(SelectEvents.this, ECEMainActivity.class);
                startActivity(eventsIntent);
            }
        });

        nt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(SelectEvents.this, NTMainActivity.class);
                startActivity(eventsIntent);
            }
        });
    }


}
