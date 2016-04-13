package com.zl.dagger2example.di.components;

import com.zl.dagger2example.bean.SomeClassB1;
import com.zl.dagger2example.di.modules.ModuleB;
import com.zl.dagger2example.ui.SubComponentActivity;

import dagger.Subcomponent;

/**
 * Created by wanqi on 16-4-6.
 */

@Subcomponent(modules = ModuleB.class)
public interface SomeClassBSubComponent {

    SomeClassB1 someClassB1();
    void inject(SubComponentActivity activity);
}
