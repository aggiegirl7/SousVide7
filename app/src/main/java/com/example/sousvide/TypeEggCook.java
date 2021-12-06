package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class TypeEggCook extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinEgg;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1, x;
    int EggTemp, EggTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_egg_cook);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        spinEgg = (Spinner) findViewById(R.id.spinEgg);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinEgg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(TypeEggCook.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch (selectedClass) {
                    case "Runny":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(TypeEggCook.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum1)));

                        break;
                    case "Just Set":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(TypeEggCook.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum2)));
                        break;
                    case "Medium":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(TypeEggCook.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum3)));

                        break;
                    case "Soft Boiled":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(TypeEggCook.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum4)));
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
                        if (x.equals("Runny")) {
                            EggTemp = 10;
                            EggTime = 20;
                        }

                        if (x.equals("Just Set")) {
                            EggTemp = 30;
                            EggTime = 40;
                        }

                        if (x.equals("Medium")) {
                            EggTemp = 50;
                            EggTime = 60;
                        }

                        if (x.equals("Soft Boiled")) {
                            EggTemp = 70;
                            EggTime = 80;
                        }

                        break;

                    case "2":
                        if (x.equals("Runny")) {
                            EggTemp = 130;
                            EggTime = 140;

                        }

                        if (x.equals("Just Set")) {
                            EggTemp = 150;
                            EggTime = 160;

                        }

                        if (x.equals("Medium")) {
                            EggTemp = 170;
                            EggTime = 180;

                        }

                        if (x.equals("Soft Boiled")) {
                            EggTemp = 190;
                            EggTime = 200;
                        }

                        break;
                    case "3":
                        if (x.equals("Runny")) {
                            EggTemp = 250;
                            EggTime = 260;
                        }

                        if (x.equals("Just Set")) {
                            EggTemp = 270;
                            EggTime = 280;
                        }

                        if (x.equals("Medium")) {
                            EggTemp = 290;
                            EggTime = 300;
                        }

                        if (x.equals("Soft Boiled")) {
                            EggTemp = 310;
                            EggTime = 320;
                        }


                        break;
                    case "4":
                        if (x.equals("Runny")) {
                            EggTemp = 370;
                            EggTime = 380;
                        }

                        if (x.equals("Just Set")) {
                            EggTemp = 390;
                            EggTime = 400;
                        }

                        if (x.equals("Medium")) {
                            EggTemp = 410;
                            EggTime = 420;
                        }

                        if (x.equals("Soft Boiled")) {
                            EggTemp = 430;
                            EggTime = 440;
                        }

                        break;

                    case "5":
                        if (x.equals("Runny")) {
                            EggTemp = 490;
                            EggTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            EggTemp = 510;
                            EggTime = 520;
                        }

                        if (x.equals("Medium")) {
                            EggTemp = 530;
                            EggTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            EggTemp = 550;
                            EggTime = 560;
                        }

                        break;
                    case "6":
                        if (x.equals("Runny")) {
                            EggTemp = 490;
                            EggTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            EggTemp = 510;
                            EggTime = 520;
                        }

                        if (x.equals("Medium")) {
                            EggTemp = 530;
                            EggTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            EggTemp = 550;
                            EggTime = 560;
                        }

                        break;


                }
                Toast.makeText(TypeEggCook.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + EggTemp + "\n Time: \t" + EggTime, Toast.LENGTH_LONG).show();

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
            case R.id.button2:

                Intent ChickBreastintent = new Intent(this, DisplayCook.class);
                //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                startActivity(ChickBreastintent);
                break;
        }


    }



}


