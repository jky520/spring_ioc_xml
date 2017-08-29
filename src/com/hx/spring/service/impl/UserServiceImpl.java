package com.hx.spring.service.impl;

import com.hx.spring.dao.UserDao;
import com.hx.spring.entity.User;
import com.hx.spring.service.UserService;

/**
 * @author @DT人 2017年7月21日 上午8:39:37
 *
 */
public class UserServiceImpl implements UserService {
	
	private UserDao userDao; // 实例化对应的dao接口对象
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user); // 通过接口对象调用相应的方法
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public User load(int id) {
		return userDao.load(id);
	}

}
