package com.example.discrollview;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HP on 01-07-2017.
 */

public class FragmentECE3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ece3, container, false);
//        MyTextView tv = (MyTextView) getView().findViewById(R.id.roboconRules);
//        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1TcjoZQqrXufHctELryqe0ArAIWfsP-4_KtscOeFpK4o/edit?usp=sharing")));
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        MyTextView rules = (MyTextView) getActivity().findViewById(R.id.roboconRules);
        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1TcjoZQqrXufHctELryqe0ArAIWfsP-4_KtscOeFpK4o/edit?usp=sharing")));
            }
        });


    }
}