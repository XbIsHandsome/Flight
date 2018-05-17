package com.xubing.action;

import java.sql.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xubing.bean.Admin;
import com.xubing.bean.Flight;
import com.xubing.service.FlightService;

public class FlightAction extends ActionSupport implements ModelDriven<Flight>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -414776295202810178L;
	//	private String flight_from;
	//	private String flight_to;
	//	private Date flight_time;
	//	
	//	public void setFlight_from(String flight_from) {
	//		this.flight_from = flight_from;
	//	}
	//	public void setFlight_to(String flight_to) {
	//		this.flight_to = flight_to;
	//	}
	//	public void setFlight_time(Date flight_time) {
	//		this.flight_time = flight_time;
	//	}
	private Flight flight;

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	private FlightService flightService;
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	public String search(){

		List<Flight> flight_list  = flightService.searchFlight(flight.getFlight_from(),
				flight.getFlight_to(), flight.getFlight_time());
		if(flight_list != null){
			ServletActionContext.getRequest().getSession().setAttribute("flight_list", flight_list);
			return "FlightShow";
		}else{
			this.addActionMessage("对不起，暂查不到当前航班！");
			return "FlightShow_Error";
		}
	}

	//添加航班
	private String addFlight(){
		Admin admin = (Admin) ServletActionContext.getRequest().getSession().getAttribute("exitAdmin");
		if(admin == null){
			this.addActionMessage("Please Login In！");
			return "not_login";
		}else{
			if(flightService.hasThisFlight(flight.getFid())){
				this.addActionError("This Flight Is Exit!");
				return "ERROR";
			}
			flightService.addFligt(flight);
			this.addActionMessage("添加成功");
			return "add_success";
		}
	}
	//删除航班
	public String delete(){
		Admin admin = (Admin) ServletActionContext.getRequest().getSession().getAttribute("exitAdmin");
		if(admin == null){
			this.addActionMessage("Please Login In！");
			return "not_login";
		}else{
			if(flightService.hasThisFlight(flight.getFid())){
				this.addActionError("This Flight Is Exit!");
				return "ERROR";
			}
			flightService.deleteById(flight.getFid());
			this.addActionMessage("删除成功");
			return "success";
		}
		
	}
	
	//更新航班
	public String modify(){
		flightService.update(flight.getFid());
		this.addActionMessage("修改成功");
		return "success";
	}
	
	
	
	
	@Override
	public Flight getModel() {
		return flight;
	}




}
