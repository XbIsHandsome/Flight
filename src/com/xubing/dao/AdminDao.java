package com.xubing.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xubing.bean.Admin;

public class AdminDao extends HibernateDaoSupport{

	public Admin login(String adminname) {
		String hql = "from Admin where adminname=?";
		List<Admin> list = this.getHibernateTemplate().find(hql,adminname);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	
	public Admin findAdminById(Integer id){
		return this.getHibernateTemplate().get(Admin.class, id);
	}

}
