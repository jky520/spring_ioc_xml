package com.hx.spring.controller;

import java.util.List;

import com.hx.spring.entity.User;
import com.hx.spring.service.UserService;

/**
 * @author @DT人 2017年7月21日 上午10:19:04
 *
 */
public class UserController {
	/*
	 * 这些变量或对象都是用来接收参数的,也是被下面方法所使用的
	 */
	private User user;
	private UserService userService;
	private Integer id;
	private List<String> names;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * 在控制器实现自己的三个方法 add delete load
	 */
	public void add() {
		userService.add(user);
	}
	
	public void delete() {
		userService.delete(id);
	}
	
	public void load() {
		userService.load(id);
	}
	
	public void list() {
		System.out.println(names);
	}
}
