package com.spirit.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;


public class InpmrtEntity {

    @Excel(name = "序号")
    private int id;

    @Excel(name = "品牌")
    private String brand;

    @Excel(name = "名称")
    private String name;

    @Excel(name = "数量")
    private int num;

    @Excel(name = "容量")
    private int rl;

    @Excel(name = "酒精度")
    private double degress;

    @Excel(name = "日期")
    private String date;

    @Excel(name = "香型")
    private String odort;


    public void setRl(int rl) {
        this.rl = rl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getDegress() {
        return degress;
    }

    public void setDegress(double degress) {
        this.degress = degress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOdort() {
        return odort;
    }

    public void setOdort(String odort) {
        this.odort = odort;
    }
}
