package com.roger.mybatis.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.roger.mybatis.entity.User;

public class _Main {

	public static void main(String[] args) {
		String resourse = "conf.xml";
		InputStream in = _Main.class.getClassLoader().getResourceAsStream(resourse);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		
		String statement = "com.roger.mybatis.mapper.userMapper.getUserById";
		User user = session.selectOne(statement, 1);
		System.out.println(user);
	}
}
