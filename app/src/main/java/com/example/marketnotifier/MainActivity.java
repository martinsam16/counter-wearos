package com.example.marketnotifier;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView times;
    private int clicks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        times = findViewById(R.id.times);
    }

    public void add(View view){
        clicks+=1;
        times.setText(String.valueOf(clicks));
    }

    public void substract(View view){
        clicks-=1;
        times.setText(String.valueOf(clicks));
    }


}