package com.zl.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.zl.dagger2example.R;
import com.zl.dagger2example.bean.SomeClassA1;
import com.zl.dagger2example.bean.SomeClassB1;
import com.zl.dagger2example.di.components.DaggerSomeClassADependenciesComponent;
import com.zl.dagger2example.di.components.DaggerSomeClassBDependenciesComponent;
import com.zl.dagger2example.di.components.SomeClassADependenciesComponent;
import com.zl.dagger2example.di.components.SomeClassBDependenciesComponent;
import com.zl.dagger2example.di.modules.ModuleA;
import com.zl.dagger2example.di.modules.ModuleB;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wanqi on 16-4-5.
 */
public class DependenciesActivity extends AppCompatActivity {

    @Bind(R.id.button7)
    Button mButton7;

    @Bind(R.id.button8)
    Button mButton8;

    @Inject
    SomeClassA1 mSomeClassA1;

    @Inject
    SomeClassB1 someClassB1;

    SomeClassADependenciesComponent someClassADependenciesComponent;

    SomeClassBDependenciesComponent someClassBDependenciesComponent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ButterKnife.bind(this);

        someClassADependenciesComponent = DaggerSomeClassADependenciesComponent.builder().moduleA(new ModuleA()).build();
        //someClassADependenciesComponent.inject(this);
        Log.i("ss","__________________________________________________someClassADependenciesComponent:"+someClassADependenciesComponent);
        Log.i("ss","__________________________________________________someClassADependenciesComponent.someClassA1():"+someClassADependenciesComponent.someClassA1());
        Log.i("ss","_______________________1________________mSomeClassA1:"+mSomeClassA1+"____________someClassB1:"+someClassB1);

        someClassBDependenciesComponent = DaggerSomeClassBDependenciesComponent.builder().moduleB(new ModuleB()).someClassADependenciesComponent(someClassADependenciesComponent).build();
        someClassBDependenciesComponent.inject(this);
        Log.i("ss","__________________________________________________someClassBDependenciesComponent.someClassA1():"+someClassBDependenciesComponent.someClassA1());

        Log.i("ss","_______________________2________________mSomeClassA1:"+mSomeClassA1+"____________someClassB1:"+someClassB1);

    }


    @OnClick({
            R.id.button7,
            R.id.button8,
    })
    void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.button7:
                Log.i("ss","________________________________button7");
                //Toast.makeText(this,xiaoming.getName() + "----" + xiaoming.getPassword(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                Log.i("ss","________________________________button8");
                //Toast.makeText(this,xiaoguan.getName() + "----" + xiaoguan.getPassword(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
