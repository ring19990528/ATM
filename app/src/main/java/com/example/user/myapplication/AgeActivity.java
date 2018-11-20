package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends BasicActivity {

    private EditText edage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }
    public void next(View view){
        edage = findViewById(R.id.ed_age);
        int age = Integer.parseInt(edage.getText().toString());
        user.setAge(age);
        Intent intent = new Intent(this,GenderActivity.class);
        startActivity(intent);

    }
    public void back(View view){
        finish();
    }
}
