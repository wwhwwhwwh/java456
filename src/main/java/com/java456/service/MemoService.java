package com.java456.service;

import java.util.List;
import java.util.Map;
import com.java456.entity.Memo;

public interface MemoService {
	
	
	
	public Integer add(Memo memo);
	
	public Integer update(Memo memo);
	
	public List<Memo> list(Map<String,Object> map);
	
	public Integer getTotal(Map<String,Object> map);
	
	public Memo findById(Integer id);
	
	public Integer delete(Integer id);
	
}	
