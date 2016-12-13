package com.example.user.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by User on 13/12/2016.
 */
public class EightBall extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Eightball", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
