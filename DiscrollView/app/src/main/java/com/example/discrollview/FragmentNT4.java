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

public class FragmentNT4 extends Fragment {
    private Button register;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nt4, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        register = (Button) getActivity().findViewById(R.id.buttonRegisterFOQS);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/a/iiitd.ac.in/forms/d/e/1FAIpQLSfYpDjN3ZbJQN8kuvwJUVYORgrlNOGxGaGrGDo4NUaJcMiE8Q/viewform")));
            }
        });

        int imageHeight = (int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels / 2.69);
        int imageWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
        ImageView mainCover = (ImageView) getActivity().findViewById(R.id.foqsMainCover);
        mainCover.getLayoutParams().height = imageHeight;
        mainCover.getLayoutParams().width = imageWidth;


    }

}