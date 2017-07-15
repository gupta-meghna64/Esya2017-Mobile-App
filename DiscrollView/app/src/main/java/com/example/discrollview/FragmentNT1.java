package com.example.discrollview;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by HP on 01-07-2017.
 */

public class FragmentNT1 extends Fragment {

    private Button register;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nt1, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        register=(Button) getActivity().findViewById(R.id.buttonRegisterChess);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScx1AZIJEIPGDfrd1tzqgAiUkFw6--ZjLLVm2_TniBZk9AvWQ/viewform")));
            }
        });

    }}