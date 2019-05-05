package com.example.gilang.myselfapp;

public class DailyActivityItem {

    // Save car name.
    private String DailyName;

    // Save car image resource id.
    private int DailyImageId;

    public DailyActivityItem(String DailyName, int DailyImageId) {
        this.DailyName = DailyName;
        this.DailyImageId = DailyImageId;
    }

    public String getDailyName() {
        return DailyName;
    }

    public void setDailyName(String DailyName) {
        this.DailyName = DailyName;
    }

    public int getDailyImageId() {
        return DailyImageId;
    }

    public void setDailyImageId(int DailyImageId) {
        this.DailyImageId = DailyImageId;
    }
}