package com.xubing.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xubing.bean.Ticket;

public class TicketDao extends HibernateDaoSupport{

	public Ticket findByUsername(Integer tid){
		return this.getHibernateTemplate().get(Ticket.class, tid);
	}

	public void buy(Ticket ticket) {
		this.getHibernateTemplate().save(ticket);;
	}

	
	

	
}
