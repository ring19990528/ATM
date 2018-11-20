package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


//CTRL+ALT+F快速鍵  Ctrl+alt+M     Ctrl+O override
public class MainActivity extends BasicActivity {

    public static final int RC_LOGIN = 100;
    boolean logon = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if( !logon){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivityForResult(intent,RC_LOGIN);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_LOGIN){
            if(resultCode != RESULT_OK){
                finish();
            }else{
                logon = true;
                if(user.isValid()) {
                    Intent intent = new Intent(this, NickNameActivity.class);
                    startActivity(intent);
                }
            }
        }
    }
}
