package com.zl.dagger2example.di.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.zl.dagger2example.MyApplication;
import com.zl.dagger2example.bean.TestBeanB;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by weilu on 2016/1/26.
 */
@Module
public class StorageModule {

    private final MyApplication application;

    public StorageModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @Singleton
    String provide123Token(){
        return "token123";
    }

    @Provides
    TestBeanB provideTestBeanB(){
        return new TestBeanB();
    }

}
