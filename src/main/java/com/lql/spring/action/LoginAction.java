package com.lql.spring.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.lql.spring.entity.User;
import com.lql.spring.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
	
	@Autowired
	private LoginService loginService;
	private User user;
	
	public String loginValidate() {
		
		User userFromDB = loginService.loginValidate(user);
		
		if(userFromDB != null) {
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("userName", userFromDB.getName());
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String logout() {
		//此处可以做封装
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("userName");
		
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
}
