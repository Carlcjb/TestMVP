package com.bruce.chang.mvpyouhua.view;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.bruce.chang.mvpyouhua.MVPBaseActivity;
import com.bruce.chang.mvpyouhua.R;
import com.bruce.chang.mvpyouhua.adapter.GirlListAdapter;
import com.bruce.chang.mvpyouhua.bean.GirlBean;
import com.bruce.chang.mvpyouhua.presenter.GirlPressenterV2;

import java.util.ArrayList;
import java.util.List;

public class GirlListActivity extends MVPBaseActivity<IGirlView, GirlPressenterV2> implements IGirlView {

    Context mContext;
    ListView lv_list;
    GirlListAdapter girlListAdapter;
    List<GirlBean> mData = new ArrayList<>();
    GirlPressenterV2 girlPressenterV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_list);
        mContext = this;
        lv_list = (ListView) findViewById(R.id.lv_list);
        girlListAdapter = new GirlListAdapter(mContext, mData);
        lv_list.setAdapter(girlListAdapter);
        girlPressenterV2.fetch();
    }

    @Override
    protected GirlPressenterV2 createPersenter() {
        girlPressenterV2 = new GirlPressenterV2(this);
        return girlPressenterV2;
    }

    @Override
    public void showLoading() {

        Toast.makeText(mContext, "正在加载中。。。", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<GirlBean> girlBeanList) {
        if (girlBeanList != null && girlBeanList.size() > 0) {
            mData.addAll(girlBeanList);
            girlListAdapter.notifyDataSetChanged();
        }
    }
}
