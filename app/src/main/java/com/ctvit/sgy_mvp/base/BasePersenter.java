package com.ctvit.sgy_mvp.base;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

import java.lang.ref.WeakReference;

/*
   项目名：SGY_MVP
   包名:   com.ctvit.sgy_mvp.presenter
   创建者：孙光远
   创建时间：2021/5/3 14:29
 */
public class BasePersenter<V extends IView> implements IPresenter, LifecycleObserver {


    private WeakReference<V> viewRef;

    public BasePersenter() {

    }


    /**
     * 界面创建，Presenter与界面取得联系
     */

    public void attachView(V view) {
        viewRef = new WeakReference<V>(view);
    }

    /**
     * 获取界面的引用
     */
    protected V getView() {
        return viewRef == null ? null : viewRef.get();
    }

    /**
     * 判断界面是否销毁
     */
    protected boolean isViewAttached() {
        return viewRef != null && viewRef.get() != null;
    }

    /**
     * 界面销毁，Presenter与界面断开联系
     */

    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }



    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        this.viewRef = null;
    }
}
