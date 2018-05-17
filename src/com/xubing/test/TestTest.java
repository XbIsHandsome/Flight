package com.xubing.test;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xubing.bean.User;
import com.xubing.dao.FlightDao;
import com.xubing.dao.TicketDao;
import com.xubing.dao.UserDao;
import com.xubing.service.FlightService;
import com.xubing.service.TicketService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTest {

	@Resource(name="userDao")
	private UserDao userDao;
	@Test
	public void test1() {
		System.out.println(userDao.findByUsername("许兵").toString());
	}
	
	@Resource(name="flightDao")
	private FlightDao flightDao;
	@Test
	public void test2() {
		System.out.println(flightDao.findFlightByFid("A1086").toString());
	}
	
	@Resource(name="ticketDao")
	private TicketDao ticketDao;
	@Test
	public void test3() {
		System.out.println(ticketDao.findByUsername(20160909).toString());
	}
	
	@Resource(name="flightService")
	private FlightService flightService;
	@Test
	public void test4() {
//		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
//		try {
			//Date date = (Date) f.parse("2018-05-02");
			//System.out.println(date.toString());
		System.out.println(new Date(118, 04, 02).toString());
			System.out.println(flightService.searchFlight("长沙", "武汉", new Date(118, 04, 02)).toString());
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	@Test
	public void test5(){
		System.out.println(flightService.hasSeat("A1086"));
	}
	
	@Test
	public void test6(){
		System.out.println(flightService.findFlightByFid("A1086"));
	}
	
	@Resource(name="ticketService")
	private TicketService ticketService;
	@Test
	public void test8(){
		User user = userDao.findByUsername("许兵");
		ticketService.buy("A1086", user);
	}
}
