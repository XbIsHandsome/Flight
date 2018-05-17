package com.xubing.test;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xubing.bean.Flight;
import com.xubing.dao.FlightDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestFlight {


	@Resource(name="flightDao")
	private FlightDao flightDao;
	@Test
	public void test() {
		Flight flight = flightDao.findFlightByFid("A1086");
		System.out.println(flight.toString());
		
		flight.setFlight_seat(flight.getFlight_seat() - 1);
		System.out.println(flight.toString());
		flightDao.updateSeat(flight);
	}
	
	@Test
	public void test2() {
		List<Flight> searchFlight = flightDao.searchFlight("长沙", "武汉", new Date(118, 4, 2));
		System.out.println(searchFlight);
	}
	
	@Test
	public void test3() {
		List<Flight> searchFlight = (List<Flight>) flightDao.findAllFlight();
		System.out.println(searchFlight);
	}
}
