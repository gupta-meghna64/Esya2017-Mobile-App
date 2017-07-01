package com.example.discrollview;

/**
 * Created by HP on 01-07-2017.
 */
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;

public class CSEMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pagerCse);
        pager.setAdapter(new MyPagerAdapterCSE(getSupportFragmentManager()));

        // Bind the tabs to the ViewPager
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabsCse);
        tabs.setViewPager(pager);
    }
}
