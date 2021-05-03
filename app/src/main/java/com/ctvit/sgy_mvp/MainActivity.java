package com.ctvit.sgy_mvp;

import android.os.Bundle;
import android.widget.Toast;

import com.ctvit.sgy_mvp.base.BaseActivity;
import com.ctvit.sgy_mvp.contract.MainContract;
import com.ctvit.sgy_mvp.presenter.MainPersenter;

public class MainActivity extends BaseActivity<MainPersenter> implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter.requesData();
    }

    @Override
    protected MainPersenter createPresenter() {
        return new MainPersenter();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "mvp", Toast.LENGTH_SHORT).show();
    }
}