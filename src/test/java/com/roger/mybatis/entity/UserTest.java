package com.roger.mybatis.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.roger.mybatis.BaseTestSuitCase;
import com.roger.mybatis.condition.ConditionParam;

public class UserTest extends BaseTestSuitCase{

	
	private static String PREFIX = "com.roger.mybatis.mapper.userMapper.";
	
	@Test
	public void testDeleteById() {
		String statement = PREFIX + "deleteUserById";
		session.delete(statement, 3);
	}
	
	@Test
	public void testFindAll() {
		String statement = PREFIX + "findAllUsers";
		List<User> users = session.selectList(statement);
		assertNotNull(users);
		assertTrue(users.size() > 0);
	}
	
	@Test
	public void testGetById() {
		String statement = PREFIX + "getById";
		User user = session.selectOne(statement, 1);
		assertNotNull(user);
	}
	
	@Test
	public void testUpdate() {
		String statement = PREFIX + "updateUser";
		User user = new User(4, "Mary", 28);
		session.update(statement, user);
	}
	
	@Test
	public void testGetByParam() {
		ConditionParam param = new ConditionParam("o", 11, 21);
		String statement = PREFIX + "getByParam";
		List<User> users = session.selectList(statement,param);
		System.out.println(users);
		assertNotNull(users);
		assertTrue(users.size() > 0);
	}
	
}
