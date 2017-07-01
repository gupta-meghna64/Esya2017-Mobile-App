package com.example.discrollview;

/**
 * Created by HP on 01-07-2017.
 */

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class EventsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_actiivty_main);
        // Setup Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pagerEvents);
        // Assign created adapter to viewPager
        viewPager.setAdapter(new TabsExamplePagerAdapter(getSupportFragmentManager()));


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout_events);
        // This method setup all required method for TabLayout with Viewpager
        tabLayout.setupWithViewPager(viewPager);


    }

    public static class TabsExamplePagerAdapter extends FragmentPagerAdapter {
        // As we are implementing two tabs
        private static final int NUM_ITEMS = 3;

        public TabsExamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        // For each tab different fragment is returned
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TabOneFragment();
                case 1:
                    return new TabTwoFragment();
                case 2:
                    return new TabThreeFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;

        }

        @Override
        public CharSequence getPageTitle(int position) {
            // For simplicity of this tutorial this string is hardcoded
            // Otherwise it should be access using string resource
            if(position == 0)
                return "CSE EVENTS";
            else if(position == 1)
                return "ECE EVENTS";
            else
                return "NON-TECH EVENTS";
        }
    }


}