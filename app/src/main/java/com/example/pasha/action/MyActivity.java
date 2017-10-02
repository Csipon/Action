package com.example.pasha.action;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Pasha on 10/2/2017.
 */

public class MyActivity extends Activity {
    private static int counter;
    TextView tvOut;
    Button btnIncrement;
    Button btnDecrement;
    Button btnGreen;
    Button btnRed;
    Button btnDefault;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // найдем View-элементы
        tvOut = findViewById(R.id.counter);
        btnIncrement = findViewById(R.id.btnIncrement);
        btnDecrement = findViewById(R.id.btnDecrement);
        btnDefault = findViewById(R.id.btnDefault);
        btnRed = findViewById(R.id.red);
        btnGreen = findViewById(R.id.green);



        View.OnClickListener increment = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("" + counter++);
            }
        };

        View.OnClickListener decrement = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("" + counter--);
            }
        };

        View.OnClickListener red = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                tvOut.setTextColor(getResources().getColor(R.color.red, getTheme()));
            }
        };

        View.OnClickListener green = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                tvOut.setTextColor(getResources().getColor(R.color.green, getTheme()));
            }
        };

        View.OnClickListener reset = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                tvOut.setText("Counter");
                tvOut.setTextColor(getResources().getColor(R.color.defaultC, getTheme()));
            }
        };

        btnIncrement.setOnClickListener(increment);
        btnDecrement.setOnClickListener(decrement);
        btnGreen.setOnClickListener(green);
        btnRed.setOnClickListener(red);
        btnDefault.setOnClickListener(reset);
    }



}
