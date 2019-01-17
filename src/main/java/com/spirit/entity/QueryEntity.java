package com.spirit.entity;

import java.io.Serializable;

public class QueryEntity implements Serializable {

    //名称
    private String name;

    //年份
    private String year;

    //厂商Id
    private long mId;

    //香型
    private long oId;

    //是否密封
    private int isSeal;

    //容量下限
    private int minCapacity;

    //容量上限
    private int maxCapacity;

    //酒精度下限
    private double minDegrees;

    //酒精度上限
    private double maxDegrees;

    //价格下限
    private double minPrice;

    //价格上限
    private double maxPrice;

    //生产日期下限
    private String minTime;

    //生产日期上限
    private String maxTime;

    //重量下限
    private int minWeight;

    //重量下限
    private int maxWeight;

    public int getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getmId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

    public long getoId() {
        return oId;
    }

    public void setoId(long oId) {
        this.oId = oId;
    }

    public int getIsSeal() {
        return isSeal;
    }

    public void setIsSeal(int isSeal) {
        this.isSeal = isSeal;
    }

    public int getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getMinDegrees() {
        return minDegrees;
    }

    public void setMinDegrees(double minDegrees) {
        this.minDegrees = minDegrees;
    }

    public double getMaxDegrees() {
        return maxDegrees;
    }

    public void setMaxDegrees(double maxDegrees) {
        this.maxDegrees = maxDegrees;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getMinTime() {
        return minTime;
    }

    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public QueryEntity() {

        this.isSeal = 3;
    }
}
