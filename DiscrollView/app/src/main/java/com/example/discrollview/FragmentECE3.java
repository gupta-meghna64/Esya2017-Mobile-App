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
import android.widget.TextView;

/**
 * Created by HP on 01-07-2017.
 */

public class FragmentECE3 extends Fragment {
    private Button register;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ece3, container, false);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        MyTextView rules = (MyTextView) getActivity().findViewById(R.id.roboconRules);
        register = (Button) getActivity().findViewById(R.id.buttonRegisterRobowars);
        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1TcjoZQqrXufHctELryqe0ArAIWfsP-4_KtscOeFpK4o/edit?usp=sharing")));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/a/iiitd.ac.in/forms/d/1tpBgPMSR7A676fHmQTAeB0QG4emaJiQfu6jKUA0BRmE/edit?usp=drivesdk")));
            }
        });

        int imageHeight = (int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels / 2.69);
        int imageWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

        ImageView robowarsCover = (ImageView) getActivity().findViewById(R.id.robowarsMainCover);
        robowarsCover.getLayoutParams().width = imageWidth;
        robowarsCover.getLayoutParams().height = imageHeight;
        robowarsCover.requestLayout();


    }
}