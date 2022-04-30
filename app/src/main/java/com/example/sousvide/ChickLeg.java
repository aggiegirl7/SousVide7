package com.example.sousvide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ChickLeg extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinChickLeg;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x,done,thick;
    int ChickLegTemp, ChickLegTime;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_leg);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinChickLeg = (Spinner) findViewById(R.id.spinChickLeg);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinChickLeg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickLeg.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
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
                    case "Lowest Time/ Juicy":
                        if (x.equals(".50 inch / 13 mm"))
                        {

                            ChickLegTemp = 140;                        // passing temp variable in F
                            ChickLegTime = 200 * 60000;//6600000;
                            //passing variable in minutes
                            done = "Lowest Time/ Juicy";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch/ 13 mm";
                            //will pass string to show user "thickness" selection

                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickLegTemp = 140;
                            ChickLegTime = 220*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickLegTemp = 140;
                            ChickLegTime = 240*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickLegTemp = 140;
                            ChickLegTime = 260*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickLegTemp = 140;
                            ChickLegTemp = 305*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickLegTemp = 140;
                            ChickLegTime = 325*60000;
                            done = "Lowest Time/ Juicy";
                            thick = "3.00 inch / 76 mm";}
                        break;

                    case "Medium Time/ Medium Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickLegTemp = 148;
                            ChickLegTime = 220*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = ".50 inch / 13 mm";

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickLegTemp = 148;
                            ChickLegTime = 240*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "1.00 inch / 25 mm";

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickLegTemp =148;
                            ChickLegTime = 260*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "1.50 inch / 38 mm";

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickLegTemp = 148;
                            ChickLegTime = 280*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickLegTemp = 148;
                            ChickLegTime = 300*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickLegTemp = 148;
                            ChickLegTime = 320*60000;
                            done = "Medium Time/ Medium Cook";
                            thick = "3.00 inch / 76 mm";
                        }

                        break;
                    case "Highest Time/ Thorough Cook":
                        if (x.equals(".50 inch / 13 mm")) {
                            ChickLegTemp = 156;
                            ChickLegTime = 240*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = ".50 inch / 13 mm";

                        }

                        if (x.equals("1.00 inch / 25 mm")) {
                            ChickLegTemp = 156;
                            ChickLegTime = 265*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "1.00 inch / 25 mm";

                        }

                        if (x.equals("1.50 inch / 38 mm")) {
                            ChickLegTemp = 156;
                            ChickLegTime = 285*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "1.50 inch / 38 mm";

                        }

                        if (x.equals("2.00 inch / 51 mm")) {
                            ChickLegTemp = 156;
                            ChickLegTime = 305*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm")) {
                            ChickLegTemp =156 ;
                            ChickLegTime = 325*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "2.50 inch / 63 mm";
                        }

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickLegTemp = 156;
                            ChickLegTime = 265*60000;
                            done = "Highest Time/ Thorough Cook";
                            thick = "3.00 inch / 76 mm";
                        }


                        break;


                }
                Toast.makeText(ChickLeg.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickLegTemp + "\n Time: \t" + ChickLegTime, Toast.LENGTH_LONG).show();

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

                Intent example = new Intent(getApplicationContext(),DisplayPreset.class);
                //ChickThighBoneTemp = 137;
                // passing temp variable in F
                //ChickThighBoneTime = 110;

                String doneVar = String.valueOf(done);
                String thickVar = String.valueOf(thick);
                String chickBreastTemp = String.valueOf(ChickLegTemp);
                String chickBreastTime = String.valueOf(ChickLegTime);

                example.putExtra("message",doneVar);
                example.putExtra("message2",thickVar);
                example.putExtra("message3",chickBreastTemp);
                example.putExtra("message4",chickBreastTime);

                startActivity(example);
                //notification();



                /*RequestBody formBody = new FormBody.Builder()
                        .add("ChickBreastBoneTemp", "350")
                        .add("ChickBreastBoneTime", "110")
                        .build();
//http://192.168.4.1/temperature
                Request request = new Request.Builder()
                        .url("http://192.168.4.1/temperature")
                        .post(formBody)
                        .build();


                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

                        if(response.isSuccessful()){
                            ResponseBody responseBody = response.body();
                            Log.i("bro", "posted! 23" );
                        }

                    }

                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        e.printStackTrace();
                        Log.i("bro", "nada 23");
                    }
                });*/








        };


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("SendData");


        sendData = new SendData();
        // Integer testTemp = 20;
        //Integer testTime = 50;

        //private void addDatatoFirebase(int testTemp, int testTime) {
        // below 3 lines of code is used to set
        // data in our object class.
        sendData.getTime(ChickLegTime);
        sendData.getTemp(ChickLegTemp);


        // we are use add value event listener method
        // which is called with database reference.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // inside the method of on Data change we are setting
                // our object class to our database reference.
                // data base reference will sends data to firebase.
                databaseReference.setValue(sendData);

                // after adding this data we are showing toast message.
                // Toast.makeText(MainActivity.this, "data added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // if the data is not added or it is cancelled then
                // we are displaying a failure toast message.
                Toast.makeText(ChickLeg.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });



    }}



