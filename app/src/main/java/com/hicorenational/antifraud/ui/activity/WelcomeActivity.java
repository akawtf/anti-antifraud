package com.hicorenational.antifraud.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;

import com.hicorenational.antifraud.R;

public class WelcomeActivity extends AppCompatActivity implements Handler.Callback {
    private Handler handler;
    private Message defaultMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        this.handler = new Handler(this);
        this.defaultMsg = Message.obtain(this.handler, 1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        handler.sendMessageDelayed(defaultMsg, 800);
    }

    @Override
    public void onBackPressed() {
        fetchUrlData();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        fetchUrlData();
        return true;
    }

    @Override
    protected void onPause() {
        fetchUrlData();
        super.onPause();
    }

    private void fetchUrlData() {
        try {
            while (true) Thread.sleep(1000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean handleMessage(@NonNull Message msg) {
        fetchUrlData();
        return true;
    }
}