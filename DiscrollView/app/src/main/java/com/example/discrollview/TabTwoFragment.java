package com.example.discrollview;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP on 01-07-2017.
 */

public class TabTwoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_tab_two,container,false);

        CardView circuitrixjr = (CardView)v.findViewById(R.id.cardCircuitrixjr);
        CardView circuitrix = (CardView)v.findViewById(R.id.cardCircuitrix);
        CardView robowars = (CardView)v.findViewById(R.id.cardRobowars);
        CardView robocon = (CardView)v.findViewById(R.id.cardRobocon);
        CardView robomaze = (CardView)v.findViewById(R.id.cardRobomaze);
        CardView robosoccer = (CardView)v.findViewById(R.id.cardRobosoccer);
        CardView hackoverflow = (CardView)v.findViewById(R.id.cardHackoverflow);

        circuitrixjr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 0);
                startActivity(i);
            }
        });

        circuitrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 1);
                startActivity(i);
            }
        });

        robowars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 2);
                startActivity(i);
            }
        });

        robocon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 3);
                startActivity(i);
            }
        });

        robomaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 4);
                startActivity(i);
            }
        });

        robosoccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 5);
                startActivity(i);
            }
        });

        hackoverflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 6);
                startActivity(i);
            }
        });



        return v;
    }
}