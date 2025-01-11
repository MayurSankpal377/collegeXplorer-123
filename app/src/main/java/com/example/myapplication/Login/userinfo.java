package com.example.myapplication.Login;

public class userinfo {
    public  String name;
    public String mobile;
    public String email;
    public String password;

    public userinfo(String name, String mobile, String email, String password) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.password = password;

    }

    String getMobile;

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;}
    public void setPassword(String password) {
        this.password = password;

    }
    public String getEmail() {
        return email;}
    public void setEmail(String email) {
        this.email = email;

    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }
}