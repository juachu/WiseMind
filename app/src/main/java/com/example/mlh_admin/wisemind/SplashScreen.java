package com.example.mlh_admin.wisemind;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView iv = (ImageView)findViewById(R.id.imageView2);
        iv.setBackgroundResource(R.drawable.wisemanlogofull2);

        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                Intent myIntent = new Intent(SplashScreen.this, HomeScreen.class);
                startActivity(myIntent);
                finish();
            }
        },3000);
    }
    }

