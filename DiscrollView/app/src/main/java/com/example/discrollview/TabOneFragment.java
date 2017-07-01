package com.example.discrollview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabOneFragment extends Fragment {

    public TabOneFragment() {
        // Required empty public constructor
    }

    final String[] items = new String[] { "Procon Junior", "Procon", "Prosort",
            "Code in Less", "Darwin Games", "Seg Fault", "Brain Fuzz", "Toast to Code",
            "Hack On", "hackIIITD", "Design360" };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View view = inflater.inflate(R.layout.fragment_tab_one, container, false);

        return inflater.inflate(R.layout.fragment_tab_one, container, false);
    }

}