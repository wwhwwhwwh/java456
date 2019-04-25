package com.java456.entity;

import java.util.Date;


/**
 * ±¸ÍüÂ¼
 */
public class Memo {
	
	public Integer id;
	private String  title;
	private String content;
	private Integer memoFenLeiId;
	
	private Integer orderNo;
	private Integer createUserId;
	private Date createDateTime;
	private Date updateDateTime;
	
	//////////////////////
	private User createUser;
	private MemoFenLei memoFenLei;
	//////////////////////
	
	
	
	public Integer getId() {
		return id;
	}



	public Integer getMemoFenLeiId() {
		return memoFenLeiId;
	}



	public void setMemoFenLeiId(Integer memoFenLeiId) {
		this.memoFenLeiId = memoFenLeiId;
	}



	public MemoFenLei getMemoFenLei() {
		return memoFenLei;
	}



	public void setMemoFenLei(MemoFenLei memoFenLei) {
		this.memoFenLei = memoFenLei;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Integer getOrderNo() {
		return orderNo;
	}



	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}



	public Integer getCreateUserId() {
		return createUserId;
	}



	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}



	public Date getCreateDateTime() {
		return createDateTime;
	}



	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}



	public Date getUpdateDateTime() {
		return updateDateTime;
	}



	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}



	public User getCreateUser() {
		return createUser;
	}



	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}
	
	
	
	
	
	
	
	
}
