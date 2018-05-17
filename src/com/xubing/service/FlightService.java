package com.xubing.service;

import java.sql.Date;
import java.util.List;

import com.xubing.bean.Flight;
import com.xubing.dao.FlightDao;

public class FlightService {

	private FlightDao flightDao;
	
	
	public void setFlightDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}


	public List<Flight> searchFlight(String from, String to, Date date){
		return flightDao.searchFlight(from, to, date);
	}

	public Flight findFlightByFid(String fid){
		return flightDao.findFlightByFid(fid);
	}
	
	
	public boolean hasSeat(String fid) {
		System.out.println("字符串的fid=" + "A1086");
		System.out.println("hasSeat的fid=" + fid);
		if(flightDao.hasSeat(fid).getFlight_seat() > 0){
			return true;
		}
		return false;
	}


	public void buy(Flight f) {
		f.setFlight_seat(f.getFlight_seat() - 1);
		flightDao.updateSeat(f);
	}
	
	public void addFligt(Flight f) {
		flightDao.addFlight(f);
	}


	public boolean hasThisFlight(String fid) {
		// TODO Auto-generated method stub
		return flightDao.hasThisFlight(fid);
	}


	public void deleteById(String fid) {
		Flight flight = flightDao.findFlightByFid(fid);
		flightDao.deleteById(flight);
	}


	public void update(String fid) {
		Flight flight = flightDao.findFlightByFid(fid);
		flightDao.updateFlight(flight);
	}


	public Object showAllFlight() {
		return flightDao.findAllFlight();
	}

}
