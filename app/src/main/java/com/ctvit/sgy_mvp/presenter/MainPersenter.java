package com.ctvit.sgy_mvp.presenter;

import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import com.ctvit.sgy_mvp.base.BasePersenter;
import com.ctvit.sgy_mvp.contract.MainContract;
import com.ctvit.sgy_mvp.module.MainModule;

import static android.widget.Toast.LENGTH_SHORT;

/*
   项目名：SGY_MVP
   包名:   com.ctvit.sgy_mvp.presenter
   创建者：孙光远
   创建时间：2021/5/3 14:31
 */
public class MainPersenter extends BasePersenter<MainContract.View> {

    MainModule mMainModule;

    public MainPersenter() {
        mMainModule = new MainModule();
    }


    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        super.onCreate(owner);
        getView().showToast();
    }

    public void requesData() {
        if (!isViewAttached()) {
            return;
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getView().showToast();
            }
        }, 2000);//3秒后执行Runnable中的run方法

    }


}
