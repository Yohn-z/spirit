package com.spirit.entity;

public class BaseParamEntity {


    private int totalTypesNum;

    private double TotalAssets;

    private double TotalLitre;

    private int TotalVaseNum;

    public int getTotalTypesNum() {
        return totalTypesNum;
    }

    public void setTotalTypesNum(int totalTypesNum) {
        this.totalTypesNum = totalTypesNum;
    }

    public double getTotalAssets() {
        return TotalAssets;
    }

    public void setTotalAssets(double totalAssets) {
        TotalAssets = totalAssets;
    }

    public double getTotalLitre() {
        return TotalLitre;
    }

    public void setTotalLitre(double totalLitre) {
        TotalLitre = totalLitre;
    }

    public int getTotalVaseNum() {
        return TotalVaseNum;
    }

    public void setTotalVaseNum(int totalVaseNum) {
        TotalVaseNum = totalVaseNum;
    }

    public BaseParamEntity(int totalTypesNum, double totalAssets, double totalLitre, int totalVaseNum) {
        this.totalTypesNum = totalTypesNum;
        TotalAssets = totalAssets;
        TotalLitre = totalLitre;
        TotalVaseNum = totalVaseNum;
    }
}
