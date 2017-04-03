package com.weebly.codelet.codelet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.content.ContentValues.TAG;

public class HelloWorldFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.helloworldfragment, container, false);
        AdView mAdView = (AdView) result.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        ImageView view = (ImageView) result.findViewById(R.id.helloWorldFragmentImageOne);
        Glide.with(this)
                .load("https://goo.gl/SBRkwA")
                .placeholder(R.drawable.loading)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        Log.d(TAG, "Listener onException: " + e.toString());
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        Log.d(TAG, "onResourceReady with resource = " + resource);
                        Log.d(TAG, "onResourceReady from memory cache = " + isFromMemoryCache);
                        return false;
                    }
                })
                .error(R.drawable.noimage)
                .into(view);
        ImageView viewTwo = (ImageView) result.findViewById(R.id.helloWorldFragmentImageTwo);
        Glide.with(this)
                .load("https://goo.gl/ookosg")
                .placeholder(R.drawable.loading)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        Log.d(TAG, "Listener onException: " + e.toString());
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        Log.d(TAG, "onResourceReady with resource = " + resource);
                        Log.d(TAG, "onResourceReady from memory cache = " + isFromMemoryCache);
                        return false;
                    }
                })
                .error(R.drawable.noimage)
                .into(viewTwo);
        ImageView viewThree = (ImageView) result.findViewById(R.id.helloWorldFragmentImageThree);
        Glide.with(this)
                .load("https://goo.gl/5wtXfB")
                .placeholder(R.drawable.loading)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        Log.d(TAG, "Listener onException: " + e.toString());
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        Log.d(TAG, "onResourceReady with resource = " + resource);
                        Log.d(TAG, "onResourceReady from memory cache = " + isFromMemoryCache);
                        return false;
                    }
                })
                .error(R.drawable.noimage)
                .into(viewThree);
        ImageView viewFour = (ImageView) result.findViewById(R.id.helloWorldFragmentImageFour);
        Glide.with(this)
                .load("https://goo.gl/v37an2")
                .placeholder(R.drawable.loading)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        Log.d(TAG, "Listener onException: " + e.toString());
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        Log.d(TAG, "onResourceReady with resource = " + resource);
                        Log.d(TAG, "onResourceReady from memory cache = " + isFromMemoryCache);
                        return false;
                    }
                })
                .error(R.drawable.noimage)
                .into(viewFour);
        return result;
    }

}
