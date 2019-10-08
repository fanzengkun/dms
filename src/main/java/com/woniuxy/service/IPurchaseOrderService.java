package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.Purchasedetails;
import com.woniuxy.domain.Purchaseorder;

public interface IPurchaseOrderService {
	
	public List<Object> find();
	public Page findSomeByPage(Integer fp,Integer fsize);
	public Page findByNameOr(String selectValue, String criteria,Integer fp, Integer fsize);
	public void delByPoid(Integer []array);
	public void saveTopo(Purchaseorder po);
	public void saveTopd(Integer count,Purchasedetails pd);
	public void saveDate(Purchasedetails pd);
}
