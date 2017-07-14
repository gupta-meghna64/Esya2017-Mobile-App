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
public class MyPagerAdapterCSE extends FragmentPagerAdapter {

    public MyPagerAdapterCSE(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Design360";
        else if (position == 1)
            return "Prosort";
        else if (position == 2)
            return "Procon";
        else if (position == 3)
            return "Procon Junior";
        else if (position == 4)
            return "Code in Less";
        else if (position == 5)
            return "Darwin Games";
        else if (position == 6)
            return "Seg Fault";
        else if (position == 7)
            return "Brain Fuzz";
        else if (position == 8)
            return "Toast To Code";
        else if (position == 9)
            return "HackOn";
        else if (position == 10)
            return "HackIIIT";
        else
            return "Techathlon";
    }

    @Override
    public int getCount() {
        return 12;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new FragmentCSE11();
        else if (position == 1)
            return new FragmentCSE1();
        else if (position == 2)
            return new FragmentCSE2();
        else if (position == 3)
            return new FragmentCSE3();
        else if (position == 4)
            return new FragmentCSE4();
        else if (position == 5)
            return new FragmentCSE5();
        else if (position == 6)
            return new FragmentCSE6();
        else if (position == 7)
            return new FragmentCSE7();
        else if (position == 8)
            return new FragmentCSE8();
        else if (position == 9)
            return new FragmentCSE9();
        else if (position == 10)
            return new FragmentCSE10();
        else if (position == 11)
            return new FragmentCSE12();
        else
            return new FragmentCSE11();

    }
}