package com.roger.mybatis.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.roger.mybatis.test._Main;

public class MybatisUtil {
	
	private static SqlSessionFactory sessionFactory = null;
	private static SqlSession session = null;
	
	static {
		String resourse = "conf.xml";
		InputStream in = _Main.class.getClassLoader().getResourceAsStream(resourse);
		sessionFactory = new SqlSessionFactoryBuilder().build(in);
	}
	
	public static SqlSession getSession() {
		if(session == null) {
			session = sessionFactory.openSession(true);
		}
		return session;
	}
	
	public static void close() {
		if(session != null) {
			session.close();
		}
	}
	
}
