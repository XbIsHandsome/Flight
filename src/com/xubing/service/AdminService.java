package com.xubing.service;

import com.xubing.bean.Admin;
import com.xubing.bean.Flight;
import com.xubing.dao.AdminDao;

public class AdminService {
	private AdminDao adminDao;
	private FlightService flightService;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}

	public Admin login(String adminname, String adminpass) {
		Admin admin = adminDao.login(adminname);
		System.out.println(adminpass);
		if(admin.getAdminpass().equals(adminpass)){
			return adminDao.findAdminById(admin.getAdminid());
		}
		return null;
	}



	public Object showAllFlgiht() {
		return flightService.showAllFlight();
	}

}
