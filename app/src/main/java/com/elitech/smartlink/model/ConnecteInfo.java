package com.elitech.smartlink.model;

/**
 * @Description: TODO
 * <p/>
 * Created by gaoxiaohui on 15-12-31.
 */
public class ConnecteInfo {
    private String name;
    private int imgUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public ConnecteInfo(){}

    public ConnecteInfo(String name,int imgUrl){
        this.name = name;
        this.imgUrl = imgUrl;
    }
}
