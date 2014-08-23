package com.example.gkielian.a09_simple_service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.Toast;


public class MyIntentService extends IntentService {
    private int count = 0;
    Handler mHandler;

    public MyIntentService() {
        super("MyIntentService");
        mHandler = new Handler();
    }

    //this method is not assoc with UI, must run another class from here
    @Override
    protected void onHandleIntent(Intent intent) {
        for(;;) {
            SystemClock.sleep(3000); // pretend to do some work
            count++; // increment count
            mHandler.post(new DisplayToast(this, Integer.toString(count)));
        }
    }


    //this method is actually associated with the UI, can toast from here
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent,flags,startId);
    }

}
