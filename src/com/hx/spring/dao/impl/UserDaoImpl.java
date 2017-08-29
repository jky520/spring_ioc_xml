package com.hx.spring.dao.impl;

import com.hx.spring.dao.UserDao;
import com.hx.spring.entity.User;

/**
 * @author @DT人 2017年7月20日 下午9:39:54
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("添加了"+user);
	}

	@Override
	public void delete(int id) {
		System.out.println("删除了："+id);
	}

	@Override
	public User load(int id) {
		System.out.println("load:"+id);
		return null;
	}

}
