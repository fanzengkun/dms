package com.woniuxy.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.PurchaseorderMapper;
import com.woniuxy.domain.Page;
import com.woniuxy.domain.Purchasedetails;
import com.woniuxy.domain.Purchaseorder;
import com.woniuxy.domain.PurchaseorderExample;
import com.woniuxy.service.IPurchaseOrderService;

//进货订单
/*
 * 使用这个注解的类或者方法表示该类里面的所有方法或者这个方法的事务由spring处理，
 *来保证事务的原子性，即是方法里面对数据库操作，如果失败则spring负责回滚操作，
 *成功则提交操作。
 * 	@Transactional 可以作用于接口、接口方法、类以及类方法上。当作用于类上时，
 *该类的所有 public 方法将都具有该类型的事务属性。
 * */
@Service
@Transactional
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {

	@Autowired
	private PurchaseorderMapper pomapper;
	
	@Override
	public List<Object> find() {
		return pomapper.findpoAndpd();
	}

	@Override
	public void delByPoid(Integer []array) {
		pomapper.close();
		for (Integer poid : array) {
			pomapper.delByPoid(poid);
		}
		pomapper.open();
	}

	@Override
	public void saveTopo(Purchaseorder po) {
		pomapper.saveTopo(po);
	}

	@Override
	public void saveTopd(Integer count,Purchasedetails pd) {
		//先查最后一次操作的订单号，额，只能根据自增的最大值来返回了
		Integer poid=pomapper.findMaxpoid();
		pd.setPoid(poid);
		pomapper.saveTopd(pd);
	}

	@Override
	public void saveDate(Purchasedetails pd) {
		Integer poid=pomapper.findMaxpoid();
		pd.setPoid(poid);
		pomapper.saveDate(pd);
	}
	
	@Override
	public Page findSomeByPage(Integer fp, Integer fsize) {
		Integer rowC=pomapper.getRowCount();
		Page page=new Page(fp, rowC, fsize);
		List<Purchasedetails> list = pomapper.findSomeByPage(page.getStartLine(), fsize);
		page.setList(list);
		return page;
	}

	@Override
	public Page findByNameOr(String selectValue, String criteria,Integer fp, Integer fsize) {
		
		/*
		 *  到这里就是去判断搜索的字段和关键字，分两种情况
		 *X:value为1时搜时间
		 *Y:value为2时搜poid
		 *
		 **/
		Integer count=null;
		List<Purchasedetails> pdlist=null;
		Page page=null;
		
		Integer sv=Integer.valueOf(selectValue);
		if (sv==1) {
			//总行数
			count=pomapper.getRowCountBySeachTime(criteria);
			page=new Page(fp, count, fsize);
			//数据
			pdlist=pomapper.findSomeBySeachTime(criteria, page.getStartLine(), fsize);
		}
		if (sv==2) {
			count = pomapper.getRowCountBySeachId(criteria);
			page=new Page(fp, count, fsize);
			pdlist=pomapper.findSomeBySeachId(criteria, page.getStartLine(), fsize);
		}
		
		page.setList(pdlist);
		return page;
	}
}
