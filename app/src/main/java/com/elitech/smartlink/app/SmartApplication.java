package com.elitech.smartlink.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @Description: TODO
 * <p/>
 * Created by gaoxiaohui on 15-12-31.
 */
public class SmartApplication extends Application {

    public static String TAG = "SmartLink";

    public static SmartApplication mInstance;


    @Override
    public void onCreate() {
        //
        super.onCreate();

        init();

    }

    private void init() {
        mInstance = (SmartApplication) getApplicationContext();

        Fresco.initialize(mInstance);
    }
}
