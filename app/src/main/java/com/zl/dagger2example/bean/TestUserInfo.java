package com.zl.dagger2example.bean;

import android.text.TextUtils;

import javax.inject.Inject;

/**
 * Created by wanqi on 16-3-29.
 */
public class TestUserInfo {

    private String userId = "123";
    private String token;

    @Inject
    TestUserInfo(String tokenParm){
        token = tokenParm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isLogin(){
        return !TextUtils.isEmpty(token);
    }

    @Override
    public String toString() {
        return "TestUserInfo{" +
                "userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
