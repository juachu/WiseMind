package com.example.mlh_admin.wisemind;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button info = (Button)findViewById(R.id.btnInfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Uri uri = Uri.parse("https://devpost.com/software/wise-mind");
                    Intent webpage =new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(webpage);
                }
            }
        });

        Button goCreate = (Button)findViewById(R.id.btnToCreate);
        goCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent = new Intent(HomeScreen.this, CreateAccount.class);
                    startActivity(intent);
                }
            }
        });


        Button goSign = (Button)findViewById(R.id.btnToSign);
        goSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent = new Intent(HomeScreen.this, LoginScreen.class);
                    startActivity(intent);
                }
            }
        });


    }
}
