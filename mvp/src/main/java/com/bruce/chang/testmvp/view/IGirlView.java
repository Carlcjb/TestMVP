package com.bruce.chang.testmvp.view;

import com.bruce.chang.testmvp.bean.GirlBean;

import java.util.List;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:21:40
 * Author:BruceChang
 * Function:View的接口，负责显示数据
 */

public interface IGirlView {

    /**
     * 加载进度条
     */
    void showLoading();

    /**
     * 显示数据
     *
     * @param girlBeanList
     */
    void showGirls(List<GirlBean> girlBeanList);

}
