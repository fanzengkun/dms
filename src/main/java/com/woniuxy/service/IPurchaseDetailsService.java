package com.woniuxy.service;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.Purchasedetails;

public interface IPurchaseDetailsService {
	public Page findSomeByPage(Integer fp,Integer fsize);
	public Page findByNameOr(String selectValue, String criteria,Integer fp, Integer fsize);
	public void delete(Integer[] arr1,Integer[] arr2);
}
