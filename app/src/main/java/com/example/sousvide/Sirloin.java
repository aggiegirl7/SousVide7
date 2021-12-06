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

public class Sirloin extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinSirloin;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int SirloinTemp, SirloinTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirloin);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinSirloin = (Spinner) findViewById(R.id.spinSirloin);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);
        //String[] SirThick = getResources().getStringArray(R.array.SirloinThick);
        //create array for breast thickness & pulls values from text file
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, SirThick);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinSirloin.setAdapter(adapter);

        //String[] SirTime = getResources().getStringArray(R.array.ChickBreastBonelessTime);
        //ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, SirTime);
        //adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinTimeCook.setAdapter(adapter1);

        spinSirloin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Sirloin.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Sirloin.this,
                                android.R.layout.simple_spinner_dropdown_item,getResources()
                                .getStringArray(R.array.BeefPorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Sirloin.this,
                                android.R.layout.simple_spinner_dropdown_item,getResources()
                                .getStringArray(R.array.BeefPorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Sirloin.this,
                                android.R.layout.simple_spinner_dropdown_item,getResources()
                                .getStringArray(R.array.BeefPorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Sirloin.this,
                                android.R.layout.simple_spinner_dropdown_item,getResources()
                                .getStringArray(R.array.BeefPorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Sirloin.this,
                                android.R.layout.simple_spinner_dropdown_item,getResources()
                                .getStringArray(R.array.BeefPorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Sirloin.this,
                                android.R.layout.simple_spinner_dropdown_item,getResources()
                                .getStringArray(R.array.BeefPorkTime6)));
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
                    case "Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { SirloinTemp = 10;
                            SirloinTime = 20;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { SirloinTemp = 30;
                            SirloinTime = 40;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {SirloinTemp = 50;
                            SirloinTime = 60;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {SirloinTemp = 70;
                            SirloinTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SirloinTemp = 90;
                            SirloinTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SirloinTemp = 110;
                            SirloinTime = 120;}
                        break;

                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { SirloinTemp = 130;
                            SirloinTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { SirloinTemp = 150;
                            SirloinTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {SirloinTemp = 170;
                            SirloinTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {SirloinTemp = 190;
                            SirloinTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SirloinTemp = 210;
                            SirloinTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SirloinTemp = 230;
                            SirloinTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { SirloinTemp = 250;
                            SirloinTime = 260;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { SirloinTemp = 270;
                            SirloinTime = 280;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {SirloinTemp = 290;
                            SirloinTime = 300;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {SirloinTemp = 310;
                            SirloinTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SirloinTemp = 330;
                            SirloinTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SirloinTemp = 350;
                            SirloinTime = 360;}

                        break;
                    case "Medium Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { SirloinTemp = 370;
                            SirloinTime = 380;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { SirloinTemp = 390;
                            SirloinTime = 400;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {SirloinTemp = 410;
                            SirloinTime = 420;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {SirloinTemp = 430;
                            SirloinTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SirloinTemp = 450;
                            SirloinTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SirloinTemp = 470;
                            SirloinTime = 480;}

                        break;

                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { SirloinTemp = 490;
                            SirloinTime = 500;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { SirloinTemp = 510;
                            SirloinTime = 520;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {SirloinTemp = 530;
                            SirloinTime = 540;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {SirloinTemp = 550;
                            SirloinTime = 560;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {SirloinTemp = 570;
                            SirloinTime = 580;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {SirloinTemp = 590;
                            SirloinTime = 600;}

                        break;




                }
                Toast.makeText(Sirloin.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + SirloinTemp + "\n Time: \t" + SirloinTime, Toast.LENGTH_LONG).show();

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


