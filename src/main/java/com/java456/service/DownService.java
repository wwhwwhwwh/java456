package com.java456.service;

import java.util.List;
import java.util.Map;
import com.java456.entity.Down;

public interface DownService {
	
	public Integer add(Down down);
	
	public Integer update(Down down);
	
	public List<Down> list(Map<String,Object> map);
	
	public Integer getTotal(Map<String,Object> map);
	
	public Down findById(Integer id);
	
	public Integer delete(Integer id);
	
}
