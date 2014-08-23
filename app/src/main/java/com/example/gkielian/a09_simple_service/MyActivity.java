package com.example.gkielian.a09_simple_service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.TextView;


public class MyActivity extends Activity {
    private ToggleButton mButton;
    private TextView mTextView1;
    private TextView mTextView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mButton = (ToggleButton) findViewById(R.id.button_1);
        mTextView1= (TextView) findViewById(R.id.textview_1);
        mTextView2= (TextView) findViewById(R.id.textview_2);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                if (mButton.isChecked()) {
                    Intent mIntent = new Intent(MyActivity.this, MyIntentService.class);
                    startService(mIntent);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
