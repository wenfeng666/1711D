package com.bw.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.AdminDao;

import com.bw.entity.Goods;
import com.bw.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {

	
	
	@Autowired
	AdminDao admindao;
	
	@Override
	public List<Goods> list(Goods admin) {
		// TODO Auto-generated method stub
		return admindao.list(admin);
	}



	@Override
	public boolean add(Goods add) {
		// TODO Auto-generated method stub
		return admindao.add(add);
	}

	

	
}
