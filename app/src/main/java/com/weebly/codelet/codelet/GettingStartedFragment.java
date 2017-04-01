package com.weebly.codelet.codelet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class GettingStartedFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.gettingstartedfragment, container, false);
        ImageView view = (ImageView) result.findViewById(R.id.gettingStartedFragmentImage);
        Glide.with(this)
                .load("https://goo.gl/59r5HZ")
                .crossFade()
                .into(view);
        return result;
    }

}
