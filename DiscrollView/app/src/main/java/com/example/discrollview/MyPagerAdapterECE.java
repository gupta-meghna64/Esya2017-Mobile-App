package com.example.discrollview;

/**
 * Created by HP on 01-07-2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by HP on 01-07-2017.
 */
public class MyPagerAdapterECE extends FragmentPagerAdapter {

    public MyPagerAdapterECE(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Circuitrix Junior";
        else if (position == 1)
            return "Circuitrix";
        else if (position == 2)
            return "RoboWars";
        else if (position == 3)
            return "RoboCon";
        else if (position == 4)
            return "RoboSoccer";
        else
            return "HackOverflow";

    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new FragmentECE1();
        else if (position == 1)
            return new FragmentECE2();
        else if (position == 2)
            return new FragmentECE3();
        else if (position == 3)
            return new FragmentECE4();
        else if (position == 4)
            return new FragmentECE6();
        else
            return new FragmentECE7();

    }
}