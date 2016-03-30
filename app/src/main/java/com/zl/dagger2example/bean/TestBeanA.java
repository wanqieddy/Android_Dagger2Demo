package com.zl.dagger2example.bean;

import javax.inject.Inject;

/**
 * Created by wanqi on 16-3-30.
 */
public class TestBeanA {

    private String tokenA = "AB";
    private String tokenB = "AA";

    @Inject
    public TestBeanA() {
    }


    public String getTokenA() {
        return tokenA;
    }

    public void setTokenA(String tokenA) {
        this.tokenA = tokenA;
    }

    public String getTokenB() {
        return tokenB;
    }

    public void setTokenB(String tokenB) {
        this.tokenB = tokenB;
    }

    @Override
    public String toString() {
        return "TestBeanA{" +
                "tokenA='" + tokenA + '\'' +
                ", tokenB='" + tokenB + '\'' +
                '}';
    }
}
