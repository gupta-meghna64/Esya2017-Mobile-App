package com.example.discrollview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by HP on 01-07-2017.
 */

public class TabOneFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab_one,container,false);
        CardView proconjr = (CardView)v.findViewById(R.id.cardProconJr);
        proconjr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment Fragment = new FragmentCSE1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                ViewPager pager = (ViewPager)v.findViewById(R.id.pagerCse);
//                pager.setAdapter(new MyPagerAdapterEvents(getFragmentManager()));
//
//                // Bind the tabs to the ViewPager
//                PagerSlidingTabStrip tabs = (PagerSlidingTabStrip)v.findViewById(R.id.tabsCse);
//                tabs.setViewPager(pager);
                transaction.replace(R.id.cardProconJr, Fragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
            }
        });



        return v;
    }
}