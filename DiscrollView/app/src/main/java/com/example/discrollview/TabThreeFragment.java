package com.example.discrollview;

import android.content.Intent;
import android.content.res.Resources;
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

public class TabThreeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab_three, container, false);

        CardView chess = (CardView) v.findViewById(R.id.cardChess);
        CardView huntit = (CardView) v.findViewById(R.id.cardHuntIT);
        CardView quiz = (CardView) v.findViewById(R.id.cardQuiz);
        CardView foqs = (CardView) v.findViewById(R.id.cardFOQS);
        CardView pwned = (CardView) v.findViewById(R.id.cardPWNED);
        CardView fakingtheresearch = (CardView) v.findViewById(R.id.cardFakingTheResearch);
        CardView thebigbang = (CardView) v.findViewById(R.id.cardBigBang);
        CardView words = (CardView) v.findViewById(R.id.cardWordsToGo);
        CardView minimilitia = (CardView) v.findViewById(R.id.cardMiniMilitia);
//        CardView poker = (CardView) v.findViewById(R.id.cardPoker);
        CardView speedcubing = (CardView) v.findViewById(R.id.cardSpeedCubing);
        CardView chakravyuha = (CardView) v.findViewById(R.id.cardChakravyuha);

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

//        poker.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getActivity(), NTMainActivity.class);
//                i.putExtra("viewpager_position", 9);
//                startActivity(i);
//            }
//        });

        speedcubing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), NTMainActivity.class);
                i.putExtra("viewpager_position", 10);
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

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        int imageHeight = (int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels / 2.69);
        int imageWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

        ImageView chessCover = (ImageView) getActivity().findViewById(R.id.chessCover);
        chessCover.getLayoutParams().width = imageWidth;
        chessCover.getLayoutParams().height = imageHeight;
        chessCover.requestLayout();

        ImageView huntITCover = (ImageView) getActivity().findViewById(R.id.huntITCover);
        huntITCover.getLayoutParams().width = imageWidth;
        huntITCover.getLayoutParams().height = imageHeight;
        huntITCover.requestLayout();

        ImageView quizCover = (ImageView) getActivity().findViewById(R.id.quizCover);
        quizCover.getLayoutParams().width = imageWidth;
        quizCover.getLayoutParams().height = imageHeight;
        quizCover.requestLayout();

        ImageView foqsCover = (ImageView) getActivity().findViewById(R.id.foqsCover);
        foqsCover.getLayoutParams().width = imageWidth;
        foqsCover.getLayoutParams().height = imageHeight;
        foqsCover.requestLayout();

        ImageView pwnedCover = (ImageView) getActivity().findViewById(R.id.pwnedCover);
        pwnedCover.getLayoutParams().width = imageWidth;
        pwnedCover.getLayoutParams().height = imageHeight;
        pwnedCover.requestLayout();

        ImageView fakingtheresearchCover = (ImageView) getActivity().findViewById(R.id.fakingtheresearchCover);
        fakingtheresearchCover.getLayoutParams().width = imageWidth;
        fakingtheresearchCover.getLayoutParams().height = imageHeight;
        fakingtheresearchCover.requestLayout();

        ImageView bigbangCover = (ImageView) getActivity().findViewById(R.id.bigbangCover);
        bigbangCover.getLayoutParams().width = imageWidth;
        bigbangCover.getLayoutParams().height = imageHeight;
        bigbangCover.requestLayout();

        ImageView wordstogoCover = (ImageView) getActivity().findViewById(R.id.wordstogoCover);
        wordstogoCover.getLayoutParams().width = imageWidth;
        wordstogoCover.getLayoutParams().height = imageHeight;
        wordstogoCover.requestLayout();

        ImageView minimilitiaCover = (ImageView) getActivity().findViewById(R.id.minimilitiaCover);
        minimilitiaCover.getLayoutParams().width = imageWidth;
        minimilitiaCover.getLayoutParams().height = imageHeight;
        minimilitiaCover.requestLayout();

//        ImageView pokerCover = (ImageView) getActivity().findViewById(R.id.pokerCover);
//        pokerCover.getLayoutParams().width = imageWidth;
//        pokerCover.getLayoutParams().height = imageHeight;
//        pokerCover.requestLayout();

        ImageView speedcubingCover = (ImageView) getActivity().findViewById(R.id.speedcubingCover);
        speedcubingCover.getLayoutParams().width = imageWidth;
        speedcubingCover.getLayoutParams().height = imageHeight;
        speedcubingCover.requestLayout();


        ImageView chakravyuhaCover = (ImageView) getActivity().findViewById(R.id.chakravyuhaCover);
        chakravyuhaCover.getLayoutParams().width = imageWidth;
        chakravyuhaCover.getLayoutParams().height = imageHeight;
        chakravyuhaCover.requestLayout();
    }
}
