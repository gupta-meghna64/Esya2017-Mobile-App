package com.example.discrollview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by HP on 01-07-2017.
 */

public class TabOneFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab_one, container, false);
        CardView proconjr = (CardView) v.findViewById(R.id.cardProconJr);
        CardView procon = (CardView) v.findViewById(R.id.cardProcon);
        CardView prosort = (CardView) v.findViewById(R.id.cardProsort);
        CardView codeinless = (CardView) v.findViewById(R.id.cardCodeinless);
        CardView darwingames = (CardView) v.findViewById(R.id.cardDarwingames);
        CardView segfault = (CardView) v.findViewById(R.id.cardSegfault);
        CardView brainfuzz = (CardView) v.findViewById(R.id.cardBrainFuzz);
        CardView toasttocode = (CardView) v.findViewById(R.id.cardToastToCode);
        CardView hackon = (CardView) v.findViewById(R.id.cardHackOn);
        CardView hackiiitd = (CardView) v.findViewById(R.id.cardHackIIITD);
        CardView design360 = (CardView) v.findViewById(R.id.cardDesign360);
        CardView techathlon = (CardView) v.findViewById(R.id.cardTechathlon);



        proconjr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 3);
                startActivity(i);
            }
        });

        procon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 2);
                startActivity(i);
            }
        });

        prosort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 1);
                startActivity(i);
            }
        });

        codeinless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 4);
                startActivity(i);
            }
        });

        darwingames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 5);
                startActivity(i);
            }
        });

        segfault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 6);
                startActivity(i);
            }
        });

        brainfuzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 7);
                startActivity(i);
            }
        });

        toasttocode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 8);
                startActivity(i);
            }
        });

        hackon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CSEMainActivity.class);
                i.putExtra("viewpager_position", 9);
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
                i.putExtra("viewpager_position", 0);
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

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        int imageHeight=(int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels/2.69);
        int imageWidth= Resources.getSystem().getDisplayMetrics().widthPixels;

        ImageView designCover= (ImageView) getActivity().findViewById(R.id.designCover);
        designCover.getLayoutParams().width=imageWidth;
        designCover.getLayoutParams().height=imageHeight;
        designCover.requestLayout();

        ImageView prosortCover= (ImageView) getActivity().findViewById(R.id.prosortCover);
        prosortCover.getLayoutParams().width=imageWidth;
        prosortCover.getLayoutParams().height=imageHeight;
        prosortCover.requestLayout();

        ImageView proconCover= (ImageView) getActivity().findViewById(R.id.proconCover);
        proconCover.getLayoutParams().width=imageWidth;
        proconCover.getLayoutParams().height=imageHeight;
        proconCover.requestLayout();

        ImageView proconJrCover= (ImageView) getActivity().findViewById(R.id.proconJrCover);
        proconJrCover.getLayoutParams().width=imageWidth;
        proconJrCover.getLayoutParams().height=imageHeight;
        proconJrCover.requestLayout();

        ImageView codeinlessCover= (ImageView) getActivity().findViewById(R.id.codeinlessCover);
        codeinlessCover.getLayoutParams().width=imageWidth;
        codeinlessCover.getLayoutParams().height=imageHeight;
        codeinlessCover.requestLayout();

        ImageView darwingamesCover= (ImageView) getActivity().findViewById(R.id.darwingamesCover);
        darwingamesCover.getLayoutParams().width=imageWidth;
        darwingamesCover.getLayoutParams().height=imageHeight;
        darwingamesCover.requestLayout();

        ImageView segfaultCover= (ImageView) getActivity().findViewById(R.id.segfaultCover);
        segfaultCover.getLayoutParams().width=imageWidth;
        segfaultCover.getLayoutParams().height=imageHeight;
        segfaultCover.requestLayout();

        ImageView brainfuzzCover= (ImageView) getActivity().findViewById(R.id.brainfuzzCover);
        brainfuzzCover.getLayoutParams().width=imageWidth;
        brainfuzzCover.getLayoutParams().height=imageHeight;
        brainfuzzCover.requestLayout();

        ImageView toasttocodeCover= (ImageView) getActivity().findViewById(R.id.toasttocodeCover);
        toasttocodeCover.getLayoutParams().width=imageWidth;
        toasttocodeCover.getLayoutParams().height=imageHeight;
        toasttocodeCover.requestLayout();

        ImageView hackonCover= (ImageView) getActivity().findViewById(R.id.hackonCover);
        hackonCover.getLayoutParams().width=imageWidth;
        hackonCover.getLayoutParams().height=imageHeight;
        hackonCover.requestLayout();

        ImageView hackIIITCover= (ImageView) getActivity().findViewById(R.id.hackIIITCover);
        hackIIITCover.getLayoutParams().width=imageWidth;
        hackIIITCover.getLayoutParams().height=imageHeight;
        hackIIITCover.requestLayout();

        ImageView tecathlonCover= (ImageView) getActivity().findViewById(R.id.tecathlonCover);
        tecathlonCover.getLayoutParams().width=imageWidth;
        tecathlonCover.getLayoutParams().height=imageHeight;
        tecathlonCover.requestLayout();

    }
}