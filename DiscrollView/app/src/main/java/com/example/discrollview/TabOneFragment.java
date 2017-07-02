package com.example.discrollview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by HP on 01-07-2017.
 */

public class TabOneFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab_one,container,false);
        CardView proconjr = (CardView)v.findViewById(R.id.cardProconJr);
        CardView procon = (CardView)v.findViewById(R.id.cardProcon);
        CardView prosort = (CardView)v.findViewById(R.id.cardProsort);
        CardView codeinless = (CardView)v.findViewById(R.id.cardCodeinless);
        CardView darwingames = (CardView)v.findViewById(R.id.cardDarwingames);
        CardView segfault = (CardView)v.findViewById(R.id.cardSegfault);
        CardView brainfuzz = (CardView)v.findViewById(R.id.cardBrainFuzz);
        CardView toasttocode = (CardView)v.findViewById(R.id.cardToastToCode);
        CardView hackon = (CardView)v.findViewById(R.id.cardHackOn);
        CardView hackiiitd = (CardView)v.findViewById(R.id.cardHackIIITD);
        CardView design360 = (CardView)v.findViewById(R.id.cardDesign360);
        CardView techathlon = (CardView)v.findViewById(R.id.cardTechathlon);

//        proconjr.getLayoutParams().width= Resources.getSystem().getDisplayMetrics().widthPixels;
//        int height = (int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels/2.69);
//        proconjr.getLayoutParams().height = height;
//        proconjr.requestLayout();

        proconjr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 0);
                startActivity(i);
            }
        });

        procon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 1);
                startActivity(i);
            }
        });

        prosort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 2);
                startActivity(i);
            }
        });

        codeinless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 3);
                startActivity(i);
            }
        });

        darwingames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 4);
                startActivity(i);
            }
        });

        segfault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 5);
                startActivity(i);
            }
        });

        brainfuzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 6);
                startActivity(i);
            }
        });

        toasttocode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 7);
                startActivity(i);
            }
        });

        hackon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 8);
                startActivity(i);
            }
        });

        hackiiitd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hackiiitd.in/")));
            }
        });

        design360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 10);
                startActivity(i);
            }
        });

        techathlon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 11);
                startActivity(i);
            }
        });





        return v;
    }
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        if (requestCode == 1) {
//            if(resultCode == Activity.RESULT_OK){
//                new FragmentCSE1();
//            }
//            if (resultCode == Activity.RESULT_CANCELED) {
//                //Write your code if there's no result
//                Toast.makeText(getContext(), "No Fragment Returned", Toast.LENGTH_LONG).show();
//            }
//        }
//        else if(requestCode == 2) {
//            if(resultCode == Activity.RESULT_OK){
//                new FragmentCSE2();
//            }
//            if (resultCode == Activity.RESULT_CANCELED) {
//                //Write your code if there's no result
//                Toast.makeText(getContext(), "No Fragment Returned", Toast.LENGTH_LONG).show();
//            }
//        }
//    }//onActivityResult
}