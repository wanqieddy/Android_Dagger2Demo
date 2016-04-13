package com.zl.dagger2example.di.components;

import com.zl.dagger2example.di.modules.ModuleA;
import com.zl.dagger2example.di.modules.ModuleB;
import com.zl.dagger2example.ui.SubComponentActivity;

import dagger.Component;

/**
 * Created by wanqi on 16-4-6.
 */
@Component(modules = {ModuleA.class, ModuleB.class})
public interface SomeClassASubComponent {

    SomeClassBSubComponent someClassBSubComponent(ModuleB moduleB);
    void inject(SubComponentActivity activity);
}
