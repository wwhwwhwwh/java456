package com.java456.service;

import java.util.List;
import java.util.Map;
import com.java456.entity.LunBo;

public interface LunBoService {
	
	

	public Integer add(LunBo lunbo);
	
	public Integer update(LunBo lunbo);
	
	public List<LunBo> list(Map<String,Object> map);
	
	public List<LunBo> index_list();
	
	public Integer getTotal(Map<String,Object> map);
	
	public LunBo findById(Integer id);
	
	public Integer delete(Integer id);
	
	
}
