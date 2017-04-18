package com.bruce.chang.mvpyouhua.presenter;

import com.bruce.chang.mvpyouhua.bean.GirlBean;
import com.bruce.chang.mvpyouhua.module.GirlModelImpV1;
import com.bruce.chang.mvpyouhua.module.IGirlModel;
import com.bruce.chang.mvpyouhua.view.IGirlView;

import java.util.List;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:23:46
 * Author:BruceChang
 * Function:
 */

public class GirlPressenterV2 extends BasePresenter<IGirlView> {


    //view interface
    IGirlView iGirlView;

    //model interface
    IGirlModel iGirlModel = new GirlModelImpV1();


    /**
     * 通过构造方法实例化iGirlView
     *
     * @param iGirlView
     */
    public GirlPressenterV2(IGirlView iGirlView) {
        this.iGirlView = iGirlView;
    }


    /**
     * bind  view and model
     */
    public void fetch() {
        //显示进度条
        iGirlView.showLoading();

        if (iGirlModel != null) {
            iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<GirlBean> girlList) {
                    //给View显示
                    iGirlView.showGirls(girlList);
                }
            });
        }
    }


    public void setiGirlModel(int i) {
        switch (i) {
            case 0:
                //0的时候才用A Model
                break;
            case 1:
                //1的时候才用B Model
                break;
        }
    }
}
