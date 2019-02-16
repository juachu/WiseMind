package com.example.mlh_admin.wisemind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        Button signin = (Button)findViewById(R.id.btnSignin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edit = (EditText)findViewById(R.id.username);
                String username = edit.getText().toString();

                EditText edit2 = (EditText)findViewById(R.id.password);
                String password = edit2.getText().toString();



               /* if(username.equals(username)  && password.equals(password)) {

                    myIntent.putExtra("keep", true);
                }
                else{
                    Toast.makeText(LoginScreen.this, "Invalid username/password combination", Toast.LENGTH_LONG).show();
                    myIntent.putExtra("keep", false);

                }*/

                if(password.length() < 8){
                    Toast.makeText(LoginScreen.this, "Password must be at least 8 characters", Toast.LENGTH_LONG).show();

                }
                else{

                    Intent myIntent = new Intent(LoginScreen.this, MainActivity.class);
                   startActivity(myIntent);
                }
            }
        });
    }

}

