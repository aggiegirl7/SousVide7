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

public class Medium extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinMedium;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1, x;
    int MediumTemp, MediumTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinMedium = (Spinner) findViewById(R.id.spinMedium);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinMedium.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(TypeEggCook.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch (selectedClass) {
                    case "Runny":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Medium.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum1)));

                        break;
                    case "Just Set":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Medium.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum2)));
                        break;
                    case "Medium":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Medium.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum3)));

                        break;
                    case "Soft Boiled":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Medium.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum4)));
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
                        if (x.equals("Medium")) {
                            MediumTemp = 10;
                            MediumTime = 20;
                        }

                        if (x.equals("Just Set")) {
                            MediumTemp = 30;
                            MediumTime = 40;
                        }

                        if (x.equals("Medium")) {
                            MediumTemp = 50;
                            MediumTime = 60;
                        }

                        if (x.equals("Soft Boiled")) {
                            MediumTemp = 70;
                            MediumTime = 80;
                        }

                        break;

                    case "2":
                        if (x.equals("Medium")) {
                            MediumTemp = 130;
                            MediumTime = 140;

                        }

                        if (x.equals("Just Set")) {
                            MediumTemp = 150;
                            MediumTime = 160;

                        }

                        if (x.equals("Medium")) {
                            MediumTemp = 170;
                            MediumTime = 180;

                        }

                        if (x.equals("Soft Boiled")) {
                            MediumTemp = 190;
                            MediumTime = 200;
                        }

                        break;
                    case "3":
                        if (x.equals("Medium")) {
                            MediumTemp = 250;
                            MediumTime = 260;
                        }

                        if (x.equals("Just Set")) {
                            MediumTemp = 270;
                            MediumTime = 280;
                        }

                        if (x.equals("Medium")) {
                            MediumTemp = 290;
                            MediumTime = 300;
                        }

                        if (x.equals("Soft Boiled")) {
                            MediumTemp = 310;
                            MediumTime = 320;
                        }


                        break;
                    case "4":
                        if (x.equals("Medium")) {
                            MediumTemp = 370;
                            MediumTime = 380;
                        }

                        if (x.equals("Just Set")) {
                            MediumTemp = 390;
                            MediumTime = 400;
                        }

                        if (x.equals("Medium")) {
                            MediumTemp = 410;
                            MediumTime = 420;
                        }

                        if (x.equals("Soft Boiled")) {
                            MediumTemp = 430;
                            MediumTime = 440;
                        }

                        break;

                    case "5":
                        if (x.equals("Runny")) {
                            MediumTemp = 490;
                            MediumTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            MediumTemp = 510;
                            MediumTime = 520;
                        }

                        if (x.equals("Medium")) {
                            MediumTemp = 530;
                            MediumTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            MediumTemp = 550;
                            MediumTime = 560;
                        }

                        break;
                    case "6":
                        if (x.equals("Medium")) {
                            MediumTemp = 490;
                            MediumTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            MediumTemp = 510;
                            MediumTime = 520;
                        }

                        if (x.equals("Medium")) {
                            MediumTemp = 530;
                            MediumTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            MediumTemp = 550;
                            MediumTime = 560;
                        }

                        break;


                }
                Toast.makeText(Medium.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + MediumTemp + "\n Time: \t" + MediumTime, Toast.LENGTH_LONG).show();

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
