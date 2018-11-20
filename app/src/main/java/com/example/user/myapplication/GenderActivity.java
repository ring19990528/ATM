
package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends BasicActivity {

    private EditText edgender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void ok(View view){
        edgender = findViewById(R.id.ed_gender);
        String gender = edgender.getText().toString();
        user.setGender(gender);
        Intent main = new Intent(this,MainActivity.class);
        main.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(main);

    }
    public void back(View view){
        finish();
    }
}
