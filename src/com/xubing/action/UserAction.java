package com.xubing.action;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xubing.bean.User;
import com.xubing.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String registPage(){
		return "registPage";
	}
	
	//后台用户校验
	public String regist(){
		return "msg";
	}

	public String findByUsername() throws IOException{
		return NONE;
	}
	
	public String loginPage(){
		return "loginPage";
	}

	
	/**
	 * 用户登录
	 */
	public String login(){
		User exitUser = userService.login(user);
		if(exitUser == null){
			this.addActionMessage("登录失败：用户名或密码错误!");
			return LOGIN;
		}else{
			ServletActionContext.getRequest().getSession().setAttribute("exitUser", exitUser);
			return "loginSuccess";
		}
	}

}
