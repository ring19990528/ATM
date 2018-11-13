
package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {

    private EditText edgender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void ok(View view){
        edgender = findViewById(R.id.ed_gender);
        String gender = edgender.getText().toString();
        getSharedPreferences("user",MODE_PRIVATE)
                .edit()
                .putString("GENDER",gender)
                .apply();



    }
}
