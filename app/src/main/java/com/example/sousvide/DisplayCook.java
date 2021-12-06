package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayCook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cook);

        Intent intent = getIntent();
        int ManualTempvar = intent.getIntExtra(ManualCook.EXTRA_NUMBER,0);
        int ManualTimevar = intent.getIntExtra(ManualCook.EXTRA_TEXT,0);


        TextView textView2 = (TextView) findViewById(R.id.ManualTimedisp);
        TextView textView1 = (TextView) findViewById(R.id.ManualTempdisp);
        //TextView textView3 = (TextView) findViewById(R.id.test);


        textView2.setText("" +ManualTimevar + " hour(s)" );
        textView1.setText("" +ManualTempvar + "\u2109");
        //String example1 = getIntent().getStringExtra("TEST");
        //textView3.setText(example1);
        //String spinner1Value = getIntent().getStringExtra("TEST");


    }
}