package com.woniuxy.domain;

public class Medicine {
    private Integer mid;

    private Integer pid;

    private String mname;

    private Integer restquantity;

    private Integer demandquantity;

    private Integer mtid;

    private String mdescribe;

    private String maddress;

    private String coding;

    private Double mprice;

    private Integer sid;

    private String photo;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getRestquantity() {
        return restquantity;
    }

    public void setRestquantity(Integer restquantity) {
        this.restquantity = restquantity;
    }

    public Integer getDemandquantity() {
        return demandquantity;
    }

    public void setDemandquantity(Integer demandquantity) {
        this.demandquantity = demandquantity;
    }

    public Integer getMtid() {
        return mtid;
    }

    public void setMtid(Integer mtid) {
        this.mtid = mtid;
    }

    public String getMdescribe() {
        return mdescribe;
    }

    public void setMdescribe(String mdescribe) {
        this.mdescribe = mdescribe;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public Double getMprice() {
        return mprice;
    }

    public void setMprice(Double mprice) {
        this.mprice = mprice;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}