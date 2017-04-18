package com.bruce.chang.testmvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bruce.chang.testmvp.bean.GirlBean;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:22:18
 * Author:BruceChang
 * Function:
 */

public class GirlGridAdapter extends BaseAdapter {

    private Context mContext;
    private List<GirlBean> mData;

    public GirlGridAdapter(Context mContext, List<GirlBean> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.adapter_girl_grid, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        GirlBean girlBean = mData.get(i);
        Glide.with(mContext)
                .load(girlBean.getImageUrl())
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .into(viewHolder.iv_logo);
        viewHolder.tv_name.setText(girlBean.getName());
        viewHolder.tv_desc.setText(girlBean.getDescription());
        return view;
    }


    public class ViewHolder {
        ImageView iv_logo;
        TextView tv_name;
        TextView tv_desc;

        public ViewHolder(View view) {
            iv_logo = (ImageView) view.findViewById(R.id.iv_logo);
            tv_name = (TextView) view.findViewById(R.id.tv_name);
            tv_desc = (TextView) view.findViewById(R.id.tv_desc);
        }
    }
}
