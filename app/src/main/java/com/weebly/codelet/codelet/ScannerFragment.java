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
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.content.ContentValues.TAG;

public class ScannerFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.scannerfragment, container, false);
        AdView mAdView = (AdView) result.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        ImageView view = (ImageView) result.findViewById(R.id.scannerImage);
        Glide.with(this)
                .load("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjcn4Cz17vTAhUDzoMKHemqBGwQjRwIBw&url=http%3A%2F%2Fwww.journaldev.com%2F872%2Fjava-scanner-class-java-util-scanner&psig=AFQjCNEwrAJ6csL9rLevuyazKb-7U7lgkA&ust=1493074841677411")
                .placeholder(R.drawable.loading)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        if(e != null)
                        {
                            Log.d(TAG, "Listener onException: " + e.toString());
                        }
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
        return result;
    }

}
