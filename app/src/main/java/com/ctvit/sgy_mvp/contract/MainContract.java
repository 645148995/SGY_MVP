package com.ctvit.sgy_mvp.contract;

import com.ctvit.sgy_mvp.IView;
import com.ctvit.sgy_mvp.module.IModule;

/*
   项目名：SGY_MVP
   包名:   com.ctvit.sgy_mvp.contract
   创建者：孙光远
   创建时间：2021/5/3 14:23
 */
public interface MainContract {

    interface Module extends IModule {
        void getData();
    }

    interface View extends IView {
        void showToast();
    }
}
