package cn.parker.ssm.dao;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.parker.ssm.po.User;

public class UserDaoImpTest  {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception{
		//加载spring容器
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}


	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDaoImp) applicationContext.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user);
		
	}

}
