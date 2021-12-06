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

public class GeneralFish extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinGeneralFish;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int GeneralFishTemp, GeneralFishTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_fish);


        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinGeneralFish = (Spinner) findViewById(R.id.spinGeneralFish);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinGeneralFish.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Tbone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(GeneralFish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(GeneralFish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(GeneralFish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(GeneralFish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(GeneralFish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(GeneralFish.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.FishTime6)));
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

                switch(selectedDiv)
                {
                    case "Very Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm"))
                        { GeneralFishTemp = 10;
                            GeneralFishTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { GeneralFishTemp = 30;
                            GeneralFishTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {GeneralFishTemp = 50;
                            GeneralFishTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {GeneralFishTemp = 70;
                            GeneralFishTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {GeneralFishTemp = 90;
                            GeneralFishTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {GeneralFishTemp = 110;
                            GeneralFishTime = 120;}
                        break;

                    case "Lightly Cooked":
                        if (x.equals(".50 inch / 13 mm"))
                        { GeneralFishTemp = 130;
                            GeneralFishTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { GeneralFishTemp = 150;
                            GeneralFishTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {GeneralFishTemp = 170;
                            GeneralFishTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {GeneralFishTemp = 190;
                            GeneralFishTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {GeneralFishTemp = 210;
                            GeneralFishTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {GeneralFishTemp = 230;
                            GeneralFishTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { GeneralFishTemp = 250;
                            GeneralFishTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { GeneralFishTemp = 270;
                            GeneralFishTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {GeneralFishTemp = 290;
                            GeneralFishTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {GeneralFishTemp = 310;
                            GeneralFishTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {GeneralFishTemp = 330;
                            GeneralFishTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {GeneralFishTemp = 350;
                            GeneralFishTime = 360;}

                        break;
                    case "Flaky and Firm":
                        if (x.equals(".50 inch / 13 mm"))
                        { GeneralFishTemp = 370;
                            GeneralFishTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { GeneralFishTemp = 390;
                            GeneralFishTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {GeneralFishTemp = 410;
                            GeneralFishTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {GeneralFishTemp = 430;
                            GeneralFishTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {GeneralFishTemp = 450;
                            GeneralFishTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {GeneralFishTemp = 470;
                            GeneralFishTime = 480;}

                        break;






                }
                Toast.makeText(GeneralFish.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + GeneralFishTemp + "\n Time: \t" + GeneralFishTime, Toast.LENGTH_LONG).show();

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