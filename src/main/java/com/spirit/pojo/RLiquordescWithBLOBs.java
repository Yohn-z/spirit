package com.spirit.pojo;

public class RLiquordescWithBLOBs extends RLiquordesc {
    private String ldChannels;

    private String ldText;

    public String getLdChannels() {
        return ldChannels;
    }

    public void setLdChannels(String ldChannels) {
        this.ldChannels = ldChannels == null ? null : ldChannels.trim();
    }

    public String getLdText() {
        return ldText;
    }

    public void setLdText(String ldText) {
        this.ldText = ldText == null ? null : ldText.trim();
    }
}