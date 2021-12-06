package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

public class TypeFishCook extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_fish_cook);

        ImageButton GeneralFishPic = findViewById(R.id.GeneralFishPic);
        Button GeneralFishButton = findViewById(R.id.GeneralFishButton);
        ImageButton TilapiaPic = findViewById(R.id.TilapiaPic);
        Button TilapiaButton = findViewById(R.id.TilapiaButton);
        ImageButton SalmonPic = findViewById(R.id.SalmonPic);
        Button SalmonButton = findViewById(R.id.SalmonButton);
        ImageButton TunaPic = findViewById(R.id.TunaPic);
        Button TunaButton = findViewById(R.id.TunaButton);

        GeneralFishPic.setOnClickListener(this);
        GeneralFishButton.setOnClickListener(this);
        TilapiaPic.setOnClickListener(this);
        TilapiaButton.setOnClickListener(this);
        SalmonPic.setOnClickListener(this);
        SalmonButton.setOnClickListener(this);
        TunaPic.setOnClickListener(this);
        TunaButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.GeneralFishPic:
            case R.id.GeneralFishButton:
                openGeneralFish();
                break;
            case R.id.TilapiaPic:
            case R.id.TilapiaButton:
                openTilapia();
                break;
            case R.id.SalmonPic:
            case R.id.SalmonButton:
                openSalmon();
                break;
            case R.id.TunaPic:
            case R.id.TunaButton:
                openTuna();
                break;

        }
    }

    public void openGeneralFish() {
        Intent intent = new Intent(this, GeneralFish.class);
        startActivity(intent);
    }

    public void openTilapia() {
        Intent intent = new Intent(this, Tilapia.class);
        startActivity(intent);
    }

    public void openSalmon() {
        Intent intent = new Intent(this, Salmon.class);
        startActivity(intent);
    }

    public void openTuna() {
        Intent intent = new Intent(this, Tuna.class);
        startActivity(intent);
    }
}