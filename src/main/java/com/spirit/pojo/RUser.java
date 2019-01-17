package com.spirit.pojo;

public class RUser {
    private Long uId;

    private String uName;

    private String uPass;

    private Integer uRole;

    private Integer uStatus;

    private String uCreatTime;

    private String uLastTime;

    private String uIp;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass == null ? null : uPass.trim();
    }

    public Integer getuRole() {
        return uRole;
    }

    public void setuRole(Integer uRole) {
        this.uRole = uRole;
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public String getuCreatTime() {
        return uCreatTime;
    }

    public void setuCreatTime(String uCreatTime) {
        this.uCreatTime = uCreatTime == null ? null : uCreatTime.trim();
    }

    public String getuLastTime() {
        return uLastTime;
    }

    public void setuLastTime(String uLastTime) {
        this.uLastTime = uLastTime == null ? null : uLastTime.trim();
    }

    public String getuIp() {
        return uIp;
    }

    public void setuIp(String uIp) {
        this.uIp = uIp == null ? null : uIp.trim();
    }
}