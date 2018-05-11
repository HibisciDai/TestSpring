package org.fancylab.hibiscidai.service.impl;

import org.fancylab.hibiscidai.dao.UserDao;
import org.fancylab.hibiscidai.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register() {
		System.out.println("注册方法");
	}
}