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

public class Runny extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinRunny;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1, x;
    int RunnyTemp, RunnyTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runny);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinRunny = (Spinner) findViewById(R.id.spinRunny);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinRunny.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(TypeEggCook.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch (selectedClass) {
                    case "Runny":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Runny.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum1)));

                        break;
                    case "Just Set":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Runny.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum2)));
                        break;
                    case "Medium":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Runny.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum3)));

                        break;
                    case "Soft Boiled":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Runny.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum4)));
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
                            RunnyTemp = 10;
                            RunnyTime = 20;
                        }

                        if (x.equals("Just Set")) {
                            RunnyTemp = 30;
                            RunnyTime = 40;
                        }

                        if (x.equals("Medium")) {
                            RunnyTemp = 50;
                            RunnyTime = 60;
                        }

                        if (x.equals("Soft Boiled")) {
                            RunnyTemp = 70;
                            RunnyTime = 80;
                        }

                        break;

                    case "2":
                        if (x.equals("Runny")) {
                            RunnyTemp = 130;
                            RunnyTime = 140;

                        }

                        if (x.equals("Just Set")) {
                            RunnyTemp = 150;
                            RunnyTime = 160;

                        }

                        if (x.equals("Medium")) {
                            RunnyTemp = 170;
                            RunnyTime = 180;

                        }

                        if (x.equals("Soft Boiled")) {
                            RunnyTemp = 190;
                            RunnyTime = 200;
                        }

                        break;
                    case "3":
                        if (x.equals("Runny")) {
                            RunnyTemp = 250;
                            RunnyTime = 260;
                        }

                        if (x.equals("Just Set")) {
                            RunnyTemp = 270;
                            RunnyTime = 280;
                        }

                        if (x.equals("Medium")) {
                            RunnyTemp = 290;
                            RunnyTime = 300;
                        }

                        if (x.equals("Soft Boiled")) {
                            RunnyTemp = 310;
                            RunnyTime = 320;
                        }


                        break;
                    case "4":
                        if (x.equals("Runny")) {
                            RunnyTemp = 370;
                            RunnyTime = 380;
                        }

                        if (x.equals("Just Set")) {
                            RunnyTemp = 390;
                            RunnyTime = 400;
                        }

                        if (x.equals("Medium")) {
                            RunnyTemp = 410;
                            RunnyTime = 420;
                        }

                        if (x.equals("Soft Boiled")) {
                            RunnyTemp = 430;
                            RunnyTime = 440;
                        }

                        break;

                    case "5":
                        if (x.equals("Runny")) {
                            RunnyTemp = 490;
                            RunnyTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            RunnyTemp = 510;
                            RunnyTime = 520;
                        }

                        if (x.equals("Medium")) {
                            RunnyTemp = 530;
                            RunnyTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            RunnyTemp = 550;
                            RunnyTime = 560;
                        }

                        break;
                    case "6":
                        if (x.equals("Runny")) {
                            RunnyTemp = 490;
                            RunnyTime = 500;
                        }

                        if (x.equals("Just Set")) {
                            RunnyTemp = 510;
                            RunnyTime = 520;
                        }

                        if (x.equals("Medium")) {
                            RunnyTemp = 530;
                            RunnyTime = 540;
                        }

                        if (x.equals("Soft Boiled")) {
                            RunnyTemp = 550;
                            RunnyTime = 560;
                        }

                        break;


                }
                Toast.makeText(Runny.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + RunnyTemp + "\n Time: \t" + RunnyTime, Toast.LENGTH_LONG).show();

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
