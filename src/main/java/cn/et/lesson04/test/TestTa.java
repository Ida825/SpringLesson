package cn.et.lesson04.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lesson04.test.dao.AcDaoImpl;

public class TestTa {
	static AcDaoImpl acDaoImpl;
	static {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/test/spring.xml");
		acDaoImpl = (AcDaoImpl)context.getBean("acDaoImpl");
	}
	
	public static void main(String[] args) throws Exception {
		acDaoImpl.updateAminus(10);
	}
}
