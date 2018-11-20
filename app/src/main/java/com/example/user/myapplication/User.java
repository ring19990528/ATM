package com.example.user.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
    private Context context;
    String userid;
    String nickname;
    int age;
    String gender;
    SharedPreferences settings;
    boolean valid = false;

    public User(Context context){
        this.context = context;
        settings = context.getSharedPreferences("user",Context.MODE_PRIVATE);
    }
    public String getNickname() {
        if(nickname == null){
            nickname = settings.getString("NICKNAME",null);
        }
        return nickname;
    }

    public void setNickname(String nickname) {
        settings.edit()
                .putString("NICKNAME",nickname).apply();
        this.nickname = nickname;
    }

    public int getAge() {
        if(age == 0){
            age = settings.getInt("AGE",0);
        }
        return age;
    }

    public void setAge(int age) {
        settings.edit()
                .putInt("AGE",age).apply();
        this.age = age;
    }

    public String getGender() {
        if(gender == null){
            gender = settings.getString("GENDER",null);
        }
        return gender;
    }

    public void setGender(String gender) {
        settings.edit()
                .putString("GENDER",gender).apply();
        this.gender = gender;
    }

    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public boolean isValid() {
        valid = getNickname() != null && getAge() != 0 && getGender() != null;
        return valid;
    }
}
