package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;

public class TypeBeefCook extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_beef_cook);

        ImageButton RibeyePic = findViewById(R.id.RibeyePic);
        Button RibeyeButton = (Button) findViewById(R.id.RibeyeButton);
        ImageButton tenderloinPic = findViewById(R.id.tenderloinPic);
        Button tenderloinButton = (Button) findViewById(R.id.tenderloinButton);
        ImageButton tbonePic = findViewById(R.id.tbonePic);
        Button tboneButton = (Button) findViewById(R.id.tboneButton);
        ImageButton cutletPic = findViewById(R.id.cutletPic);
        Button cutletButton = (Button) findViewById(R.id.cutletButton);
        ImageButton sirloinPic = findViewById(R.id.sirloinPic);
        Button sirloinButton = (Button) findViewById(R.id.sirloinButton);
        ImageButton hamburgerPic = findViewById(R.id.hamburgerPic);
        Button hamburgerButton = (Button) findViewById(R.id.hamburgerButton);

        RibeyePic.setOnClickListener(this);
        RibeyeButton.setOnClickListener(this);
        tenderloinPic.setOnClickListener(this);
        tenderloinButton.setOnClickListener(this);
        tbonePic.setOnClickListener(this);
        tboneButton.setOnClickListener(this);
        cutletPic.setOnClickListener(this);
        cutletButton.setOnClickListener(this);
        sirloinPic.setOnClickListener(this);
        sirloinButton.setOnClickListener(this);
        hamburgerPic.setOnClickListener(this);
        hamburgerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.RibeyePic:
            case R.id.RibeyeButton:
                openRibeye();
                break;
            case R.id.tenderloinPic:
            case R.id.tenderloinButton:
                openTenderloin();
                break;
            case R.id.tbonePic:
            case R.id.tboneButton:
                openTbone();
                break;
            case R.id.cutletPic:
            case R.id.cutletButton:
                openCutlet();
                break;
            case R.id.sirloinPic:
            case R.id.sirloinButton:
                openSirloin();
                break;
            case R.id.hamburgerPic:
            case R.id.hamburgerButton:
                openHamburger();
                break;

    }

}

    public void openRibeye() {
        Intent intent = new Intent(this, Ribeye.class);
        startActivity(intent);
    }
    public void openTenderloin() {
        Intent intent = new Intent(this, Tenderloin.class);
        startActivity(intent);
    }
    public void openTbone() {
        Intent intent = new Intent(this, Tbone.class);
        startActivity(intent);
    }
    public void openCutlet() {
        Intent intent = new Intent(this, Cutlet.class);
        startActivity(intent);
    }
    public void openSirloin() {
        Intent intent = new Intent(this, Sirloin.class);
        startActivity(intent);
    }
    public void openHamburger() {
        Intent intent = new Intent(this, Hamburger.class);
        startActivity(intent);
    }
}