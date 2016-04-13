package com.zl.dagger2example.bean;

/**
 * Created by wanqi on 16-4-5.
 */
public class SomeClassB1 {
    private SomeClassA1 someClassA1;


    public SomeClassB1(SomeClassA1 someClassA1) {
        this.someClassA1 = someClassA1;
    }
}
