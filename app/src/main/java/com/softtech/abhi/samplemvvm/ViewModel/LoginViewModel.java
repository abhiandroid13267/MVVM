package com.softtech.abhi.samplemvvm.ViewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.view.View;

import com.softtech.abhi.samplemvvm.Model.LoginUser;

public class LoginViewModel extends ViewModel {

    public MutableLiveData<String> EmailAddress = new MutableLiveData<>();
    public MutableLiveData<String> Password = new MutableLiveData<>();

    private MutableLiveData<LoginUser> userMutableLiveData;

    public MutableLiveData<LoginUser> getUser()
    {
        if (userMutableLiveData == null)
        {
            userMutableLiveData = new MutableLiveData<>();
        }

        return userMutableLiveData;
    }

    public void onClick(View view)
    {
        // have to add pb
        LoginUser loginUser = new LoginUser(EmailAddress.getValue(),Password.getValue());
        userMutableLiveData.setValue(loginUser);
    }
}


