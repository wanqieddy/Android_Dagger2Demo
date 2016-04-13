package com.zl.dagger2example.di.modules;

import com.zl.dagger2example.bean.SomeClassA1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wanqi on 16-4-5.
 */
@Module
public class ModuleA {

    @Provides
    public SomeClassA1 provideSomeClassA1(){
        return new SomeClassA1();
    }
}
