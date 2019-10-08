package com.woniuxy.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Page;
import com.woniuxy.service.IPurchaseDetailsService;

@Controller
@RequestMapping("purchaseDetails")
public class PurchaseDetailsController {
	
	//装配service
	@Autowired
	private IPurchaseDetailsService service;
	
	//返回普通分页数据或搜索分页数据
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Page find(@RequestParam Map<String,String> map) {
		
		/* 如订单页展示一样，从页面收到数据统一放到map中，
		 *然后根据selectValue是否有值判断是哪种分页数据：
		 *1.普通分页
		 *2.有条件分页
		 * */
		
		//最终返回的数据
		Page page=new Page();
		
		//页面要展示的行数
		Integer fsize=Integer.valueOf(map.get("pageSize"));
		
		//请求展示的页
		Integer fp=Integer.valueOf(map.get("pageNum"));
		
		if (map.get("selectValue")==null||map.get("selectValue").equals("")//
				||Integer.valueOf(map.get("selectValue"))==0 ) {
			//普通分页，需要调用service进行分页
			page=service.findSomeByPage(fp, fsize);
		}else {
			//有条件分页
			page=service.findByNameOr(map.get("selectValue"), map.get("parameter"), fp, fsize);
		}
		
		return page;
	}
	
	
	//删除订单明细，
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestParam(value = "arr1[]")Integer[]arr1,//
			@RequestParam(value = "arr2[]")Integer[] arr2) {
		
		service.delete(arr1, arr2);
		
	}
}
