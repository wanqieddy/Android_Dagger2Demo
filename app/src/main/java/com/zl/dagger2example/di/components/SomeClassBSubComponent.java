package com.zl.dagger2example.di.components;

import com.zl.dagger2example.di.modules.ModuleC;
import com.zl.dagger2example.ui.SubComponentActivity;

import dagger.Subcomponent;

/**
 * Created by wanqi on 16-4-6.
 */

@Subcomponent(modules = ModuleC.class)
public interface SomeClassBSubComponent {

    void inject(SubComponentActivity activity);
}
