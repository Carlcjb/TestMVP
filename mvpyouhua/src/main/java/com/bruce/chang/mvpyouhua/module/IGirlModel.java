package com.bruce.chang.mvpyouhua.module;


import com.bruce.chang.mvpyouhua.bean.GirlBean;

import java.util.List;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:21:33
 * Author:BruceChang
 * Function: Model接口，负责加载数据，就是网络请求或者本地加载数据
 */

public interface IGirlModel {
    /**
     * 负责加载数据
     *
     * @param girlOnLoadListener
     */
    void loadGirl(GirlOnLoadListener girlOnLoadListener);

    /**
     * 加载数据的接口监听类
     */
    interface GirlOnLoadListener {
        void onComplete(List<GirlBean> girlList);
    }


}
