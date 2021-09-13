package com.simplilearn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_tbl")
public class Admin {
	@Id
	@GeneratedValue
	@Column(name = "a_id")
	private int a_id;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String password;
	
	public Admin() {
	}
	

	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public Admin(String emailId, String userName, String password) {
		super();
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}

	public Admin(int a_id, String emailId, String userName, String password) {
		super();
		this.a_id = a_id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
