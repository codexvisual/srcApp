package com.test.nirbhay.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    LinearLayout tb1,tb2,tb3,tb4;
    TextView headername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1=(LinearLayout)findViewById(R.id.tb1);
        tb2=(LinearLayout)findViewById(R.id.tb2);
        tb3=(LinearLayout)findViewById(R.id.tb3);
        tb4=(LinearLayout)findViewById(R.id.tb4);
         headername=(TextView)findViewById(R.id.headername);
        headername.setText("Search Engine");

        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(Home.this,TabOne.class));

            }
        });
        tb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,TabTwo.class));

            }
        });
        tb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,TabThree.class));

            }
        });
        tb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,TabFour.class));

            }
        });

    }
}
