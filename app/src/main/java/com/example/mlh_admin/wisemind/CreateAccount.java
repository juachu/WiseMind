package com.example.mlh_admin.wisemind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button create = (Button)findViewById(R.id.btnCreateAccount);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                //implementation to create new users

                EditText edit2 = (EditText)findViewById(R.id.newPassword);
                String password = edit2.getText().toString();
                EditText edit = (EditText)findViewById(R.id.confirmPassword);
                String passwordsame = edit.getText().toString();


                if(password.equals(passwordsame) == false){

                    Toast.makeText(CreateAccount.this, "Passwords must be the same", Toast.LENGTH_LONG).show();

                }
                else{

                    Intent intent = new Intent(CreateAccount.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}

