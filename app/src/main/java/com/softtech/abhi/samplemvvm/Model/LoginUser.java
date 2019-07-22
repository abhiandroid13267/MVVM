package com.softtech.abhi.samplemvvm.Model;

import android.util.Patterns;

public class LoginUser {

    private String strEmailAddress;
    private String strPassword;

    public LoginUser(String strEmailAddress, String strPassword) {
        this.strEmailAddress = strEmailAddress;
        this.strPassword = strPassword;
    }

    public String getStrEmailAddress() {
        return strEmailAddress;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public boolean isValidEmailAddress()
    {
        return Patterns.EMAIL_ADDRESS.matcher(getStrEmailAddress()).matches();
    }

    public boolean isPasswordLengthGreaterThan5()
    {
        return getStrPassword().length() > 5;
    }

}
