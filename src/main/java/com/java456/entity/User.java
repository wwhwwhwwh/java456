package com.java456.entity;

import java.util.Date;

/**
 * 
 * 关于用户 显示菜单的思路，菜单传到前台之前 应该过虑一边。
 * 拿到用户的treeMenusIds然后过虑一下，
 */
public class User {
	private Integer id;
	private String name;//帐号
	private String password;//密码
	private Date createDateTime;
	
	private String menuIds;
	private String remark;//备注
	private String trueName;//真实姓名
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getMenuIds() {
		return menuIds;
	}
	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	
	
}
