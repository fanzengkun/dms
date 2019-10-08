package com.woniuxy.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.Purchasedetails;
import com.woniuxy.domain.Purchaseorder;
import com.woniuxy.service.IPurchaseOrderService;

@Controller
@RequestMapping("purchaseOrdes")
public class PurchaseOrderController {
	
	static Map<String, Integer>cmap=new HashMap<String, Integer>();
	static List<Map> countlist=new ArrayList<Map>();
	static Integer count=0;
	
	@Autowired
	private IPurchaseOrderService poservice;
	
	//分页展示订单表以及明细表中订单时间
	/*
	 * Bug!!!!:
	 *  前端网页展示的时间与表中的时间不符，handler返回时是正确的，但展示是天数总是-1，
	 * 考虑使用过滤器，但是使用vue过滤器的前提是数据必须是绑定的插值表达式，但是我用
	 * 的是element-ui的展示方法，暂时就这样，有时间改，没有就算了 
	 * 
	 * */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Page findSomeByPage(@RequestParam Map<String,String> map) {
		
		Page p=new Page();
		
		Integer fsize=Integer.valueOf(map.get("pageSize"));
		Integer fp=Integer.valueOf(map.get("pageNum"));
		
		//无搜索条件分页
		if (map.get("selectValue")==null||map.get("selectValue").equals("")//
				||Integer.valueOf(map.get("selectValue"))==0) {
			p=poservice.findSomeByPage(fp, fsize);
		}else{
			//按搜索条件分页
			p = poservice.findByNameOr(map.get("selectValue"), map.get("parameter"),fp,fsize);
		}
		return p;
	}
	
	
	
	//根据poid集合删除主表和外表一或多数据
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public void delByPoid(@RequestParam(value="array[]") Integer[] array,//
			@RequestParam(value="_method") String _method) {
		
			poservice.delByPoid(array);
			
	}
	
	
	
	//返回'第x条明细'
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public List<Map> reshow() {
		if(cmap.isEmpty()==false) {
			cmap.clear();
		}
		cmap.put("count", count);
		countlist.add(cmap);
		return countlist;
	}
	
	
	
	//接受前端发来的数据，进行入库
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public void save(@RequestParam Map<String,String> map ) {
		
		Purchaseorder po=new Purchaseorder();
		Purchasedetails pd=new Purchasedetails();
		
		Boolean mapNotNull = false;
		
		String ftime="";
		if(map.size()==2) {
			SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd");
			Date time=new Date();
			for (String key : map.keySet()) {
				if ("time".equals(key)) {
					ftime=map.get(key);
				}
			}
			try {
				time=sdf0.parse(ftime);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//将时间插入到明细表中，先放入对象中
			pd.setTime(time);
			poservice.saveDate(pd);
			count=0;
		}else {
			mapNotNull = true;
		}
		
		//与前端发来的同名String，后面要对应获取并转型
		String fmid="";
		String fpnumber="";
		String fqualityGuarantePeriod="";
		String fsid="";
		
		if (mapNotNull==true&&count==0) {
			//订单编号只要自增一次，因为是一次添加订单
			poservice.saveTopo(po);
		}
		
		//遍历浏览器传来的数据，找到count判断是否大于零，再为pd赋值
		if(map.isEmpty()==false&&mapNotNull==true&&map.size()>2) {
			for(String key : map.keySet()){
			    if ("mid".equals(key)) {
			    	fmid=map.get(key);
				}
			    if ("pnumber".equals(key)) {
			    	fpnumber=map.get(key);
				}
			    if ("qualityGuarantePeriod".equals(key)) {
			    	fqualityGuarantePeriod=map.get(key);
				}
			    if ("sid".equals(key)) {
			    	fsid=map.get(key);
				}
			}
			
			//fmid转为Integer
			Integer pdmid=Integer.valueOf(fmid);
			
			//fpnumber转为Integer
			Integer pdpunmber=Integer.valueOf(fpnumber);
			
			//fqualityGuarantePeriod转为Date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date pdqualityGuarantePeriod=new Date();
			try {
				pdqualityGuarantePeriod=sdf.parse(fqualityGuarantePeriod);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			//fsid转为Integer
			Integer pdsid=Integer.valueOf(fsid);
			
			//setter到pd对象
			pd.setMid(pdmid);
			pd.setPnumber(pdpunmber);
			pd.setQualityguaranteperiod(pdqualityGuarantePeriod);
			pd.setSid(pdsid);
			
			/*
			 *  保证返回的count对应的就是第几条明细，这个是在上个handler在除第一次返回之前修改的
			 *但是如果关闭网页的话会怎么样，额，值还是最后一次修改后的值，而非初始值0，暂时不考虑
			 *用户会关闭网页，
			 * 假设用户会正常添加好明细，然后提交订单，所以要在用户提交后把count初始化为0，也就是
			 *在提交订单handler中赋值。
			 * */
			count++;
		}
		
		//此时要将pd入库，并且在service中为pd set一个poid
		if (mapNotNull==true&&map.size()>2) {
			poservice.saveTopd(count, pd);
		}
	}
	
}
