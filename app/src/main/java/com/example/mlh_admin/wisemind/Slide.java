package com.example.mlh_admin.wisemind;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class Slide extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_slide);

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#40485f")) // int background color
                .setDrawable(R.drawable.slide1) // int top drawable
                .setSummary("This is summary")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#40485f")) // int background color
                .setDrawable(R.drawable.slide2) // int top drawable
                .setSummary("This is summary")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#40485f")) // int background color
                .setDrawable(R.drawable.slide3) // int top drawable
                .setSummary("This is summary")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#40485f")) // int background color
                .setDrawable(R.drawable.slide4) // int top drawable
                .setSummary("This is summary")
                .build());



    }

    @Override
    public void finishTutorial() {

        Intent nextIntent = new Intent(Slide.this, SplashScreen.class);
        startActivity(nextIntent);
    }
}
