package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name,number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.getname);
        number=findViewById(R.id.getnumber);

        //to get data
        Intent intent=getIntent();
        String nameS=intent.getStringExtra("name");
        String numberS=intent.getStringExtra("number");

        //to show data on activity2
        name.setText(nameS);
        number.setText(numberS);
    }
}