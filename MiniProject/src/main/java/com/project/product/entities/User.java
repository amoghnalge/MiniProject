 package com.project.product.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=10,name="user_id")
	private int userId;
	@Column(length=100,name="user_name")
	private String userName;
	@Column(length=100,name="user_email")
	private String userMail;
	@Column(length=20,name="user_password")
	private String userPassword;
	@Column(length=10,name="user_phone")
	private String userPhone;
	@Column(length=1000,name="user_address")
	private String userAddress;
	@Column(name="user_type")
	private String userType;
	
	public User(int userId, String userName, String userMail, String userPassword, String userPhone,
			String userAddress,String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userType=userType;
	}

	public User(String userName, String userMail, String userPassword, String userPhone, String userAddress,String userType) {
		super();
		this.userName = userName;
		this.userMail = userMail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userType=userType;
	}

	public User() {
		super();
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", userAddress=" + userAddress + "]";
	}
	
	
	
	
	
    
}
