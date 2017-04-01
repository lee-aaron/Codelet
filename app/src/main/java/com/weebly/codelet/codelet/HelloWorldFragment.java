package com.weebly.codelet.codelet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class HelloWorldFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.helloworldfragment, container, false);
        ImageView view = (ImageView) result.findViewById(R.id.helloWorldFragmentImageOne);
        Glide.with(this)
                .load("https://goo.gl/cSFbWT")
                .crossFade()
                .into(view);
        ImageView viewTwo = (ImageView) result.findViewById(R.id.helloWorldFragmentImageTwo);
        Glide.with(this)
                .load("https://goo.gl/rUJCib")
                .crossFade()
                .into(viewTwo);
        ImageView viewThree = (ImageView) result.findViewById(R.id.helloWorldFragmentImageThree);
        Glide.with(this)
                .load("https://goo.gl/DQVUSC")
                .crossFade()
                .into(viewThree);
        ImageView viewFour = (ImageView) result.findViewById(R.id.helloWorldFragmentImageFour);
        Glide.with(this)
                .load("https://goo.gl/zK7Bbv")
                .crossFade()
                .into(viewFour);
        return result;
    }

}
