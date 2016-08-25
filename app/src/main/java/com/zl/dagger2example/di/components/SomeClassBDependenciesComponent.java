package com.zl.dagger2example.di.components;

import com.zl.dagger2example.bean.SomeClassA1;
import com.zl.dagger2example.bean.SomeClassB1;
import com.zl.dagger2example.di.modules.ModuleB;
import com.zl.dagger2example.ui.DependenciesActivity;

import dagger.Component;

/**
 * Created by wanqi on 16-4-5.
 */

@Component(modules = ModuleB.class, dependencies=SomeClassADependenciesComponent.class)
public interface SomeClassBDependenciesComponent {

    SomeClassB1 someClassB1();
    SomeClassA1 someClassA1();
    void inject(DependenciesActivity thirdActivity);
}


