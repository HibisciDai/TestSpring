package org.fancylab.hibiscidai.test;

import java.sql.Connection;

import org.fancylab.hibiscidai.entity.User;
import org.fancylab.hibiscidai.factory.ConnectionFactory;
import org.fancylab.hibiscidai.service.UserService;
import org.fancylab.hibiscidai.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserServiceImpl {

	@Test
	public void test1() {
		// 创建Service对象
		UserService userService = new UserServiceImpl();
		// 调用方法
		userService.register();
	}

	@Test
	// 通过Spring工厂创建UserServiceImpl对象
	public void testSpring1() {
		// 创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("/org/fancylab/hibiscidai/config/applicationContext.xml");

		// 利用工厂创建对象
		UserService us = (UserService) ac.getBean("userService");
		us.register();
	}

	@Test
	// 通过Spring工厂创建User对象
	public void testSpring2() {
		// 创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("/org/fancylab/hibiscidai/config/applicationContext.xml");

		// 创建user对象
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}

	// 测试创建复杂对象的方式
	@Test
	public void testSpring4() {
		// 创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 创建Connection对象 注意：直接返回 所要创建的复杂对象
		Connection conn = (Connection) ac.getBean("conn");
		Connection conn1 = (Connection) ac.getBean("conn");
		System.out.println(conn);
		System.out.println(conn1);
		ConnectionFactory cf = (ConnectionFactory) ac.getBean("&conn");
		System.out.println(cf);
	}
}