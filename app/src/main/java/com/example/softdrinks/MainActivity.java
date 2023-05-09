package com.example.softdrinks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                redirectLogin();
            }
        }, 2000);
    }

    private void redirectLogin(){
        // Start activity and redirect to Options page where user can select to create account or login
        startActivity(new Intent(MainActivity.this, Default.class));
        finish();
    }
}