package com.example.clientagent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textView = new TextView(this);
        textView.setText("ClientAgent is Running Successfully!");
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(20);
        
        setContentView(textView);
    }
}

