package com.zl.dagger2example.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zl.dagger2example.MyApplication;
import com.zl.dagger2example.R;
import com.zl.dagger2example.bean.Person;
import com.zl.dagger2example.bean.SomeClassA1;
import com.zl.dagger2example.bean.TestUserInfo;
import com.zl.dagger2example.di.components.DaggerSomeClassADependenciesComponent;
import com.zl.dagger2example.di.components.DaggerSomeClassBDependenciesComponent;
import com.zl.dagger2example.di.components.SomeClassADependenciesComponent;
import com.zl.dagger2example.di.components.SomeClassADependenciesComponent;
import com.zl.dagger2example.di.components.SomeClassBDependenciesComponent;
import com.zl.dagger2example.di.components.StorageComponent;
import com.zl.dagger2example.di.modules.ModuleA;
import com.zl.dagger2example.di.modules.ModuleB;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button1)
    Button mButton1;

    @Bind(R.id.button2)
    Button mButton2;

    @Bind(R.id.button3)
    Button mButton3;

    @Bind(R.id.button_dependencies)
    Button mButtonDep;

    @Bind(R.id.button_subcomponent)
    Button mButtonSub;


    @Inject
    SharedPreferences mPreferences;//全局的SharedPreferences

    @Inject
    Person mPerson;

    @Inject
    TestUserInfo mTestUserInfo;

    StorageComponent mStorageComponent;
    private final String KEY = "Dagger 2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mStorageComponent = ((MyApplication) this.getApplication()).getStorageComponent();
        mStorageComponent.inject(this);//注入MainActivity
        mStorageComponent.execute().storage();//执行储存操作
        Log.i("ss", "_______________MainActivity_________________________mTestUserInfo:" + mTestUserInfo);
        Log.i("ss", "_____________________________________mStorageComponent.getBeanA():" + mStorageComponent.getBeanA());
        Log.i("ss", "_____________________________________mStorageComponent.getBeanB():" + mStorageComponent.getBeanB());


/*        ModuleA moduleA = new ModuleA();
        SomeClassADependenciesComponent someClassADependenciesComponent =DaggerSomeClassADependenciesComponent.builder().moduleA(moduleA).build();
        someClassADependenciesComponent.inject(this);
        ModuleB moduleB = new ModuleB();
        SomeClassBDependenciesComponent someClassBDependenciesComponent = DaggerSomeClassBDependenciesComponent.builder().moduleB(moduleB).someClassADependenciesComponent(someClassADependenciesComponent).build();

        Log.i("ss","_________________________________________mSomeClassA1:"+mSomeClassA1);*/


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    @OnClick({
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button_dependencies,
            R.id.button_subcomponent
    })
    void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.button1:
                //Toast.makeText(this,mPreferences.getString(KEY,"---"),Toast.LENGTH_SHORT).show();
                Toast.makeText(this, mStorageComponent.execute().getStorage(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, mPerson.getName() + "----" + mPerson.getAge(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.button_dependencies:
                Intent intent1 = new Intent(this, DependenciesActivity.class);
                startActivity(intent1);
                break;
            case R.id.button_subcomponent:
                Intent intent2 = new Intent(this, SubComponentActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
