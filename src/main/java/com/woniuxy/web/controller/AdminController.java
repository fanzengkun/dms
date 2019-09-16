package com.woniuxy.web.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Admin;
import com.woniuxy.service.IAdminService;

@Controller
@RequestMapping("admins")
public class AdminController {

	
	@Autowired
	private IAdminService service;
	
	
	@PostMapping
	@ResponseBody
	public String insert (Admin admin) {//增加
		
		admin.setAname("韩聪聪");
		System.out.println("我到这里了");
		service.save(admin);
		
		return "ok";
	}
	
	
	@DeleteMapping
	@ResponseBody
	public String delete(Integer aid) {
		
		
		service.delete(1);
		
		return "delete";
	}
	
	
	@GetMapping
	@ResponseBody
	public List<Admin> findAll(){
		
		System.out.println(service.findAll());
		
		return service.findAll();
	}
	
	@PatchMapping
	@ResponseBody
	public Admin findOne(Integer aid){
		
		return service.findOne(aid);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
