package com.zl.dagger2example.di.modules;

import com.zl.dagger2example.bean.SomeClassA1;
import com.zl.dagger2example.bean.SomeClassB1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wanqi on 16-4-5.
 */
@Module
public class ModuleB {

    @Provides
    public SomeClassB1 provideSomeClassB1(SomeClassA1 someClassA1){

        return new SomeClassB1(someClassA1);
    }
}
