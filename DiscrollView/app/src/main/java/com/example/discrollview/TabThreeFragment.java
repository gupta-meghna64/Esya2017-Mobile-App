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

public class TabThreeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab_three,container,false);

        CardView chess = (CardView)v.findViewById(R.id.cardChess);
        CardView huntit = (CardView)v.findViewById(R.id.cardHuntIT);
        CardView quiz = (CardView)v.findViewById(R.id.cardQuiz);
        CardView foqs = (CardView)v.findViewById(R.id.cardFOQS);
        CardView pwned = (CardView)v.findViewById(R.id.cardPWNED);
        CardView fakingtheresearch = (CardView)v.findViewById(R.id.cardFakingTheResearch);
        CardView thebigbang = (CardView)v.findViewById(R.id.cardBigBang);
        CardView words = (CardView)v.findViewById(R.id.cardWordsToGo);
        CardView minimilitia = (CardView)v.findViewById(R.id.cardMiniMilitia);
        CardView poker = (CardView)v.findViewById(R.id.cardPoker);
        CardView speedcubing = (CardView)v.findViewById(R.id.cardSpeedCubing);
        CardView mockstocks = (CardView)v.findViewById(R.id.cardMockstocks);
        CardView chakravyuha = (CardView)v.findViewById(R.id.cardChakravyuha);

        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 0);
                startActivity(i);
            }
        });

        huntit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 1);
                startActivity(i);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 2);
                startActivity(i);
            }
        });

        foqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 3);
                startActivity(i);
            }
        });

        pwned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 4);
                startActivity(i);
            }
        });

        fakingtheresearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 5);
                startActivity(i);
            }
        });

        thebigbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 6);
                startActivity(i);
            }
        });

        words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 7);
                startActivity(i);
            }
        });

        minimilitia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 8);
                startActivity(i);
            }
        });

        poker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 9);
                startActivity(i);
            }
        });

        speedcubing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 10);
                startActivity(i);
            }
        });

        mockstocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 11);
                startActivity(i);
            }
        });

        chakravyuha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 12);
                startActivity(i);
            }
        });
        return v;
    }
}