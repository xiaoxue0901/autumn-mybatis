package com.kkb.mybatis02.test;

import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import com.kkb.mybatis02.dao.UserDao;
import com.kkb.mybatis02.dao.UserDaoImpl;
import com.kkb.mybatis.framework.sqlsession.SqlSessionFactory;
import com.kkb.mybatis.framework.sqlsession.SqlSessionFactoryBuilder;
import com.kkb.mybatis02.po.User;

public class UserDaoTest {
	// SqlSessionFactory加载依赖于全局配置文件的加载方式
	// 所以说我们需要定制到底要哪一种加载方式去创建SqlSessionFactory
	// 使用构建者模式去定制SqlSessionFactory
	private SqlSessionFactory sqlSessionFactory;

	// 去创建SqlSessionFactory
	@Before
	public void init() throws Exception {
		//指定类路径下的全局配置文件路径，通过类加载器去加载
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testQueryUserById() {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = userDao.queryUserById(1);
		System.out.println(user);
	}

}
