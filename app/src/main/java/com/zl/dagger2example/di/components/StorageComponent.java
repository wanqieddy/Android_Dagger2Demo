package com.zl.dagger2example.di.components;

import com.zl.dagger2example.bean.TestBeanA;
import com.zl.dagger2example.bean.TestBeanB;
import com.zl.dagger2example.di.modules.ScheduleModule;
import com.zl.dagger2example.di.modules.StorageModule;
import com.zl.dagger2example.ui.MainActivity;
import com.zl.dagger2example.utils.Storage;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by weilu on 2016/1/26.
 */
@Singleton
@Component(modules = {
        StorageModule.class ,
        ScheduleModule.class
})
public interface StorageComponent {

    Storage execute();
    TestBeanA getBeanA();
    TestBeanB getBeanB();
    void inject(MainActivity mMainActivity);
}
