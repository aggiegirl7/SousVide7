package com.example.sousvide;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

//package com.example.firebase;

public class DisplayPreset extends AppCompatActivity {

    private TextView alertTextView;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

    DatabaseReference notifprac;

    private TextView retrieveTV;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_preset);

        TextView textView2 = (TextView) findViewById(R.id.Timedisp);
        TextView textView1 = (TextView) findViewById(R.id.Tempdisp);

        Intent example = getIntent();
        String thick = example.getStringExtra("message");
        String done = example.getStringExtra("message2");
        String temp = example.getStringExtra("message3");
        String time = example.getStringExtra("message4");

        textView2.setText("" + thick );
        textView1.setText("" + done );




        //firebase
        // below line is used to get the instance
        // of our Firebase database.
        firebaseDatabase = FirebaseDatabase.getInstance();

        // below line is used to get
        // reference for our database.
        databaseReference = firebaseDatabase.getReference("Data");
        databaseReference = firebaseDatabase.getReference("data");

        DatabaseReference reference = firebaseDatabase.getReference();
        reference.child("data2")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                        //for(DataSnapshot child: children)
                        //{

                            Integer value2 = dataSnapshot.getValue(Integer.class);
                            if (value2 == 1)
                            { Toast.makeText(DisplayPreset.this,""+ value2.toString(), Toast.LENGTH_LONG).show();
                                AlertDialog.Builder builder = new AlertDialog.Builder(DisplayPreset.this);

                                builder.setCancelable(true);
                                builder.setTitle("Warning!");
                                builder.setMessage("Water bath level is too low");

                                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });

                                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        //alertTextView.setVisibility(View.VISIBLE);
                                    }
                                });
                                builder.show();

                            }
                        //}
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        // initializing our object class variable.
        retrieveTV = findViewById(R.id.idTVRetrieveData);

        // calling method
        // for getting data.
        getdata();
    }

    private void getdata() {

        // calling add value event listener method
        // for getting the values from database.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // this method is call to get the realtime
                // updates in the data.
                // this method is called when the data is
                // changed in our Firebase console.
                // below line is for getting the data from
                // snapshot of our database.
                Integer value = snapshot.getValue(Integer.class);

                // after getting the value we are setting
                // our value to our text view in below line.
                retrieveTV.setText(String.valueOf(value));
                Log.i("bro", String.valueOf(value));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // calling on cancelled method when we receive
                // any error or we are not able to get the data.
                //Toast.makeText(MainActivity.this, "Fail to get data.", Toast.LENGTH_SHORT).show();
            }
        });



        /*TextView textView2 = (TextView) findViewById(R.id.Timedisp);
        TextView textView1 = (TextView) findViewById(R.id.Tempdisp);

       Intent example = getIntent();
       String thick = example.getStringExtra("message");
       String done = example.getStringExtra("message2");
       String temp = example.getStringExtra("message3");
       String time = example.getStringExtra("message4");

        textView2.setText("" + thick );
        textView1.setText("" + done );*/

        //ArrayList<String> list = new ArrayList<>();
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_item)
        }
    }
