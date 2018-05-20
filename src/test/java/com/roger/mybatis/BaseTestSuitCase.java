package com.roger.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;

import com.roger.mybatis.utils.MybatisUtil;

public class BaseTestSuitCase {

	protected SqlSession session = null;
	
	@Before
	public void setUp() {
		session = MybatisUtil.getSession();
	}
}
