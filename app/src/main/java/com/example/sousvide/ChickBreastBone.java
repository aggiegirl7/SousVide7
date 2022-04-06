package com.example.sousvide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.ktx.Firebase;

import java.io.IOException;
import java.lang.reflect.Array;
import java.text.Normalizer;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ChickBreastBone extends AppCompatActivity implements View.OnClickListener {
    Spinner spinBreastBone;
    Spinner spinTimeCook;
    String selectedDiv, selectedClass, booyah, booyah1,x, done, thick;
    int ChickBreastBoneTemp, ChickBreastBoneTime;
    private final OkHttpClient client = new OkHttpClient();
    //private String strPOST_URL = "http://192.168.4.1/post"; //POST

    //DATABASE
   FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;

    /////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_breast_bone);
        AndroidNetworking.initialize(getApplicationContext());

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("SendData");






            Button CookDisplaypage = findViewById(R.id.CookDisplaypage);
        CookDisplaypage.setOnClickListener(this);

        spinBreastBone = (Spinner) findViewById(R.id.spinBreastBone);
        spinTimeCook = (Spinner) findViewById(R.id.spinTimeCook);
        //String[] ChBrBoneThick = getResources().getStringArray(R.array.BreastBoneThick);
        //create array for breast thickness & pulls values from text file
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ChBrBoneThick);
       // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinBreastBone.setAdapter(adapter);
        spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        //spinBreastBone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedClass = parent.getItemAtPosition(position).toString();
                //Toast.makeText(ChickBreastBone.this, "\n Class: \t " + selectedClass, Toast.LENGTH_LONG).show();
                booyah = selectedClass;
                x = selectedClass;
                switch(selectedClass)
                {
                    case ".50 inch / 13 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime1)));

                        break;
                    case "1.00 inch / 25 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime2)));
                        break;
                    case "1.50 inch / 38 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime3)));

                        break;
                    case "2.00 inch / 51 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime4)));
                        break;

                    case "2.50 inch / 63 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime5)));

                        break;
                    case "3.00 inch / 76 mm":
                        spinTimeCook.setAdapter(new ArrayAdapter<String>(ChickBreastBone.this,android.R.layout.simple_spinner_dropdown_item,getResources().getStringArray(R.array.ChickenTime6)));
                        break;
                }

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
                            ChickBreastBoneTemp = 137;
                        // passing temp variable in F
                            ChickBreastBoneTime = 110;
                            //passing variable in minutes
                            done = "Lowest Time/ Juicy";
                            //will pass string to show user "doneness" selection
                            thick = ".50 inch/ 13 mm";
                            //will pass string to show user "thickness" selection

                        }

                        if (x.equals("1.00 inch / 25 mm"))
                        { ChickBreastBoneTemp = 137;
                            ChickBreastBoneTime = 135;
                            done = "Lowest Time/ Juicy";
                            thick = "1.00 inch / 25 mm";
                            }

                        if (x.equals("1.50 inch / 38 mm"))
                        {ChickBreastBoneTemp = 50;
                            ChickBreastBoneTime = 60;
                            done = "Lowest Time/ Juicy";
                            thick = "1.50 inch / 38 mm";
                            }

                        if (x.equals("2.00 inch / 51 mm"))
                        {ChickBreastBoneTemp = 70;
                            ChickBreastBoneTime = 80;
                            done = "Lowest Time/ Juicy";
                            thick = "2.00 inch / 51 mm";}

                        if (x.equals("2.50 inch / 63 mm"))
                        {ChickBreastBoneTemp = 90;
                            ChickBreastBoneTemp = 100;
                            done = "Lowest Time/ Juicy";
                            thick = "2.50 inch / 63 mm";}

                        if (x.equals("3.00 inch / 76 mm")) {
                            ChickBreastBoneTemp = 110;
                            ChickBreastBoneTime = 120;
                            done = "Lowest Time/ Juicy";
                            thick = "3.00 inch / 76 mm";}
                            break;

                        case "Medium Time/ Medium Cook":
                            if (x.equals(".50 inch / 13 mm")) {
                                ChickBreastBoneTemp = 130;
                                    ChickBreastBoneTime = 140;
                                done = "Medium Time/ Medium Cook";
                                thick = ".50 inch / 13 mm";

                                }

                                if (x.equals("1.00 inch / 25 mm")) {
                                    ChickBreastBoneTemp = 150;
                                    ChickBreastBoneTime = 160;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "1.00 inch / 25 mm";

                                }

                                if (x.equals("1.50 inch / 38 mm")) {
                                    ChickBreastBoneTemp =170;
                                    ChickBreastBoneTime = 180;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "1.50 inch / 38 mm";

                                }

                                if (x.equals("2.00 inch / 51 mm")) {
                                    ChickBreastBoneTemp = 190;
                                    ChickBreastBoneTime = 200;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "2.00 inch / 51 mm";
                                }

                                if (x.equals("2.50 inch / 63 mm")) {
                                    ChickBreastBoneTemp = 210;
                                    ChickBreastBoneTime = 220;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "2.50 inch / 63 mm";
                                }

                                if (x.equals("3.00 inch / 76 mm")) {
                                    ChickBreastBoneTemp = 230;
                                    ChickBreastBoneTime = 240;
                                    done = "Medium Time/ Medium Cook";
                                    thick = "3.00 inch / 76 mm";
                                }

                                break;
                            case "Highest Time/ Thorough Cook":
                                if (x.equals(".50 inch / 13 mm")) {
                                    ChickBreastBoneTemp = 250;
                                    ChickBreastBoneTime = 260;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = ".50 inch / 13 mm";

                                }

                                if (x.equals("1.00 inch / 25 mm")) {
                                    ChickBreastBoneTemp = 270;
                                    ChickBreastBoneTime = 280;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "1.00 inch / 25 mm";

                                }

                                if (x.equals("1.50 inch / 38 mm")) {
                                    ChickBreastBoneTemp = 290;
                                    ChickBreastBoneTime = 300;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "1.50 inch / 38 mm";

                                }

                                if (x.equals("2.00 inch / 51 mm")) {
                                    ChickBreastBoneTemp = 310;
                                    ChickBreastBoneTime = 320;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "2.00 inch / 51 mm";
                                }

                                if (x.equals("2.50 inch / 63 mm")) {
                                    ChickBreastBoneTemp = 330;
                                    ChickBreastBoneTime = 340;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "2.50 inch / 63 mm";
                                }

                                if (x.equals("3.00 inch / 76 mm")) {
                                    ChickBreastBoneTemp = 350;
                                    ChickBreastBoneTime = 360;
                                    done = "Highest Time/ Thorough Cook";
                                    thick = "3.00 inch / 76 mm";
                                }


                                break;


                        }
                        Toast.makeText(ChickBreastBone.this, "\n Class: \t " + booyah +
                            "\n Div: \t" + selectedDiv + "\n Temp : \t" + ChickBreastBoneTemp + "\n Time: \t" + ChickBreastBoneTime, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }







    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.CookDisplaypage:

                Intent ChickBreastintent = new Intent(this, DisplayPreset.class);
                startActivity(ChickBreastintent);

                Intent example = new Intent(getApplicationContext(),DisplayPreset.class);
                //ChickBreastBoneTemp = 137;
                // passing temp variable in F
                //ChickBreastBoneTime = 110;

                String doneVar = String.valueOf(done);
                String thickVar = String.valueOf(thick);
                String chickBreastTemp = String.valueOf(ChickBreastBoneTemp);
                String chickBreastTime = String.valueOf(ChickBreastBoneTime);

                example.putExtra("message",doneVar);
                example.putExtra("message2",thickVar);
                example.putExtra("message3",chickBreastTemp);
                example.putExtra("message4",chickBreastTime);

                startActivity(example);



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
        sendData.getTime(ChickBreastBoneTemp);
        sendData.getTemp(ChickBreastBoneTime);


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
                Toast.makeText(ChickBreastBone.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });


    }}