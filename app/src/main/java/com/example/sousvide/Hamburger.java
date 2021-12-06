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

public class Hamburger extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinHamburg;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int HamburgTemp, HamburgTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburger);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinHamburg = (Spinner) findViewById(R.id.spinHamburg);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);
        spinHamburg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Hamburg.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Hamburger.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Hamburger.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Hamburger.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Hamburger.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Hamburger.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Hamburger.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime6)));
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
                        { HamburgTemp = 10;
                            HamburgTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { HamburgTemp = 30;
                            HamburgTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {HamburgTemp = 50;
                            HamburgTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {HamburgTemp = 70;
                            HamburgTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {HamburgTemp = 90;
                            HamburgTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {HamburgTemp = 110;
                            HamburgTime = 120;}
                        break;

                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { HamburgTemp = 130;
                            HamburgTime = 140;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { HamburgTemp = 150;
                            HamburgTime = 160;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {HamburgTemp = 170;
                            HamburgTime = 180;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {HamburgTemp = 190;
                            HamburgTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {HamburgTemp = 210;
                            HamburgTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {HamburgTemp = 230;
                            HamburgTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { HamburgTemp = 250;
                            HamburgTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { HamburgTemp = 270;
                            HamburgTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {HamburgTemp = 290;
                            HamburgTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {HamburgTemp = 310;
                            HamburgTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {HamburgTemp = 330;
                            HamburgTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {HamburgTemp = 350;
                            HamburgTime = 360;}

                        break;
                    case "Medium Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { HamburgTemp = 370;
                            HamburgTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { HamburgTemp = 390;
                            HamburgTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {HamburgTemp = 410;
                            HamburgTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {HamburgTemp = 430;
                            HamburgTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {HamburgTemp = 450;
                            HamburgTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {HamburgTemp = 470;
                            HamburgTime = 480;}

                        break;

                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { HamburgTemp = 490;
                            HamburgTime = 500;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { HamburgTemp = 510;
                            HamburgTime = 520;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {HamburgTemp = 530;
                            HamburgTime = 540;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {HamburgTemp = 550;
                            HamburgTime = 560;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {HamburgTemp = 570;
                            HamburgTime = 580;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {HamburgTemp = 590;
                            HamburgTime = 600;}

                        break;




                }
                Toast.makeText(Hamburger.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + HamburgTemp + "\n Time: \t" + HamburgTime, Toast.LENGTH_LONG).show();

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

        /*spinHamburg = findViewById(R.id.spinHamburg);
        String[] HamThick = getResources().getStringArray(R.array.HamburgThick);
        //create array for thickness & pulls values from text file
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, HamThick);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinHamburg.setAdapter(adapter);

        spinTimeCook= findViewById(R.id.spinTimeCook);
        String[] HamTime = getResources().getStringArray(R.array.HamburgTime);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, HamTime);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTimeCook.setAdapter(adapter1);*/
