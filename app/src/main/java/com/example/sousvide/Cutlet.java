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

public class Cutlet extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinCutlet;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int CutletTemp, CutletTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutlet);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinCutlet = (Spinner) findViewById(R.id.spinCutlet);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinCutlet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(Cutlet.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Cutlet.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Cutlet.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Cutlet.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Cutlet.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Cutlet.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Cutlet.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime6)));
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
                        { CutletTemp = 10;
                            CutletTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { CutletTemp = 30;
                            CutletTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {CutletTemp = 50;
                            CutletTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {CutletTemp = 70;
                            CutletTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {CutletTemp = 90;
                            CutletTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {CutletTemp = 110;
                            CutletTime = 120;}
                        break;

                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { CutletTemp = 130;
                            CutletTime = 140;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { CutletTemp = 150;
                            CutletTime = 160;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {CutletTemp = 170;
                            CutletTime = 180;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {CutletTemp = 190;
                            CutletTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {CutletTemp = 210;
                            CutletTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {CutletTemp = 230;
                            CutletTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { CutletTemp = 250;
                            CutletTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { CutletTemp = 270;
                            CutletTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {CutletTemp = 290;
                            CutletTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {CutletTemp = 310;
                            CutletTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {CutletTemp = 330;
                            CutletTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {CutletTemp = 350;
                            CutletTime = 360;}

                        break;
                    case "Medium Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { CutletTemp = 370;
                            CutletTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { CutletTemp = 390;
                            CutletTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {CutletTemp = 410;
                            CutletTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {CutletTemp = 430;
                            CutletTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {CutletTemp = 450;
                            CutletTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {CutletTemp = 470;
                            CutletTime = 480;}

                        break;

                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { CutletTemp = 490;
                            CutletTime = 500;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { CutletTemp = 510;
                            CutletTime = 520;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {CutletTemp = 530;
                            CutletTime = 540;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {CutletTemp = 550;
                            CutletTime = 560;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {CutletTemp = 570;
                            CutletTime = 580;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {CutletTemp = 590;
                            CutletTime = 600;}

                        break;




                }
                Toast.makeText(Cutlet.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + CutletTemp + "\n Time: \t" + CutletTime, Toast.LENGTH_LONG).show();

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


