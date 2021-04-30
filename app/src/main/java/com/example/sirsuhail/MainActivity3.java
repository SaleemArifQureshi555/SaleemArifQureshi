package com.example.sirsuhail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
private TextView reciever;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
      reciever=findViewById(R.id.reciver);
        reciever.setText(getIntent().getStringExtra("key"));
    }
}