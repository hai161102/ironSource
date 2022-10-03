package com.example.iron_source;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

public class IronSourceManager {

    private IronSourceManager instance;

    public IronSourceManager getInstance() {
        if (instance == null){
            instance = new IronSourceManager();
        }
        return instance;
    }

    private IronSourceManager() {
    }

    public void loadInterstitial(InterstitialListener listener){
        if (listener == null)
            return;
        IronSource.setInterstitialListener(listener);
        IronSource.loadInterstitial();
    }

}
