package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "hello";
    private int factorielle(int n){
        int r;
        if (n > 1) {
            int fnm1 = factorielle(n-1);
            r = n * fnm1;
        } else {
            r = 1;
        }
        return r;
    }

    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        String text = "Bonjour Alex";
        Log.i(TAG, text);

        int v = 54;
        int n = v / 9 - 2;
        Log.i(TAG, "n = "+n);
        int f = factorielle(n);
        Log.i(TAG, n+"! = "+f);

        myButton = (Button)findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        });
    }
}