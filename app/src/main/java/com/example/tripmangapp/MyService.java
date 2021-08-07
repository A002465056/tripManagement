package com.example.tripmangapp;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by vishwa on 07,August,2021
 */
public class MyService extends Service {
    Handler handler;
    Runnable test;
    public MyService() {
        handler = new Handler();
        test = new Runnable() {
            @Override
            public void run() {
                Log.d("foo", "bar");
                handler.postDelayed(test, 4*1000); //100 ms you should do it 4000
            }
        };

        handler.postDelayed(test, 0);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
