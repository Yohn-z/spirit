package com.spirit.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class RLiquorCustom extends RLiquor{

    @Excel(name = "香型",orderNum = "2",width = 16)
    private String oText;

    @Excel(name = "厂商名称",orderNum = "8",width = 20)
    private String mName;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getoText() {
        return oText;
    }

    public void setoText(String oText) {
        this.oText = oText;
    }
}