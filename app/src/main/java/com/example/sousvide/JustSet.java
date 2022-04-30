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

public class JustSet extends AppCompatActivity implements View.OnClickListener{
    private Spinner spinJustSet;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1, x,thick,done;
    int JustSetTemp, JustSetTime;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_set);

        Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinJustSet = (Spinner) findViewById(R.id.spinJustSet);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);

        spinJustSet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(TypeEggCook.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch (selectedClass) {
                    case "Runny":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum1)));

                        break;
                    case "Just Set":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum2)));
                        break;
                    case "Medium":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum3)));

                        break;
                    case "Soft Boiled":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(JustSet.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.EggNum4)));
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
                            JustSetTemp = 145;
                            JustSetTime = 20 * 60000;
                            done = "Runny";
                            thick = "1";
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 145;
                            JustSetTime = 45 * 60000;
                            done = "Just Set";
                            thick = "1";
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 145;
                            JustSetTime = 55 * 60000;
                            done = "Just Set";
                            thick = "1";
                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 145;
                            JustSetTime = 65 * 60000;
                            done = "Just Set";
                            thick = "1";
                        }

                        break;

                    case "2":

                        if (x.equals("Runny")) {
                            JustSetTemp = 145;
                            JustSetTime = 20 * 60000;
                            done = "Runny";
                            thick = "2";
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 150;
                            JustSetTime = 45 * 60000;
                            done = "Just Set";
                            thick = "2";

                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 150;
                            JustSetTime = 55 * 60000;
                            done = "Medium";
                            thick = "2";

                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 150;
                            JustSetTime = 65 * 60000;
                            done = "Soft Boiled";
                            thick = "2";
                        }

                        break;
                    case "3":
                        if (x.equals("Runny")) {
                            JustSetTemp = 145;
                            JustSetTime = 20 * 60000;
                            done = "Runny";
                            thick = "3";
                        }



                        if (x.equals("Just Set")) {
                            JustSetTemp = 155;
                            JustSetTime = 45 * 60000;
                            done = "Just Set";
                            thick = "3";
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 155;
                            JustSetTime = 55 * 60000;
                            done = "Medium";
                            thick = "3";

                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 155;
                            JustSetTime = 65 * 60000;
                            done = "Soft Boiled";
                            thick = "3";}


                        break;
                    case "4":

                        if (x.equals("Runny")) {
                            JustSetTemp = 145;
                            JustSetTime = 20 * 60000;
                            done = "Runny";
                            thick = "4";
                        }


                        if (x.equals("Just Set")) {
                            JustSetTemp = 160;
                            JustSetTime = 45 * 60000;
                            done = "Just Set";
                            thick = "4";
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 160;
                            JustSetTime = 55 * 60000;
                            done = "Medium";
                            thick = "4";}

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 160;
                            JustSetTime = 65 * 60000;
                            done = "Soft Boiled";
                            thick = "4";
                        }

                        break;

                    case "5":

                        if (x.equals("Runny")) {
                            JustSetTemp = 145;
                            JustSetTime = 20 * 60000;
                            done = "Runny";
                            thick = "5";
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 160;
                            JustSetTime = 45 * 60000;
                            done = "Just Set";
                            thick = "5";
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 160;
                            JustSetTime = 55 * 60000;
                            done = "Medium";
                            thick = "5";
                        }

                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 160;
                            JustSetTime = 65 * 60000;
                            done = "Soft Boiled";
                            thick = "5";}

                        break;

                    case "6":

                        if (x.equals("Runny")) {
                            JustSetTemp = 145;
                            JustSetTime = 20 * 60000;
                            done = "Runny";
                            thick = "6";
                        }

                        if (x.equals("Just Set")) {
                            JustSetTemp = 160;
                            JustSetTime = 45 * 60000;
                            done = "Just Set";
                            thick = "6";
                        }

                        if (x.equals("Medium")) {
                            JustSetTemp = 160;
                            JustSetTime = 55 * 60000;
                            done = "Medium";
                            thick = "6";
                        }


                        if (x.equals("Soft Boiled")) {
                            JustSetTemp = 160;
                            JustSetTime = 65 * 60000;
                            done = "Soft Boiled";
                            thick = "6";
                        }

                        break;


                }
                Toast.makeText(JustSet.this, "\n Class: \t " + booyah +
                        "\n Div: \t" + selectedDiv + "\n Temp : \t" + JustSetTemp + "\n Time: \t" + JustSetTime, Toast.LENGTH_LONG).show();

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

                Intent ChickBreastintent = new Intent(this, EggCookDisplay.class);
                //ChickBreastintent.putExtra("TEST",spinBreastbonetest);
                startActivity(ChickBreastintent);
                //break;
        }

        Intent example = new Intent(getApplicationContext(), EggCookDisplay.class);
        //ChickBreastBoneTemp = 137;
        // passing temp variable in F
        //ChickBreastBoneTime = 110;

        String doneVar = String.valueOf(done);
        String thickVar = String.valueOf(thick);
        String chickBreastTemp = String.valueOf(JustSetTemp);
        String chickBreastTime = String.valueOf(JustSetTime);

        example.putExtra("message", doneVar);
        example.putExtra("message2", thickVar);
        example.putExtra("message3", chickBreastTemp);
        example.putExtra("message4", chickBreastTime);

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




        ;


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference =firebaseDatabase.getReference("SendData");


        sendData =new

                SendData();
        // Integer testTemp = 20;
        //Integer testTime = 50;

        //private void addDatatoFirebase(int testTemp, int testTime) {
        // below 3 lines of code is used to set
        // data in our object class.
        sendData.getTime(JustSetTime);
        sendData.getTemp(JustSetTemp);


        // we are use add value event listener method
        // which is called with database reference.
        databaseReference.addValueEventListener(new

                                                        ValueEventListener() {
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
                                                                Toast.makeText(JustSet.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
                                                            }


    });}



}
