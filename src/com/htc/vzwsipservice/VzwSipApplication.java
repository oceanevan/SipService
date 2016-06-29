package com.htc.vzwsipservice;

import android.app.Application;
import android.content.Context;
import android.telecom.TelecomManager;

public class VzwSipApplication extends Application {

    private static VzwSipApplication sInstance;

    public VzwSipApplication() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate() {
        Log.d(this, "onCreate");
        sInstance = this;
        super.onCreate();
    }

    public static VzwSipApplication getInstance() {
        return sInstance;
    }

    public TelecomManager getTelecomManager() {
        return (TelecomManager) sInstance.getSystemService(Context.TELECOM_SERVICE);
    }
}
