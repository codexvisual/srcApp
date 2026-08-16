package com.test.nirbhay.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spl);
        Thread spl=new Thread(){
            public void run() {
                try{
                    sleep(3000);

                    Intent indexscreen = new Intent(getBaseContext(), Home.class);
                    startActivity(indexscreen);
                    finish();
                }
                catch(Exception e)
                {

                }

            };
        };
        spl.start();
    }
}
