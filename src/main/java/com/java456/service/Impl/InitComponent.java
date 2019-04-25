package com.java456.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.java456.entity.Config;
import com.java456.entity.Link;
import com.java456.service.ConfigService;
import com.java456.service.LinkService;


@Component
public class InitComponent implements ServletContextListener,ApplicationContextAware{
	
	private static ApplicationContext applicationContext;
	
	
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext application=sce.getServletContext();
		
		ConfigService configService=(ConfigService) applicationContext.getBean("configService");
		LinkService linkService=(LinkService) applicationContext.getBean("linkService");
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isUse", 1);
		List<Link> linkList = linkService.list(map );
		//友情 链接  保存到 缓存中
		application.setAttribute("linkList", linkList);
		
		
		Config config = configService.findById(1);
		//保存到 缓存中
		application.setAttribute("config", config);
		
		
		
	}
	
	
	
	public void contextDestroyed(ServletContextEvent sce) {
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}

}
