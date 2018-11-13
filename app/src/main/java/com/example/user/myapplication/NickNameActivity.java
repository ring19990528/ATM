package com.example.user.myapplication;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NickNameActivity extends AppCompatActivity {

    private EditText ednickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nick_name);
    }
    public void next(View view){
        ednickname = findViewById(R.id.ed_nickname);
        String nickname = ednickname.getText().toString();
        getSharedPreferences("user",MODE_PRIVATE)
                .edit()
                .putString("NICKNAME",nickname)
                .apply();
        Intent intent = new Intent(this,AgeActivity.class);
        startActivity(intent);
    }
}
