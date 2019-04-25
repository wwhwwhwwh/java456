package com.java456.service.Impl;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import com.java456.dao.ConfigDao;
import com.java456.entity.Config;
import com.java456.service.ConfigService;



@Service("configService")
public class ConfigServiceImpl implements ConfigService {
	
	@Resource
	private ConfigDao configDao;
	
	
	public Integer update(Config config) {
		int i =  configDao.update(config);
		config = configDao.findById(1);
		//Ë¢ÐÂ»º´æ
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();  
        ServletContext servletContext = webApplicationContext.getServletContext(); 
        servletContext.setAttribute("config", config);
		return i ;
	}
	
	
	public Config findById(Integer id) {
		return configDao.findById(id);
	}
	
}
