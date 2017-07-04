package com.example.discrollview;

/**
 * Created by HP on 01-07-2017.
 */

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;

public class NTMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nt_activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pagerNt);
        pager.setAdapter(new MyPagerAdapterNT(getSupportFragmentManager()));

        // Bind the tabs to the ViewPager
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabsNt);
        tabs.setViewPager(pager);

        int position = 0;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("viewpager_position");
        }
        pager = (ViewPager) findViewById(R.id.pagerNt);
        MyPagerAdapterNT myPagerAdapter = new MyPagerAdapterNT(getSupportFragmentManager());
        if (pager.getAdapter() == null) {
            pager.setAdapter(myPagerAdapter);

        }
        pager.setCurrentItem(position);
    }
}
