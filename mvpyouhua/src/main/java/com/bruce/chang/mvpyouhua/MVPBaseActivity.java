package com.bruce.chang.mvpyouhua;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bruce.chang.mvpyouhua.presenter.BasePresenter;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:23:22
 * Author:BruceChang
 * Function:
 */

public abstract class MVPBaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //创建 Presenter
        mPresenter = createPersenter();
        //内存泄漏
        //关联View
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除关联
        mPresenter.detachView();
    }

    /**
     * create Persenter
     *
     * @return
     */
    protected abstract T createPersenter();
}
