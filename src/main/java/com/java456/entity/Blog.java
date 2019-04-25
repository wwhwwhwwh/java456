package com.java456.entity;

import java.util.Date;

public class Blog {
	
	private Integer id;//id
	private String title;//����
	private String content;//����
	private String contentNoTag;//û�б�ǩ ������
	private String summary;//ժҪ
	
	private String thumbnail_image;//����ͼ
	
	private String keywords;//����-�ؼ���
	private String description_;//����-����
	
	private Integer clickHit; //�鿴����
	private Integer replyHit; //�ظ�����
	
	private  Integer  display_mode;//չʾģʽ  ��ͬ��ģʽ ҳ�治ͬ
	private String url;
	
	private Integer createUserId;//������id
	private Integer blogFenLeiId;//����id
	
	private Integer isUse;//�Ƿ���ʾ 
	private Date createDateTime;//����ʱ��
	private Date updateDateTime;//�޸�ʱ��
	
	//////////////////////////
	private User createUser;
	private BlogFenLei blogFenLei;
	//////////////////////////
	
	
	
	public Integer getId() {
		return id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getDisplay_mode() {
		return display_mode;
	}
	public void setDisplay_mode(Integer display_mode) {
		this.display_mode = display_mode;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getThumbnail_image() {
		return thumbnail_image;
	}
	public void setThumbnail_image(String thumbnail_image) {
		this.thumbnail_image = thumbnail_image;
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
	public String getContentNoTag() {
		return contentNoTag;
	}
	public void setContentNoTag(String contentNoTag) {
		this.contentNoTag = contentNoTag;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription_() {
		return description_;
	}
	public void setDescription_(String description_) {
		this.description_ = description_;
	}
	public Integer getClickHit() {
		return clickHit;
	}
	public void setClickHit(Integer clickHit) {
		this.clickHit = clickHit;
	}
	public Integer getReplyHit() {
		return replyHit;
	}
	public void setReplyHit(Integer replyHit) {
		this.replyHit = replyHit;
	}
	public Integer getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}
	
	
	
	public Integer getBlogFenLeiId() {
		return blogFenLeiId;
	}
	public void setBlogFenLeiId(Integer blogFenLeiId) {
		this.blogFenLeiId = blogFenLeiId;
	}
	public Integer getIsUse() {
		return isUse;
	}
	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
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
	public BlogFenLei getBlogFenLei() {
		return blogFenLei;
	}
	public void setBlogFenLei(BlogFenLei blogFenLei) {
		this.blogFenLei = blogFenLei;
	}
	
	
	
	
	
}
