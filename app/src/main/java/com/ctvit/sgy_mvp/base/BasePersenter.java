package com.ctvit.sgy_mvp.base;

import com.ctvit.sgy_mvp.IView;

import java.lang.ref.WeakReference;

/*
   项目名：SGY_MVP
   包名:   com.ctvit.sgy_mvp.presenter
   创建者：孙光远
   创建时间：2021/5/3 14:29
 */
public class BasePersenter<V extends IView> {


    private WeakReference<V> viewRef;

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
}
