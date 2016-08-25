package com.zl.dagger2example.di.modules;

import com.zl.dagger2example.bean.SomeClassC1;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wanqi on 16-4-5.
 */
@Module
public class ModuleC {

    @Provides
    public SomeClassC1 provideSomeClassC1(){
        return new SomeClassC1();
    }
}
