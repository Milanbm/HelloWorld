package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button myButton;
    String myString = "Hello World!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.buttonId);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_SHORT).show();
            }

        });
    }
}
