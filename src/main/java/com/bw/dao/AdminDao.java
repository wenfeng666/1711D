package com.bw.dao;

import java.util.List;

import com.bw.entity.Goods;



public interface AdminDao {

	

	List<Goods> list(Goods admin);



	boolean add(Goods add);

}
