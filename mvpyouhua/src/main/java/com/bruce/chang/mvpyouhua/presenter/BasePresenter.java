package com.bruce.chang.mvpyouhua.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:23:33
 * Author:BruceChang
 * Function:Presenter中间者基类,对MVP的一种优化，当内存不足的时候优先回收model
 */

public abstract class BasePresenter<T> {

    //当内存不足可以释放内存
    protected WeakReference<T> mViewRef;

    /**
     * bind  presenter with view
     *
     * @param view
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * 解除关联
     */
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    protected T getView() {
        return mViewRef.get();
    }
}
