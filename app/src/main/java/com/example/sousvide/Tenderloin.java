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

public class Tenderloin extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinTenderloin;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int TenderloinTemp, TenderloinTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenderloin);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinTenderloin = (Spinner) findViewById(R.id.spinTenderloin);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinTenderloin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Tenderloin.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tenderloin.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime6)));
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
                        { TenderloinTemp = 10;
                            TenderloinTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TenderloinTemp = 30;
                            TenderloinTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TenderloinTemp = 50;
                            TenderloinTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TenderloinTemp = 70;
                            TenderloinTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TenderloinTemp = 90;
                            TenderloinTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TenderloinTemp = 110;
                            TenderloinTime = 120;}
                        break;

                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { TenderloinTemp = 130;
                            TenderloinTime = 140;
                            booyah = "ow ow med rare";}

                        if (x.equals("1.00 inch / 25 mm"))
                        { TenderloinTemp = 150;
                            TenderloinTime = 160;
                            booyah = "bow chicka med rare";}

                        if (x.equals("1.50 inch / 38 mm"))
                        {TenderloinTemp = 170;
                            TenderloinTime = 180;
                            booyah = "u got this med rare";}

                        if (x.equals("2.00 inch / 51 mm"))
                        {TenderloinTemp = 190;
                            TenderloinTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TenderloinTemp = 210;
                            TenderloinTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TenderloinTemp = 230;
                            TenderloinTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { TenderloinTemp = 250;
                            TenderloinTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TenderloinTemp = 270;
                            TenderloinTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TenderloinTemp = 290;
                            TenderloinTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TenderloinTemp = 310;
                            TenderloinTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TenderloinTemp = 330;
                            TenderloinTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TenderloinTemp = 350;
                            TenderloinTime = 360;}

                        break;
                    case "Medium Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { TenderloinTemp = 370;
                            TenderloinTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TenderloinTemp = 390;
                            TenderloinTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TenderloinTemp = 410;
                            TenderloinTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TenderloinTemp = 430;
                            TenderloinTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TenderloinTemp = 450;
                            TenderloinTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TenderloinTemp = 470;
                            TenderloinTime = 480;}

                        break;

                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { TenderloinTemp = 490;
                            TenderloinTime = 500;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TenderloinTemp = 510;
                            TenderloinTime = 520;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TenderloinTemp = 530;
                            TenderloinTime = 540;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TenderloinTemp = 550;
                            TenderloinTime = 560;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TenderloinTemp = 570;
                            TenderloinTime = 580;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TenderloinTemp = 590;
                            TenderloinTime = 600;}

                        break;




                }
                Toast.makeText(Tenderloin.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + TenderloinTemp + "\n Time: \t" + TenderloinTime, Toast.LENGTH_LONG).show();

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

        /*spinTenderloin = findViewById(R.id.spinTenderloin);
        String[] TenderThick = getResources().getStringArray(R.array.TenderloinThick);
        //create array for breast thickness & pulls values from text file
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, TenderThick);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTenderloin.setAdapter(adapter);

        spinTimeCook= findViewById(R.id.spinTimeCook);
        String[] TenderTime = getResources().getStringArray(R.array.TenderloinTime);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, TenderTime);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTimeCook.setAdapter(adapter1);*/
