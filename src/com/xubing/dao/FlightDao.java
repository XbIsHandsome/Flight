package com.xubing.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xubing.bean.Flight;

public class FlightDao extends HibernateDaoSupport{

	public Flight findFlightByFid(String fid){
		Flight flight = this.getHibernateTemplate().get(Flight.class, fid);
		if(flight != null){
			return flight;
		}
		return null;
	}

	public List<Flight> searchFlight(String from, String to,Date date) {
		
		String hql = "from Flight f where f.flight_from=? and f.flight_to=? and f.flight_time='"+date+"'";
		List<Flight> list = this.getHibernateTemplate().find(hql,from,to);
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}

	public Flight hasSeat(String fid) {
		return this.getHibernateTemplate().get(Flight.class, fid);
	}

	public void updateSeat(Flight f) {
		this.getHibernateTemplate().update(f);
	}

	public void addFlight(Flight f) {
		this.getHibernateTemplate().save(f);
	}

	public boolean hasThisFlight(String fid) {
		if(this.getHibernateTemplate().get(Flight.class, fid)  == null){
			return true;
		}
		return false;
	}

	public void deleteById(Flight f) {
		this.getHibernateTemplate().delete(f);
	}

	public void updateFlight(Flight flight) {
		this.getHibernateTemplate().update(flight);
	}

	public Object findAllFlight() {
		String hql = "from Flight";
		List<Flight> list = this.getHibernateTemplate().find(hql);
		if(list != null && list.size() > 0){
			return list;
		}
		return null;
	}

	
}
