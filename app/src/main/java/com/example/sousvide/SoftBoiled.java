package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SoftBoiled extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinSoftBoiled;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1, x;
    int SoftBoiledTemp, SoftBoiledTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft_boiled);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinSoftBoiled = (Spinner) findViewById(R.id.spinSoftBoiled);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinSoftBoiled.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(TypeEggCook.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch (selectedClass) {
                    case "Runny":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(SoftBoiled.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum1)));

                        break;
                    case "Just Set":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(SoftBoiled.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum2)));
                        break;
                    case "Medium":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(SoftBoiled.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum3)));

                        break;
                    case "Soft Boiled":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(SoftBoiled.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum4)));
                        break;
                }
                spinTimeCook.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinTimeCook.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedDiv = parent.getItemAtPosition(position).toString();

                switch (selectedDiv) {
                    case "1":
                        if (x.equals("SoftBoiled")) {
                            SoftBoiledTemp = 10;
                            SoftBoiledTime = 20;
                        }

                        if (x.equals("Just Set")) {
                            SoftBoiledTemp = 30;
                            SoftBoiledTime = 40;
                        }

                        if (x.equals("Medium")) {
                            SoftBoiledTemp = 50;
                            SoftBoiledTime = 60;
                        }

                        if (x.equals("Soft Boiled")) {
                            SoftBoiledTemp = 70;
                            SoftBoiledTime = 80;
                        }

                        break;

                    case "2":
                        if (x.equals("SoftBoiled")) {
                            SoftBoiledTemp = 130;
                            SoftBoiledTime = 140;

                        }

                        if (x.equals("Just Set")) {
                            SoftBoiledTemp = 150;
                            SoftBoiledTime = 160;

                        }

                        if (x.equals("Medium")) {
                            SoftBoiledTemp = 170;
                            SoftBoiledTime = 180;

                        }

                        if (x.equals("Soft Boiled")) {
                            SoftBoiledTemp = 190;
                            SoftBoiledTime = 200;
                        }

                        break;
                    case "3":
                        if (x.equals("SoftBoiled")) {
                            SoftBoiledTemp = 250;
                            SoftBoiledTime = 260;
                        }

                        if (x.equals("Just Set")) {
                            SoftBoiledTemp = 270;
                            SoftBoiledTime = 280;
                        }

                        if (x.equals("Medium")) {
                            SoftBoiledTemp = 290;
                            SoftBoiledTime = 300;
                        }

                        if (x.equals("Soft Boiled")) {
                            SoftBoiledTemp = 310;
                            SoftBoiledTime = 320;
                        }


                        break;
                    case "4":
                        if (x.equals("SoftBoiled")) {
                            SoftBoiledTemp = 370;
                            SoftBoiledTime = 380;
                        }

                        if (x.equals("Just Set")) {
                            SoftBoiledTemp = 390;
                            SoftBoiledTime = 400;
                        }

                        if (x.equals("Medium")) {
                            SoftBoiledTemp = 410;
                            SoftBoiledTime = 420;
                        }

                        if (x.equals("Soft Boiled")) {
                            SoftBoiledTemp = 430;
                            SoftBoiledTime = 440;
                        }

                        break;

                    case "5":
                        if (x.equals("Runny")) {
                            SoftBoiledTemp = 490;
                            SoftBoiledTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            SoftBoiledTemp = 510;
                            SoftBoiledTime = 520;
                        }

                        if (x.equals("Medium")) {
                            SoftBoiledTemp = 530;
                            SoftBoiledTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            SoftBoiledTemp = 550;
                            SoftBoiledTime = 560;
                        }

                        break;
                    case "6":
                        if (x.equals("SoftBoiled")) {
                            SoftBoiledTemp = 490;
                            SoftBoiledTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            SoftBoiledTemp = 510;
                            SoftBoiledTime = 520;
                        }

                        if (x.equals("Medium")) {
                            SoftBoiledTemp = 530;
                            SoftBoiledTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            SoftBoiledTemp = 550;
                            SoftBoiledTime = 560;
                        }

                        break;


                }
                Toast.makeText(SoftBoiled.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + SoftBoiledTemp + "\n Time: \t" + SoftBoiledTime, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });










        //spinTimeCook = findViewById(R.id.spinTimeCook);
        //String[] ChBrBoneTime = getResources().getStringArray(R.array.BreastBoneTime);
        //creates array for breast time cook & pulls values from breastbonetime txt file
        //ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBoneTime);
        //adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinTimeCook.setAdapter(adapter1);
    }


    //String example = spinBreastBone.getSelectedItem().toString();

    //public class MySpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

    //public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
    //String selected = parent.getItemAtPosition(pos).toString();


    //public void onNothingSelected(AdapterView parent) {
    // Do nothing.


    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CookDisplaypage:

                Intent ChickBreastintent = new Intent(this, DisplayCook.class);
                //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                startActivity(ChickBreastintent);
                //break;
        }


    }



}
