package com.xubing.bean;


public class Ticket {
	/**
	 *
	 */
	
	private Integer tid;
	private Flight flight;
	private User user;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", flight=" + flight + ", user=" + user
				+ "]";
	}
	
	
}
