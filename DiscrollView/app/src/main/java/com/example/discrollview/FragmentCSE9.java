package com.example.discrollview;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by HP on 01-07-2017.
 */

public class FragmentCSE9 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cse9, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


        int imageHeight = (int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels / 2.69);
        int imageWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

        ImageView hackonCover = (ImageView) getActivity().findViewById(R.id.hackonMainCover);
        hackonCover.getLayoutParams().width = imageWidth;
        hackonCover.getLayoutParams().height = imageHeight;
        hackonCover.requestLayout();

    }
}