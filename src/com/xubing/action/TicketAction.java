package com.xubing.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.xubing.bean.User;
import com.xubing.service.TicketService;

public class TicketAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -768860691174886973L;

	
	private String fid;
	private TicketService ticketService;
	

	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}
	
	public String buy(){
		User exitUser = (User) ServletActionContext.getRequest().getSession().getAttribute("exitUser");
		if(exitUser == null){
			this.addActionError("请您先登录，再购票！");
			return "buy_error";
		}
		System.out.println("ticketAction的fid=" + fid);
		if(ticketService.hasSeat(fid)){
			ticketService.buy(fid,exitUser);
			return "success";
		}else{
			this.addActionMessage("余票不足！");
			return "buy_error";
		}
	}
	
}
