package com.ctvit.sgy_mvp.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;


/*
   项目名：SGY_MVP
   包名:   com.ctvit.sgy_mvp
   创建者：孙光远
   创建时间：2021/5/3 14:29
 */
public abstract class BaseActivity<P extends BasePersenter> extends AppCompatActivity implements IView {
    protected P mPresenter;

    protected abstract P createPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        getLifecycle().addObserver(mPresenter);//为Lifecycle注册生命周期监听器
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
