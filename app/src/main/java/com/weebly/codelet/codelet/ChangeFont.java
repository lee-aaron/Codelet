package com.weebly.codelet.codelet;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class ChangeFont extends TextView {

    public ChangeFont(Context context, AttributeSet attrs, int defStyle)
    {
        super(context,attrs,defStyle);
        init();
    }

    public ChangeFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ChangeFont(Context context) {
        super(context);
        init();
    }

    public void init()
    {
        if(!isInEditMode())
        {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Sloppy-Hand.otf");
            setTypeface(tf);
        }
    }

}
