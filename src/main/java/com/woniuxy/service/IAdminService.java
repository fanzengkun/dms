package com.woniuxy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.domain.Admin;
import com.woniuxy.domain.AdminExample;

public interface IAdminService {
	
		void save(Admin admin);
		void delete(Integer aid);
		void update(Admin admin);
		List<Admin> findAll();
		Admin findOne(Integer aid);
 }
