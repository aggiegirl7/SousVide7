package com.example.sousvide;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ManualCook extends AppCompatActivity implements View.OnClickListener{
    //creating public constant
    public static final String EXTRA_TEXT = "com.example.sousvide.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.sousvide.EXTRA_NUMBER";
    boolean isAllFieldsChecked = false;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    SendData sendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_cook);

        Button Cook = findViewById(R.id.Cook);

        Cook.setOnClickListener(this);
        EditText ManualTemp = findViewById(R.id.ManualTemp);
        EditText ManualTime = findViewById(R.id.ManualTime);









    }

    @Override
    public void onClick(View v) {
        isAllFieldsChecked = CheckAllFields();

        if(isAllFieldsChecked){

                openDisplayCook();}

        }

    public void openDisplayCook() {
        EditText ManualTemp = findViewById(R.id.ManualTemp);
        //takes text out of Manual Temp and saves as ManualTempvar (variable)
        int ManualTempvar = Integer.parseInt(ManualTemp.getText().toString());

        EditText ManualTime = findViewById(R.id.ManualTime);
        //takes editText input, converts to string and then converts to integer
        int ManualTimevar = Integer.parseInt(ManualTime.getText().toString());

        String ManTemp = String.valueOf(ManualTempvar);


        Intent example = new Intent(getApplicationContext(),ManualCook.class);

        example.putExtra("message",ManualTempvar);
        //example.putExtra("message2",thickVar);

        startActivity(example);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("SendData");


        sendData = new SendData();
        // Integer testTemp = 20;
        //Integer testTime = 50;

        //private void addDatatoFirebase(int testTemp, int testTime) {
        // below 3 lines of code is used to set
        // data in our object class.
        sendData.getTime(ManualTimevar);
        sendData.getTemp(ManualTempvar);


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
                Toast.makeText(ManualCook.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });



                    Intent intent = new Intent(this, DisplayCook.class);
                    intent.putExtra(EXTRA_TEXT,ManualTempvar);
                    intent.putExtra(EXTRA_NUMBER,ManualTimevar);

                    startActivity(intent);
    }





    private boolean CheckAllFields() {
        EditText ManualTemp = findViewById(R.id.ManualTemp);
        EditText ManualTime = findViewById(R.id.ManualTime);

        int ManualTempvar = Integer.parseInt(ManualTemp.getText().toString());
        int ManualTimevar = Integer.parseInt(ManualTime.getText().toString());
        if (ManualTemp.length() == 0) {
            ManualTemp.setError("This field is required");
            return false;
        }

        if (ManualTime.length() == 0) {
            ManualTime.setError("This field is required");
            return false;
        }
        if (ManualTimevar > 72) {
            ManualTime.setError("You cannot exceed 72 hours of cooking time.");
            return false;

        }

        if (ManualTempvar > 200) {
            ManualTemp.setError("You cannot exceed 200 ° Fahrenheit.");
            return false;

        }

        return true;}}





