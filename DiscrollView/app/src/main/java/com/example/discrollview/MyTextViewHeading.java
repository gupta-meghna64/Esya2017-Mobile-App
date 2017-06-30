package com.example.discrollview;

/**
 * Created by HP on 30-06-2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by HP on 30-06-2017.
 */

public class MyTextViewHeading extends android.support.v7.widget.AppCompatTextView {

    public MyTextViewHeading(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewHeading(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewHeading(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Medium.ttf");
            setTypeface(tf);
        }
    }

}