package com.roger.mybatis.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.roger.mybatis.BaseTestSuitCase;

public class Class_TeacherTest extends BaseTestSuitCase {
	
	private static String PREFIX = "com.roger.mybatis.mapper.clazzMapper.";
	
	
	@Test
	public void testGetById() {
		String statement = PREFIX + "getById";
		Clazz clazz = session.selectOne(statement, 2);
		System.out.println(clazz);
		assertNotNull(clazz);
	}
	
	@Test
	public void testFinAll() {
		String statement = PREFIX + "findAll";
		List<Clazz> clazzList = session.selectList(statement);
		assertNotNull(clazzList);
		assertTrue(clazzList.size()>0);
	}
}
