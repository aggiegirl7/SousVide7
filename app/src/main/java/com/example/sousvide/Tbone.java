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

public class Tbone extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinTbone;
    private Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x,thick, done;
    int TboneTemp, TboneTime;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;


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
                        { TboneTemp = 130;                        // passing temp variable in F
                            TboneTime = 110 * 60000;//6600000;
                            //passing variable in minutes
                            done = "Rare";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch/ 13 mm";
                            //will pass string to show user "thickness" selection

                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        {  TboneTemp = 130;
                            TboneTime = 165 * 60000;
                            done = "Rare";
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 130;
                            TboneTime = 205 * 60000;
                            done = "Rare";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 130;
                            TboneTime = 270 * 60000;
                            done = "Rare";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 130;
                            TboneTemp = 340 * 60000;
                            done = "Rare";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 135;
                            TboneTime = 390 * 60000;
                            done = "Rare";
                            thick = "3.00 inch / 76 mm";}
                        break;

                    case "Medium Rare":
                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 140;
                            TboneTime = 110 * 60000;
                            done = "Medium Rare";
                            thick = ".50 inch / 13 mm";
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 140;
                            TboneTime = 165 * 60000;
                            done = "Medium Rare";
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 140;
                            TboneTime = 205 * 60000;
                            done = "Medium Rare";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 140;
                            TboneTime = 270 * 60000;
                            done = "Medium Rare";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 140;
                            TboneTime = 340 * 60000;
                            done = "Medium Rare";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 144;
                            TboneTime = 390 * 60000;
                            done = "Medium Rare";
                            thick = "3.00 inch / 76 mm";
                        }

                        break;
                    case "Medium":
                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 151;
                            TboneTime = 110 * 60000;
                            done = "Medium";
                            thick = ".50 inch / 13 mm";
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 151;
                            TboneTime = 165 * 60000;
                            done = "Medium";
                            thick = "1.00 inch / 25 mm";
                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 144;
                            TboneTime = 205 * 60000;
                            done = "Medium";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 144;
                            TboneTime = 270 * 60000;
                            done = "Medium";
                            thick = "2.00 inch / 51 mm";
                        }

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 144;
                            TboneTime = 340 * 60000;
                            done = "Medium";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 144;
                            TboneTime = 390 * 60000;
                            done = "Medium";
                            thick = "3.00 inch / 76 mm";
                        }

                        break;

                    case "Medium Well":
                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 155;
                            TboneTime = 110 * 60000;
                            done = "Well";
                            thick = ".50 inch / 13 mm";
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 155;
                            TboneTime = 165 * 60000;
                            done = "Well";
                            thick = "1.00 inch / 25 mm";

                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 155;
                            TboneTime = 205 * 60000;
                            done = "Well";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 155;
                            TboneTime = 270 * 60000;
                            done = "Well";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 155;
                            TboneTime = 340 * 60000;
                            done = "Well";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 155;
                            TboneTime = 390 * 60000;
                            done = "Well";
                            thick = "3.00 inch / 76 mm";}

                        break;

                    case "Well Done":

                        if (x.equals(".50 inch / 13 mm"))
                        { TboneTemp = 160;
                            TboneTime = 110 * 60000;
                            done = "Well Done";
                            thick = ".50 inch / 13 mm";
                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { TboneTemp = 160;
                            TboneTime = 165 * 60000;
                            done = "Well Done";
                            thick = "1.00 inch / 25 mm";

                        }

                        if (x.equals("1.50 inch / 38 mm"))
                        {TboneTemp = 160;
                            TboneTime = 205 * 60000;
                            done = "Well Done";
                            thick = "1.50 inch / 38 mm";
                        }

                        if (x.equals("2.00 inch / 51 mm"))
                        {TboneTemp = 160;
                            TboneTime = 270 * 60000;
                            done = "Well Done";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {TboneTemp = 160;
                            TboneTime = 340 * 60000;
                            done = "Well Done";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm"))
                        {TboneTemp = 160;
                            TboneTime = 390 * 60000;
                            done = "Well Done";
                            thick = "3.00 inch / 76 mm";}

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

        Intent example = new Intent(getApplicationContext(), DisplayPreset.class);
        //ChickBreastBoneTemp = 137;
        // passing temp variable in F
        //ChickBreastBoneTime = 110;

        String doneVar = String.valueOf(done);
        String thickVar = String.valueOf(thick);
        String chickBreastTemp = String.valueOf(TboneTemp);
        String chickBreastTime = String.valueOf(TboneTime);

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
        sendData.getTime(TboneTime);
        sendData.getTemp(TboneTemp);


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
                                                                Toast.makeText(Tbone.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
                                                            }


                                                        });


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
