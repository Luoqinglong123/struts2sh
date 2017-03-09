package com.lql.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="tb_user")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	private String name;
	
	private String loginName;
	
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int id, String name, String loginName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.loginName = loginName;
		this.password = password;
	}

	public User(String name, String loginName, String password) {
		super();
		this.name = name;
		this.loginName = loginName;
		this.password = password;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", loginName=" + loginName + ", password=" + password + "]";
	}
	
	
}
