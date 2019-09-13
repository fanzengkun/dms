package com.woniuxy.domain;

import java.util.Date;

public class Purchasedetails {
    private Integer pid;

    private Integer poid;

    private Integer mid;

    private Integer pnumber;

    private Date time;

    private Date qualityguaranteperiod;

    private Integer sid;

    private Integer aid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getPnumber() {
        return pnumber;
    }

    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getQualityguaranteperiod() {
        return qualityguaranteperiod;
    }

    public void setQualityguaranteperiod(Date qualityguaranteperiod) {
        this.qualityguaranteperiod = qualityguaranteperiod;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}