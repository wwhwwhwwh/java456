package com.java456.dao;

import com.java456.entity.Config;

public interface ConfigDao {
	
	public Integer update(Config config);
	
	public Config findById(Integer id);
}
