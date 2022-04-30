package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.Button;

public class FoodChooser extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_chooser);

        //creates Image Button variable
        //each instance connects buttons with layout using findViewById
        //Id is assigned to button in FoodChooser.xml file

        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        Button EggButton = (Button) findViewById(R.id.EggButton);
        ImageButton ChickenPicButton = findViewById(R.id.ChickenPicButton);
        Button ChickenButton = findViewById(R.id.ChickenButton);
        ImageButton BeefPicButton = findViewById(R.id.BeefPicButton);
        Button BeefButton = findViewById(R.id.BeefButton);
        ImageButton PorkPicButton = findViewById(R.id.PorkPicButton);
        Button PorkButton = findViewById(R.id.PorkButton);


        Button Manual = findViewById(R.id.Manual);
        ImageButton FishPicButton = findViewById(R.id.FishPicButton);
        Button FishButton = findViewById(R.id.FishButton);

        //apply setOnClickListener for all buttons
        imageButton2.setOnClickListener(this);
        EggButton.setOnClickListener(this);
        ChickenPicButton.setOnClickListener(this);
        ChickenButton.setOnClickListener(this);
        BeefPicButton.setOnClickListener(this);
        BeefButton.setOnClickListener(this);
        PorkPicButton.setOnClickListener(this);
        PorkButton.setOnClickListener(this);
        Manual.setOnClickListener(this);
        FishPicButton.setOnClickListener(this);
        FishButton.setOnClickListener(this);


            }

    @Override
    //common onClick() over all buttons
    public void onClick(View v) {
        //use switch case to decide what activity is opened when buttons clicked
        switch (v.getId()) {
            case R.id.imageButton2:
            case R.id.EggButton:
                openJustSet();
                break;
            case R.id.ChickenButton:
            case R.id.ChickenPicButton:
                openTypeChickenCook();
                break;
            case R.id.BeefButton:
            case R.id.BeefPicButton:
                openTypeBeefCook();
                break;
            case R.id.PorkPicButton:
            case R.id.PorkButton:
                openTypePorkCook();
                break;
            case R.id.Manual:
                openManualCook();
                break;
            case R.id.FishPicButton:
            case R.id.FishButton:
                openTypeFishCook();
        }
;

    }



    public void openJustSet() {
        Intent intent = new Intent(this, JustSet.class);
        startActivity(intent);
    }
    public void openTypeChickenCook() {
        Intent intent = new Intent(this, TypeChickenCook.class);
        startActivity(intent);
    }
    public void openTypeBeefCook() {
        Intent intent = new Intent(this, TypeBeefCook.class);
        startActivity(intent);
    }
    public void openTypePorkCook() {
        Intent intent = new Intent(this, TypePorkCook.class);
        startActivity(intent);
    }
    public void openManualCook() {
        Intent intent = new Intent(this, ManualCook.class);
        startActivity(intent);
    }
    public void openTypeFishCook() {
        Intent intent = new Intent(this, TypeFishCook.class);
        startActivity(intent);
    }
}