package com.woniuxy.domain;

import java.util.Date;

public class Medicinetype {
    private Integer mtid;

    private String mtname;

    private Date createtime;

    private String mtdescribe;

    public Integer getMtid() {
        return mtid;
    }

    public void setMtid(Integer mtid) {
        this.mtid = mtid;
    }

    public String getMtname() {
        return mtname;
    }

    public void setMtname(String mtname) {
        this.mtname = mtname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMtdescribe() {
        return mtdescribe;
    }

    public void setMtdescribe(String mtdescribe) {
        this.mtdescribe = mtdescribe;
    }
}