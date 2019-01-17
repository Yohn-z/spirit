package com.spirit.pojo;

public class ROdortype {
    private Long oId;

    private String oText;

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public String getoText() {
        return oText;
    }

    public void setoText(String oText) {
        this.oText = oText == null ? null : oText.trim();
    }
}