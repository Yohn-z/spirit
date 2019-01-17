package com.spirit.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class RLiquordesc {
    private String lId;

    @Excel(name = "购入价格",orderNum = "5",suffix = "元")
    private Double ldPrice;

    private Long mId;

    @Excel(name = "购入渠道",orderNum = "9")
    private String ldChannels;

    @Excel(name = "是否密封",replace = {"密封_0","非密封_1"},orderNum = "10")
    private Integer ldSeal;

    private String ldBefore;

    private String ldBack;

    private String ldTop;

    @Excel(name = "入库时间",orderNum = "11",width = 20)
    private String ldAddtime;

    @Excel(name = "备注",orderNum = "12",width = 20)
    private String ldText;

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId == null ? null : lId.trim();
    }

    public Double getLdPrice() {
        return ldPrice;
    }

    public void setLdPrice(Double ldPrice) {
        this.ldPrice = ldPrice;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getLdChannels() {
        return ldChannels;
    }

    public void setLdChannels(String ldChannels) {
        this.ldChannels = ldChannels == null ? null : ldChannels.trim();
    }

    public Integer getLdSeal() {
        return ldSeal;
    }

    public void setLdSeal(Integer ldSeal) {
        this.ldSeal = ldSeal;
    }

    public String getLdBefore() {
        return ldBefore;
    }

    public void setLdBefore(String ldBefore) {
        this.ldBefore = ldBefore == null ? null : ldBefore.trim();
    }

    public String getLdBack() {
        return ldBack;
    }

    public void setLdBack(String ldBack) {
        this.ldBack = ldBack == null ? null : ldBack.trim();
    }

    public String getLdTop() {
        return ldTop;
    }

    public void setLdTop(String ldTop) {
        this.ldTop = ldTop == null ? null : ldTop.trim();
    }

    public String getLdAddtime() {
        return ldAddtime;
    }

    public void setLdAddtime(String ldAddtime) {
        this.ldAddtime = ldAddtime == null ? null : ldAddtime.trim();
    }

    public String getLdText() {
        return ldText;
    }

    public void setLdText(String ldText) {
        this.ldText = ldText == null ? null : ldText.trim();
    }
}