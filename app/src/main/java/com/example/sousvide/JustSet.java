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

public class JustSet extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinJustSet;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1, x;
    int JustSetTemp, JustSetTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_set);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinJustSet = (Spinner) findViewById(R.id.spinJustSet);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinJustSet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(TypeEggCook.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch (selectedClass) {
                    case "Runny":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum1)));

                        break;
                    case "Just Set":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum2)));
                        break;
                    case "Medium":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum3)));

                        break;
                    case "Soft Boiled":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum4)));
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
                        if (x.equals("JustSet")) {
                            JustSetTemp = 10;
                            JustSetTime = 20;
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 30;
                            JustSetTime = 40;
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 50;
                            JustSetTime = 60;
                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 70;
                            JustSetTime = 80;
                        }

                        break;

                    case "2":
                        if (x.equals("JustSet")) {
                            JustSetTemp = 130;
                            JustSetTime = 140;

                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 150;
                            JustSetTime = 160;

                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 170;
                            JustSetTime = 180;

                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 190;
                            JustSetTime = 200;
                        }

                        break;
                    case "3":
                        if (x.equals("JustSet")) {
                            JustSetTemp = 250;
                            JustSetTime = 260;
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 270;
                            JustSetTime = 280;
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 290;
                            JustSetTime = 300;
                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 310;
                            JustSetTime = 320;
                        }


                        break;
                    case "4":
                        if (x.equals("JustSet")) {
                            JustSetTemp = 370;
                            JustSetTime = 380;
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 390;
                            JustSetTime = 400;
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 410;
                            JustSetTime = 420;
                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 430;
                            JustSetTime = 440;
                        }

                        break;

                    case "5":
                        if (x.equals("Runny")) {
                            JustSetTemp = 490;
                            JustSetTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 510;
                            JustSetTime = 520;
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 530;
                            JustSetTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 550;
                            JustSetTime = 560;
                        }

                        break;
                    case "6":
                        if (x.equals("JustSet")) {
                            JustSetTemp = 490;
                            JustSetTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 510;
                            JustSetTime = 520;
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 530;
                            JustSetTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 550;
                            JustSetTime = 560;
                        }

                        break;


                }
                Toast.makeText(JustSet.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + JustSetTemp + "\n Time: \t" + JustSetTime, Toast.LENGTH_LONG).show();

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
