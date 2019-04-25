package com.java456.dao;

import java.util.List;
import java.util.Map;

import com.java456.entity.DownFenLei;

public interface DownFenLeiDao {
	
	public Integer add(DownFenLei downFenLei);
	
	public Integer  update(DownFenLei downFenLei);
	
	public List<DownFenLei> list(Map<String,Object> map);
	
	public Integer getTotal(Map<String,Object> map);
	
	public Integer delete(Integer id);
	
	public DownFenLei findById(Integer id);
	
	
	
}
