package com.bruce.chang.testmvp.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.Toast;

import com.bruce.chang.testmvp.GirlGridAdapter;
import com.bruce.chang.testmvp.R;
import com.bruce.chang.testmvp.bean.GirlBean;
import com.bruce.chang.testmvp.presenter.GirlPressenterV1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:23:05
 * Author:BruceChang
 * Function:
 */

public class GirlGridActivity extends AppCompatActivity implements IGirlView {
    Context mContext;
    GridView lv_grid;
    GirlGridAdapter girlGridAdapter;
    List<GirlBean> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_grid);
        mContext = this;
        lv_grid = (GridView) findViewById(R.id.lv_grid);
        girlGridAdapter = new GirlGridAdapter(mContext, mData);
        lv_grid.setAdapter(girlGridAdapter);
        //中间者，让他触发加载数据
        new GirlPressenterV1(this).fetch();
    }

    @Override
    public void showLoading() {
        Toast.makeText(mContext, "正在加载中。。。", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<GirlBean> girlBeanList) {
        if (girlBeanList != null && girlBeanList.size() > 0) {
            mData.addAll(girlBeanList);
            girlGridAdapter.notifyDataSetChanged();
        }
    }
}
