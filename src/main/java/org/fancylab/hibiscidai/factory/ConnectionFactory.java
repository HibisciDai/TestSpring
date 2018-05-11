package org.fancylab.hibiscidai.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnectionFactory implements FactoryBean {
	// 作用：用于书写创建复杂对象的代码，并把创建的复杂对象作为方法的返回值返回
	@Override
	public Object getObject() throws Exception {
		// 创建连接对象
		// 加载驱动
		Class.forName("oracle.jdbc.OracleDriver");
		// 获取连接
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		return connection;
	}

	// 返回创建的复杂对象的类对象
	@Override
	public Class getObjectType() {
		return Connection.class;
	}

	// 控制复杂对象的创建次数，根据对象的特点进行返回
	// true:Spring工厂只会创建一次该复杂对象
	// false:每一次调用Spring工厂 Spring都会创建新的复杂对象
	@Override
	public boolean isSingleton() {
		return false;
	}

}
