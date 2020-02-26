package com.bw.service;

import java.util.List;


import com.bw.entity.Goods;

public interface AdminService {

	

	List<Goods> list(Goods admin);



	boolean add(Goods add);



}
