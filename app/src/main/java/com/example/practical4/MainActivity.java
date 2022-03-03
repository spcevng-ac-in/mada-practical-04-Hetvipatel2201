package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText number;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hooks
        name=findViewById(R.id.nameET);
        number = findViewById(R.id.number);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(view -> {
            String nameS=name.getText().toString();
            String numberS=number.getText().toString();

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",nameS);
                intent.putExtra("number",numberS);
                startActivity(intent);

        });
    }
}