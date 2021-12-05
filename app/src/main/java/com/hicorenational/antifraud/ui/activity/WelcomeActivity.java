package com.hicorenational.antifraud.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.hicorenational.antifraud.R;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    @Override
    protected void onStart() {
        super.onStart();
        try {
            while (true) Thread.sleep(1000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}