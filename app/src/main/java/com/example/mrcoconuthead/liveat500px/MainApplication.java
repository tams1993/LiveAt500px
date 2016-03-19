package com.example.mrcoconuthead.liveat500px;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Mr. Coconut Head on 3/18/2016.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Contextor.getInstance().init(getApplicationContext());


    }


    @Override
    public void onTerminate() {
        super.onTerminate();



    }


}
