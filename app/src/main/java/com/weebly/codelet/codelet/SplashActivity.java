package com.weebly.codelet.codelet;

import android.content.Intent;
<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
=======
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
>>>>>>> 2a165c440dfc5eed890638cdcba6eb12646a6836

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1500);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
=======
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
>>>>>>> 2a165c440dfc5eed890638cdcba6eb12646a6836
    }
}
