package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.Button;

public class TypeChickenCook extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_chicken_cook);

        ImageButton BoneInBreastPic = findViewById(R.id.BoneInBreastPic);
        Button BoneInBreastButton = (Button) findViewById(R.id.BoneInBreastButton);
        ImageButton BonelessBreastPic = findViewById(R.id.BonelessBreastPic);
        Button BonelessBreastButton = (Button) findViewById(R.id.BonelessBreastButton);
        ImageButton BoneInThighPic = findViewById(R.id.BoneInThighPic);
        Button BoneInThighButton = (Button) findViewById(R.id.BoneInThighButton);
        ImageButton BonelessThighPic = findViewById(R.id.BonelessThighPic);
        Button BonelessThighButton = (Button) findViewById(R.id.BonelessThighButton);
        ImageButton ChickenLegPic = findViewById(R.id.ChickenLegPic);
        Button ChickenLegButton = (Button) findViewById(R.id.ChickenLegButton);
        ImageButton DuckBreastPic = findViewById(R.id.DuckBreastPic);
        Button DuckBreastButton = (Button) findViewById(R.id.DuckBreastButton);

        BoneInBreastPic.setOnClickListener(this);
        BoneInBreastButton.setOnClickListener(this);
        BonelessBreastPic.setOnClickListener(this);
        BonelessBreastButton.setOnClickListener(this);
        BoneInThighPic.setOnClickListener(this);
        BoneInThighButton.setOnClickListener(this);
        BonelessThighPic.setOnClickListener(this);
        BonelessThighButton.setOnClickListener(this);
        ChickenLegPic.setOnClickListener(this);
        ChickenLegButton.setOnClickListener(this);
        DuckBreastPic.setOnClickListener(this);
        DuckBreastButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BoneInBreastPic:
            case R.id.BoneInBreastButton:
                openChickBreastBone();
                break;
            case R.id.BonelessBreastPic:
            case R.id.BonelessBreastButton:
                openChickBreastBoneless();
                break;
            case R.id.BoneInThighPic:
            case R.id.BoneInThighButton:
                openChickThighBone();
                break;
            case R.id.BonelessThighPic:
            case R.id.BonelessThighButton:
                openChickThighBoneless();
                break;
            case R.id.ChickenLegPic:
            case R.id.ChickenLegButton:
                openChickLeg();
                break;
            case R.id.DuckBreastPic:
            case R.id.DuckBreastButton:
                openDuckBreast();
                break;
        }
        ;

    }

    public void openChickBreastBone() {
        Intent intent = new Intent(this, ChickBreastBone.class);
        startActivity(intent);
    }
    public void openChickBreastBoneless() {
        Intent intent = new Intent(this, ChickBreastBoneless.class);
        startActivity(intent);
    }
    public void openChickThighBone(){
        Intent intent = new Intent(this, ChickThighBone.class);
        startActivity(intent);
    }
    public void openChickThighBoneless() {
        Intent intent = new Intent(this, ChickThighBoneless.class);
        startActivity(intent);
    }
    public void openChickLeg() {
        Intent intent = new Intent(this, ChickLeg.class);
        startActivity(intent);
    }
    public void openDuckBreast() {
        Intent intent = new Intent(this, DuckBreast.class);
        startActivity(intent);
    }
}