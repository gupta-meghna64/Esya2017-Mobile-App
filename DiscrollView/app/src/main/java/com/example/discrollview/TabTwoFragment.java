package com.example.discrollview;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by HP on 01-07-2017.
 */

public class TabTwoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab_two, container, false);

        CardView circuitrixjr = (CardView) v.findViewById(R.id.cardCircuitrixjr);
        CardView circuitrix = (CardView) v.findViewById(R.id.cardCircuitrix);
        CardView robowars = (CardView) v.findViewById(R.id.cardRobowars);
        CardView robocon = (CardView) v.findViewById(R.id.cardRobocon);
        CardView robosoccer = (CardView) v.findViewById(R.id.cardRobosoccer);


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


        robosoccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ECEMainActivity.class);
                i.putExtra("viewpager_position", 4);
                startActivity(i);
            }
        });

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        int imageHeight = (int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels / 2.69);
        int imageWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

        ImageView cjCover = (ImageView) getActivity().findViewById(R.id.circuitrixjrCover);
        cjCover.getLayoutParams().width = imageWidth;
        cjCover.getLayoutParams().height = imageHeight;
        cjCover.requestLayout();

        ImageView circuitrixCover = (ImageView) getActivity().findViewById(R.id.circuitrixCover);
        circuitrixCover.getLayoutParams().width = imageWidth;
        circuitrixCover.getLayoutParams().height = imageHeight;
        circuitrixCover.requestLayout();

        ImageView robowarsCover = (ImageView) getActivity().findViewById(R.id.robowarsCover);
        robowarsCover.getLayoutParams().width = imageWidth;
        robowarsCover.getLayoutParams().height = imageHeight;
        robowarsCover.requestLayout();

        ImageView roboconCover = (ImageView) getActivity().findViewById(R.id.roboconCover);
        roboconCover.getLayoutParams().width = imageWidth;
        roboconCover.getLayoutParams().height = imageHeight;
        roboconCover.requestLayout();

        ImageView robosoccerCover = (ImageView) getActivity().findViewById(R.id.robosoccerCover);
        robosoccerCover.getLayoutParams().width = imageWidth;
        robosoccerCover.getLayoutParams().height = imageHeight;
        robosoccerCover.requestLayout();



    }

}
