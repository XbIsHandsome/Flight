package com.xubing.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xubing.bean.Admin;
import com.xubing.bean.Flight;
import com.xubing.service.AdminService;

public class AdminAction extends ActionSupport implements ModelDriven<Flight>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5529630079117103103L;
	private AdminService adminService;
	private String adminname;
	private String adminpass;
	private Flight flight;

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public String loginPage(){
		return "loginPage";
	}
	
	//登录
	public String login(){
		Admin admin = adminService.login(adminname,adminpass);
		if(admin != null){
			ServletActionContext.getRequest().getSession().setAttribute("exitAdmin", admin);
			ServletActionContext.getRequest().getSession().setAttribute(
					"adminFlight",adminService.showAllFlgiht());
			return "loginSuccess";
		}
		return "loginError";
	}

	
	@Override
	public Flight getModel() {
		return flight;
	}
	
}
