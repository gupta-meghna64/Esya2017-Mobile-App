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

public class FragmentCSE4 extends Fragment {
    private Button register;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cse4, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        register=(Button) getActivity().findViewById(R.id.buttonRegisterCodeinless);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/a/iiitd.ac.in/forms/d/18kpFPcmQizLlhP2tBcfKMYwnSXJxCxvlwmlV6V1PP2c/edit?usp=drivesdk")));
            }
        });

        int imageHeight = (int) Math.round(Resources.getSystem().getDisplayMetrics().widthPixels / 2.69);
        int imageWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

        ImageView codeinlessCover = (ImageView) getActivity().findViewById(R.id.codeinlessMainCover);
        codeinlessCover.getLayoutParams().width = imageWidth;
        codeinlessCover.getLayoutParams().height = imageHeight;
        codeinlessCover.requestLayout();

    }
}