package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText userid;
    private EditText passwd;
    private EditText edUserid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();
        edUserid = findViewById(R.id.userid);
        String userid = getSharedPreferences("atm",MODE_PRIVATE)
                .getString("userid","");
        edUserid.setText(userid);
    }

    private void findViews() {
        userid = findViewById(R.id.userid);
        passwd = findViewById(R.id.passwd);
    }

    public void login(View view){
        String name = userid.getText().toString();
        String pass = passwd.getText().toString();
        if("ring".equals(name) && "0528".equals(pass)){
          setResult(RESULT_OK);
            getSharedPreferences("atm",MODE_PRIVATE)
                    .edit()
                    .putString("userid",name)
                    .apply();
            finish();
        }
        else{

        }
    }
}
