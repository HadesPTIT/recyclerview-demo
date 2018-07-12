package com.framgia.recyclerviewdemo;

public class Hero {

    private int mIds;
    private String mName;

    public Hero() {
    }

    public Hero(int ids, String name) {
        mIds = ids;
        mName = name;
    }

    public int getIds() {
        return mIds;
    }

    public void setIds(int ids) {
        mIds = ids;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
