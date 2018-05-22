package com.roger.mybatis.entity;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.roger.mybatis.BaseTestSuitCase;

public class CallProcedureTest extends BaseTestSuitCase {
	
	private static String PREFIX = "com.roger.mybatis.mapper.personMapper.";
	
	
	@Test
	public void testGetUserCountBySexId() {
		String statement = PREFIX + "getUserCountBySexId";
		Map<String, Integer> param = new HashMap<>();
		param.put("sexId", 0);
		param.put("userCount", -1);
		session.selectOne(statement, param);
		Integer result = param.get("userCount");
		assertTrue(result.intValue() != -1);
	}
	
}
