package com.java456.dao;

import java.util.List;
import java.util.Map;
import com.java456.entity.MemoFenLei;

public interface MemoFenLeiDao {
	
	
	public Integer add(MemoFenLei fenlei);
	
	public Integer  update(MemoFenLei fenlei);
	
	public List<MemoFenLei> list(Map<String,Object> map);
	
	public Integer getTotal(Map<String,Object> map);
	
	public Integer delete(Integer id);
	
	public MemoFenLei findById(Integer id);
	
	
}
