package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();
    }
    public void login(View view){
        EditText userid = findViewById(R.id.userid);
        EditText passwd = findViewById(R.id.passwd);
        String name = userid.getText().toString();
        String pass = passwd.getText().toString();
        if("ring".equals(name) && "0528".equals(pass)){
            setResult(RESULT_OK);
            finish();
        }
        else{

        }
    }
}
