package com.spirit.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class RLiquor extends RLiquordesc{

    @Excel(name = "编号",orderNum = "0",width = 20)
    private String lId;

    @Excel(name = "名称",orderNum = "1",width = 20)
    private String lName;

    private Long oId;

    @Excel(name = "酒精度",suffix = "度",orderNum = "3")
    private double lDegrees;

    @Excel(name = "容量",suffix = "ml",orderNum = "4")
    private Integer lCapacity;

    @Excel(name = "重量",suffix = "克",orderNum = "5")
    private Integer lWeight;

    @Excel(name = "数量",suffix = "瓶",orderNum = "6")
    private Integer lNum;

    @Excel(name = "生产日期",orderNum = "7",width = 15)
    private String lProducedtime;

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId == null ? null : lId.trim();
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName == null ? null : lName.trim();
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public double getlDegrees() {
        return lDegrees;
    }

    public void setlDegrees(double lDegrees) {
        this.lDegrees = lDegrees;
    }

    public Integer getlCapacity() {
        return lCapacity;
    }

    public void setlCapacity(Integer lCapacity) {
        this.lCapacity = lCapacity;
    }

    public Integer getlWeight() {
        return lWeight;
    }

    public void setlWeight(Integer lWeight) {
        this.lWeight = lWeight;
    }

    public Integer getlNum() {
        return lNum;
    }

    public void setlNum(Integer lNum) {
        this.lNum = lNum;
    }

    public String getlProducedtime() {
        return lProducedtime;
    }

    public void setlProducedtime(String lProducedtime) {
        this.lProducedtime = lProducedtime == null ? null : lProducedtime.trim();
    }
}