package com.ctvit.sgy_mvp.presenter;

import android.os.Handler;

import com.ctvit.sgy_mvp.base.BasePersenter;
import com.ctvit.sgy_mvp.contract.MainContract;
import com.ctvit.sgy_mvp.module.MainModule;

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
