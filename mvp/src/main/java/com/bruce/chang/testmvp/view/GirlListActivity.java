package com.bruce.chang.testmvp.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.bruce.chang.testmvp.R;
import com.bruce.chang.testmvp.adapter.GirlListAdapter;
import com.bruce.chang.testmvp.bean.GirlBean;
import com.bruce.chang.testmvp.presenter.GirlPressenterV1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:21:40
 * Author:BruceChang
 * Function:GirlListActivity实现了View的接口，负责显示数据
 */
public class GirlListActivity extends AppCompatActivity implements IGirlView {

    Context mContext;
    ListView lv_list;
    GirlListAdapter girlListAdapter;
    List<GirlBean> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_list);
        mContext = this;
        lv_list = (ListView) findViewById(R.id.lv_list);
        girlListAdapter = new GirlListAdapter(mContext, mData);
        lv_list.setAdapter(girlListAdapter);
        //中间者，让他触发加载数据
        new GirlPressenterV1(this).fetch();

        findViewById(R.id.bt_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GirlListActivity.this, GirlGridActivity.class));
            }
        });
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
