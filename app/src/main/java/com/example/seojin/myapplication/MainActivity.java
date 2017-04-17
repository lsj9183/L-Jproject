package com.example.seojin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button counselButton = (Button) findViewById(R.id.counselButton);
        final Button listButton = (Button) findViewById(R.id.listButton);
        final Button userIfoButton = (Button) findViewById(R.id.userIfoButton);

        counselButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        listButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        userIfoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}
