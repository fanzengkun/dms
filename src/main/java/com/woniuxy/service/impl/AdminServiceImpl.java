package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.AdminMapper;
import com.woniuxy.domain.Admin;
import com.woniuxy.service.IAdminService;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	private AdminMapper mapper;

	@Override
	public void save(Admin admin) {
		mapper.insert(admin);
		
	}

	@Override
	public void delete(Integer aid) {
		mapper.deleteByPrimaryKey(aid);
	}

	@Override
	public void update(Admin admin) {
		mapper.updateByPrimaryKey(admin);
	}

	@Override
	public List<Admin> findAll() {
		
		return mapper.selectByExample(null);
	}

	@Override
	public Admin findOne(Integer aid) {
		return mapper.selectByPrimaryKey(aid);
		
	}


	
}
