package com.java456.service;

import com.java456.entity.Config;

public interface ConfigService {
	
	public Integer update(Config config);
	
	public Config findById(Integer id);
	
}
