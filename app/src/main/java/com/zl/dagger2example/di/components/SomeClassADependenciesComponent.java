package com.zl.dagger2example.di.components;

import com.zl.dagger2example.bean.SomeClassA1;
import com.zl.dagger2example.di.modules.ModuleA;

import dagger.Component;

/**
 * Created by wanqi on 16-4-5.
 */
@Component(modules = {ModuleA.class})
public interface SomeClassADependenciesComponent {

    SomeClassA1 someClassA1();
    //void inject(DependenciesActivity thirdActivity);
}
