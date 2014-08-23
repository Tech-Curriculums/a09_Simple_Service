package com.example.gkielian.a09_simple_service;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by gregorykielian on 8/22/14.
 */
public class DisplayToast implements Runnable {

    private final Context mContext;
    String mText;

    public DisplayToast(Context context, String text) {
        this.mContext = context;
        this.mText = text;
    }

    public void run() {
        Toast.makeText(mContext, mText, Toast.LENGTH_SHORT).show();
    }
}
