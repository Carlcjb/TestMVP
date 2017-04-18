package com.bruce.chang.mvpyouhua.bean;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:21:39
 * Author:BruceChang
 * Function:
 */

public class GirlBean {


    private String imageUrl;
    private String name;
    private String description;

    public GirlBean(String imageUrl, String name, String description) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
