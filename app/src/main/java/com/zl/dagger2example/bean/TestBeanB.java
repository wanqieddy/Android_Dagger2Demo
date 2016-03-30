package com.zl.dagger2example.bean;

/**
 * Created by wanqi on 16-3-30.
 */
public class TestBeanB {

    private String tokenA = "BB";
    private String tokenB = "BA";

    public TestBeanB() {
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
        return "TestBeanB{" +
                "tokenA='" + tokenA + '\'' +
                ", tokenB='" + tokenB + '\'' +
                '}';
    }
}
