package com.model;

import java.util.Date;

public class OrderHistory {
	
	private String id;
	private String orderid;
	private String orderState;  
	private String userId; 
	private String errorCode;
	private Date updateDate;  
	private String orderNo; 
	private String orderVer;
	private Date orderCreationDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderVer() {
		return orderVer;
	}
	public void setOrderVer(String orderVer) {
		this.orderVer = orderVer;
	}
	public Date getOrderCreationDate() {
		return orderCreationDate;
	}
	public void setOrderCreationDate(Date orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}
	
	
}
