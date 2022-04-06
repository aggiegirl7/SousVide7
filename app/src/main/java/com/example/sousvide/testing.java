package com.example.sousvide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;

public class testing extends AppCompatActivity {
    int chick = 90;
    int temp = 120;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        AndroidNetworking.initialize(getApplicationContext());

        Button btnGet = findViewById(R.id.btn_get);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Send data via HTTP GET*/
                AndroidNetworking.get("http://192.168.4.1/get")
                        .addQueryParameter("time", String.valueOf(chick))
                        .addQueryParameter("data", String.valueOf(temp))
                        .build()
                        .getAsString(new StringRequestListener() {
                            @Override
                            public void onResponse(String response) {
                                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                                Log.i("bro", "get posted");

                            }

                            @Override
                            public void onError(ANError anError) {
                                Toast.makeText(getApplicationContext(), anError.getErrorBody(), Toast.LENGTH_SHORT).show();
                                Log.i("bro", "Get not posted");
                            }


                        });


                Button btnPost = findViewById(R.id.btn_post);
                btnPost.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /*Send data via HTTP POST*/
                        AndroidNetworking.post("http://192.168.4.1/post")
                                .addStringBody("This is my data")
                                .build()
                                .getAsString(new StringRequestListener() {
                                    @Override
                                    public void onResponse(String response) {
                                        Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
                                        Log.i("bro", "post posted");
                                    }

                                    @Override
                                    public void onError(ANError anError) {
                                        Toast.makeText(getApplicationContext(), anError.getErrorBody(), Toast.LENGTH_SHORT).show();
                                        Log.i("bro", "post NOT posted");
                                    }
                                });
                    }
                });
            }
        });}}

