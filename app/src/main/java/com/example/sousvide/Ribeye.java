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

public class Ribeye extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinRibeye;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int RibeyeTemp, RibeyeTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ribeye);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinRibeye = (Spinner) findViewById(R.id.spinRibeye);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinRibeye.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Ribeye.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Ribeye.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Ribeye.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Ribeye.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Ribeye.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Ribeye.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Ribeye.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime6)));
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
                        { RibeyeTemp = 10;
                            RibeyeTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { RibeyeTemp = 30;
                            RibeyeTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {RibeyeTemp = 50;
                            RibeyeTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {RibeyeTemp = 70;
                            RibeyeTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {RibeyeTemp = 90;
                            RibeyeTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {RibeyeTemp = 110;
                            RibeyeTime = 120;}
                        break;

                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { RibeyeTemp = 130;
                            RibeyeTime = 140;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { RibeyeTemp = 150;
                            RibeyeTime = 160;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {RibeyeTemp = 170;
                            RibeyeTime = 180;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {RibeyeTemp = 190;
                            RibeyeTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {RibeyeTemp = 210;
                            RibeyeTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {RibeyeTemp = 230;
                            RibeyeTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { RibeyeTemp = 250;
                            RibeyeTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { RibeyeTemp = 270;
                            RibeyeTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {RibeyeTemp = 290;
                            RibeyeTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {RibeyeTemp = 310;
                            RibeyeTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {RibeyeTemp = 330;
                            RibeyeTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {RibeyeTemp = 350;
                            RibeyeTime = 360;}

                        break;
                    case "Medium Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { RibeyeTemp = 370;
                            RibeyeTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { RibeyeTemp = 390;
                            RibeyeTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {RibeyeTemp = 410;
                            RibeyeTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {RibeyeTemp = 430;
                            RibeyeTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {RibeyeTemp = 450;
                            RibeyeTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {RibeyeTemp = 470;
                            RibeyeTime = 480;}

                        break;

                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { RibeyeTemp = 490;
                            RibeyeTime = 500;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { RibeyeTemp = 510;
                            RibeyeTime = 520;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {RibeyeTemp = 530;
                            RibeyeTime = 540;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {RibeyeTemp = 550;
                            RibeyeTime = 560;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {RibeyeTemp = 570;
                            RibeyeTime = 580;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {RibeyeTemp = 590;
                            RibeyeTime = 600;}

                        break;




                }
                Toast.makeText(Ribeye.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + RibeyeTemp + "\n Time: \t" + RibeyeTime, Toast.LENGTH_LONG).show();

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




        /*spinRibeye = findViewById(R.id.spinRibeye);
        String[] REThick = getResources().getStringArray(R.array.RibeyeThick);
        //create array for breast thickness & pulls values from text file
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, REThick);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinRibeye.setAdapter(adapter);

        spinTimeCook= findViewById(R.id.spinTimeCook);
        String[] RETime = getResources().getStringArray(R.array.RibeyeTime);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, RETime);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTimeCook.setAdapter(adapter1);*/
