package com.roger.mybatis.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.roger.mybatis.BaseTestSuitCase;

public class OrderTest extends BaseTestSuitCase {
	
	private static String PREFIX = "com.roger.mybatis.mapper.orderMapper.";
	
	
	@Test
	public void testGetById() {
		String statement = PREFIX + "getById";
		Order order = session.selectOne(statement, 2);
		assertNotNull(order);
	}
	
	@Test
	public void testFinAll() {
		String statement = PREFIX + "findAll";
		List<Order> orders = session.selectList(statement);
		assertNotNull(orders);
		assertTrue(orders.size()>0);
	}
}
