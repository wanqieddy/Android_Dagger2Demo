package com.zl.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.zl.dagger2example.R;
import com.zl.dagger2example.bean.SomeClassA1;
import com.zl.dagger2example.bean.SomeClassB1;
import com.zl.dagger2example.di.components.DaggerSomeClassASubComponent;
import com.zl.dagger2example.di.components.SomeClassASubComponent;
import com.zl.dagger2example.di.components.SomeClassBSubComponent;
import com.zl.dagger2example.di.modules.ModuleA;
import com.zl.dagger2example.di.modules.ModuleB;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wanqi on 16-4-6.
 */
public class SubComponentActivity extends AppCompatActivity {

    @Bind(R.id.button9)
    Button mButton7;

    @Bind(R.id.button10)
    Button mButton8;

    @Inject
    SomeClassA1 mSomeClassA1;

    @Inject
    SomeClassB1 someClassB1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        ButterKnife.bind(this);

        SomeClassASubComponent someClassASubComponent = DaggerSomeClassASubComponent.builder().moduleA(new ModuleA()).moduleB(new ModuleB()).build();
        someClassASubComponent.inject(this);
        Log.i("ss","__________1_______________mSomeClassA1:"+mSomeClassA1+"_____someClassB1:"+someClassB1);


        SomeClassBSubComponent someClassBSubComponent = someClassASubComponent.someClassBSubComponent(new ModuleB());
        someClassBSubComponent.inject(this);
        Log.i("ss","___________2______________mSomeClassA1:"+mSomeClassA1+"_____someClassB1:"+someClassB1);
    }


    @OnClick({
            R.id.button9,
            R.id.button10,
    })
    void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.button9:
                Log.i("ss","________________________________button9");
                //Toast.makeText(this,xiaoming.getName() + "----" + xiaoming.getPassword(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                Log.i("ss","________________________________button10");
                //Toast.makeText(this,xiaoguan.getName() + "----" + xiaoguan.getPassword(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
