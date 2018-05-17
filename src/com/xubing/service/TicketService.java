package com.xubing.service;

import com.xubing.bean.Flight;
import com.xubing.bean.Ticket;
import com.xubing.bean.User;
import com.xubing.dao.TicketDao;

public class TicketService {

	private TicketDao ticketDao;
	private FlightService flightService;
	
	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}



	public void buy(String fid, User uid){
		Flight flight = flightService.findFlightByFid(fid);
		Ticket ticket = new Ticket();
		ticket.setFlight(flight);
		ticket.setUser(uid);
		ticketDao.buy(ticket);
		flightService.buy(flight);
	}



	public boolean hasSeat(String fid) {
		return flightService.hasSeat(fid);
	}
	
	
	
}
