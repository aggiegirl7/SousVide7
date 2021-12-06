package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TypePorkCook extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_pork_cook);

        ImageButton PorkBellyPic  =findViewById(R.id.PorkBellyPic);
        Button PorkBellyButton = findViewById(R.id.PorkBellyButton);
        ImageButton PorkRibsPic = findViewById(R.id.PorkRibsPic);
        Button PorkRibsButton = findViewById(R.id.PorkRibsButton);
        ImageButton PorkChopPic = findViewById(R.id.PorkChopPic);
        Button PorkChopButton = findViewById(R.id.PorkChopButton);
        ImageButton PorkTenderloinPic = findViewById(R.id.PorkTenderloinPic);
        Button PorkTenderloinButton = findViewById(R.id.PorkTenderloinButton);

        PorkBellyPic.setOnClickListener(this);
        PorkBellyButton.setOnClickListener(this);
        PorkRibsPic.setOnClickListener(this);
        PorkRibsButton.setOnClickListener(this);
        PorkChopPic.setOnClickListener(this);
        PorkChopButton.setOnClickListener(this);
        PorkTenderloinPic.setOnClickListener(this);
        PorkTenderloinButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.PorkBellyPic:
            case R.id.PorkBellyButton:
                openPorkBelly();
                break;
            case R.id.PorkRibsPic:
            case R.id.PorkRibsButton:
                openPorkRibs();
                break;
            case R.id.PorkChopPic:
            case R.id.PorkChopButton:
                openPorkChop();
                break;
            case R.id.PorkTenderloinPic:
            case R.id.PorkTenderloinButton:
                openPorkTenderloin();
                break;






    }

}
    public void openPorkBelly() {
        Intent intent = new Intent(this, PorkBelly.class);
        startActivity(intent);
    }
    public void openPorkRibs() {
        Intent intent = new Intent(this, PorkRibs.class);
        startActivity(intent);
    }
    public void openPorkChop() {
        Intent intent = new Intent(this, PorkChop.class);
        startActivity(intent);
    }
    public void openPorkTenderloin() {
        Intent intent = new Intent(this, PorkTenderloin.class);
        startActivity(intent);
    }

}