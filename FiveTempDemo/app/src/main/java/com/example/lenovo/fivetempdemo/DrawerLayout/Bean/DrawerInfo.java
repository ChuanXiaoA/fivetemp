package com.example.lenovo.fivetempdemo.DrawerLayout.Bean;

/**
 * Created by lenovo on 2018/4/24.
 */

public class DrawerInfo {

    private int img;
    private String name;

    public DrawerInfo(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
