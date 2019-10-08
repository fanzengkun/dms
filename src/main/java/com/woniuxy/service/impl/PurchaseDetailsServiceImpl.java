package com.woniuxy.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.fabric.xmlrpc.base.Array;
import com.woniuxy.dao.PurchasedetailsMapper;
import com.woniuxy.domain.Page;
import com.woniuxy.domain.Purchasedetails;
import com.woniuxy.service.IPurchaseDetailsService;


//订单明细
@Service
@Transactional
public class PurchaseDetailsServiceImpl implements IPurchaseDetailsService {

	@Autowired
	private PurchasedetailsMapper mapper;

	@Override
	public Page findSomeByPage(Integer fp, Integer fsize) {
		//首先需要查询总行数
		Integer rowCount = mapper.getRowCount();
		//再去初始化一个page，就可以根据page得到起始行
		Page page=new Page(fp, rowCount, fsize);
		//现在去求分页数据，并返回
		List<Purchasedetails> list = mapper.findSomeByPage(page.getStartLine(), fsize);
		page.setList(list);
		return page;
	}

	@Override
	public Page findByNameOr(String selectValue, String criteria, Integer fp, Integer fsize) {
		
		Integer sv=Integer.valueOf(selectValue);
		Purchasedetails pd=new Purchasedetails();
		Page page=new Page();
		
		//要将条件根据sv分为7种对应赋值
		switch (sv) {
		
		case 1:
			pd.setPid(Integer.valueOf(criteria));
			Integer frowCount=mapper.getRowCountBySome(pd);
			page=new Page(fp, frowCount, fsize);
			List<Purchasedetails> list = mapper.findSomeBySome(pd, page.getStartLine(), fsize);
			page.setList(list);
			break;
		
		case 2:
			pd.setPoid(Integer.valueOf(criteria));
			Integer frowCount1=mapper.getRowCountBySome(pd);
			page=new Page(fp, frowCount1, fsize);
			List<Purchasedetails> list2 = mapper.findSomeBySome(pd, page.getStartLine(), fsize);
			page.setList(list2);
			break;
			
		case 3:
			pd.setSid(Integer.valueOf(criteria));
			page=new Page(fp, mapper.getRowCountBySome(pd), fsize);
			page.setList(mapper.findSomeBySome(pd, page.getStartLine(), fsize));
			break;
			
		case 4:
			pd.setMid(Integer.valueOf(criteria));
			page=new Page(fp, mapper.getRowCountBySome(pd), fsize);
			page.setList(mapper.findSomeBySome(pd, page.getStartLine(), fsize));
			break;
			
		case 5:
			pd.setPnumber(Integer.valueOf(criteria));
			page=new Page(fp, mapper.getRowCountBySome(pd), fsize);
			page.setList(mapper.findSomeBySome(pd, page.getStartLine(), fsize));
			break;
			
		case 6:
			page=new Page(fp, mapper.getRowCountByTime(criteria), fsize);
			page.setList(mapper.findSomeByTime(criteria, page.getStartLine(), fsize));
			break;
			
		case 7:
			page=new Page(fp, mapper.getRowCountByQualityguaranteperiod(criteria), fsize);
			page.setList(mapper.findSomeByQualityguaranteperiod(criteria, page.getStartLine(), fsize));
			break;
			
		}
		return page;
	}
	
	
	@Override
	public void delete(Integer[] arr1,Integer[] arr2) {
		/* 
		 * arr1是订单编号pid，arr2是订单明细编号poid,删除完成后要判断此订单内还有没有订单明细，
		 *没有的话就要删除订单
		 * */
		for (Integer pid : arr2) {
			mapper.deleteByPrimaryKey(pid);	
		}
		for (Integer poid : arr1) {
			if (mapper.findpdondo(poid)==0) {
				mapper.delpo(poid);
			}
		}
		
	}

}
