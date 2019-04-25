package com.java456.entity;

import org.apache.xmlbeans.SchemaStringEnumEntry;

public class Config {
	
	private Integer id;
	private String web_name;//网站名称
	private String station_name;//公司名称
	
	private String web_site;//网址   http://www.baiduc.com
	
	private String headStr;//head头里面的东西     1=高速模式  2=jq  3=网站小图标
	private String layuiStr;//layui 版本
	private String tongjiStr;//统计代码  统计访问的代码
	
	private String houtai_logo;//后台logo 200*60
	private String gzh;//公众号二维码
	private String geren_erweima;//个人 二维码
	
	
	private String logo;//导航左边的logo图片
	
	private String index_page_title;//首页  标题
	private String index_page_keywords;//首页 关键词
	private String index_page_description;//首页  描述 摘要
	
	private String beian_;//备案信息
	private Integer banben;//记录这个软件 的版本号,根据不同的版本 更新不同的功能。 以后做更新的详细记录步骤
	
	private String food_info;//页面底部内容
	
	private String nav_str;//导航 字符串  导航内容
	
	
	public String getNav_str() {
		return nav_str;
	}
	public void setNav_str(String nav_str) {
		this.nav_str = nav_str;
	}
	public String getFood_info() {
		return food_info;
	}
	public void setFood_info(String food_info) {
		this.food_info = food_info;
	}
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getGeren_erweima() {
		return geren_erweima;
	}
	public void setGeren_erweima(String geren_erweima) {
		this.geren_erweima = geren_erweima;
	}
	public String getBeian_() {
		return beian_;
	}
	public void setBeian_(String beian_) {
		this.beian_ = beian_;
	}

	public String getIndex_page_title() {
		return index_page_title;
	}

	public void setIndex_page_title(String index_page_title) {
		this.index_page_title = index_page_title;
	}

	public String getIndex_page_keywords() {
		return index_page_keywords;
	}

	public void setIndex_page_keywords(String index_page_keywords) {
		this.index_page_keywords = index_page_keywords;
	}

	public String getIndex_page_description() {
		return index_page_description;
	}

	public void setIndex_page_description(String index_page_description) {
		this.index_page_description = index_page_description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWeb_name() {
		return web_name;
	}

	public void setWeb_name(String web_name) {
		this.web_name = web_name;
	}

	public String getStation_name() {
		return station_name;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	public String getWeb_site() {
		return web_site;
	}

	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}

	public String getHeadStr() {
		return headStr;
	}

	public void setHeadStr(String headStr) {
		this.headStr = headStr;
	}

	public String getLayuiStr() {
		return layuiStr;
	}

	public void setLayuiStr(String layuiStr) {
		this.layuiStr = layuiStr;
	}

	public String getHoutai_logo() {
		return houtai_logo;
	}

	public void setHoutai_logo(String houtai_logo) {
		this.houtai_logo = houtai_logo;
	}

	public String getGzh() {
		return gzh;
	}

	public void setGzh(String gzh) {
		this.gzh = gzh;
	}

	public String getTongjiStr() {
		return tongjiStr;
	}

	public void setTongjiStr(String tongjiStr) {
		this.tongjiStr = tongjiStr;
	}
	public Integer getBanben() {
		return banben;
	}
	public void setBanben(Integer banben) {
		this.banben = banben;
	}
	
	
	
}
