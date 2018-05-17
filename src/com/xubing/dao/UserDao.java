package com.xubing.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xubing.bean.User;

public class UserDao extends HibernateDaoSupport{

	public User findByUsername(String username){
		String hql = "from User where username=?";
		List<User> list = this.getHibernateTemplate().find(hql,username);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	public User login(User user) {
		
		String hql = "from User where username=? and password=?";
		List<User> list = this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	
	

	
}
