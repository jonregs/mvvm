package com.example.mvvm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginSignupPage extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button loginButton = (Button) findViewById(R.id.gimmyoLoginButton);
        loginButton.setOnClickListener(this);

        Button signupButton = (Button) findViewById(R.id.gimmyoSignupButton);
        signupButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()) {

            case R.id.gimmyoLoginButton:
                //this is where the login page intent will go
                break;
            case R.id.gimmyoSignupButton:
                // this is where the signup page intent will go
                break;
        }

    }
}
