package com.woniuxy.domain;

import java.util.Date;

public class Purchaseorder {
    private Integer poid;

    private Integer pid;
    
    private Purchasedetails purchasedetails;
    
    private Date time;

    public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Purchasedetails getPurchasedetails() {
		return purchasedetails;
	}

	public void setPurchasedetails(Purchasedetails purchasedetails) {
		this.purchasedetails = purchasedetails;
	}

	public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}