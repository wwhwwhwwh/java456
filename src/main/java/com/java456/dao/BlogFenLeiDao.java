package com.java456.dao;

import java.util.List;
import java.util.Map;
import com.java456.entity.BlogFenLei;



public interface BlogFenLeiDao {
	
	public Integer add(BlogFenLei blogFenLei);
	
	public Integer  update(BlogFenLei blogFenLei);
	
	public List<BlogFenLei> list(Map<String,Object> map);
	
	public Integer getTotal(Map<String,Object> map);
	
	public Integer delete(Integer id);
	
	public BlogFenLei findById(Integer id);
	
}
