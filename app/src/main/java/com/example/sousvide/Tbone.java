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

public class Tbone extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinTbone;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x;
    int TboneTemp, TboneTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbone);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinTbone = (Spinner) findViewById(R.id.spinTbone);
        spinTimeCook= (Spinner) findViewById(R.id.spinTimeCook);

        spinTbone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tbone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tbone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tbone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tbone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tbone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(Tbone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.BeefPorkTime6)));
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
                        { TboneTemp = 10;
                            TboneTime = 20;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 30;
                            TboneTime = 40;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 50;
                            TboneTime = 60;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 70;
                            TboneTime = 80;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 90;
                            TboneTemp = 100;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 110;
                            TboneTime = 120;}
                        break;

                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 130;
                            TboneTime = 140;
                            }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 150;
                            TboneTime = 160;
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 170;
                            TboneTime = 180;
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 190;
                            TboneTime = 200;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 210;
                            TboneTime = 220;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 230;
                            TboneTime = 240;}

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 250;
                            TboneTime = 260;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 270;
                            TboneTime = 280;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 290;
                            TboneTime = 300;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 310;
                            TboneTime = 320;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 330;
                            TboneTime = 340;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 350;
                            TboneTime = 360;}

                        break;
                    case "Medium Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 370;
                            TboneTime = 380;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 390;
                            TboneTime = 400;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 410;
                            TboneTime = 420;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 430;
                            TboneTime = 440;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 450;
                            TboneTime = 460;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 470;
                            TboneTime = 480;}

                        break;

                    case "Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 490;
                            TboneTime = 500;
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 510;
                            TboneTime = 520;
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 530;
                            TboneTime = 540;
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 550;
                            TboneTime = 560;}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 570;
                            TboneTime = 580;}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 590;
                            TboneTime = 600;}

                        break;




                }
                Toast.makeText(Tbone.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + TboneTemp + "\n Time: \t" + TboneTime, Toast.LENGTH_LONG).show();

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


        /*spinTbone = findViewById(R.id.spinTbone);
        String[] TboneThick = getResources().getStringArray(R.array.TboneThick);
        //create array for breast thickness & pulls values from text file
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, TboneThick);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTbone.setAdapter(adapter);

        spinTimeCook= findViewById(R.id.spinTimeCook);
        String[] TBTime = getResources().getStringArray(R.array.TboneTime);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, TBTime);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinTimeCook.setAdapter(adapter1);*/
