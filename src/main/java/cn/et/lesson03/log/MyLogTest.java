package cn.et.lesson03.log;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyLogTest {
	static ConfigurableApplicationContext context;
	
	static{
		context = new GenericXmlApplicationContext("classpath:/cn/et/lesson03/log/spring.xml");
	}
	
	public static void main(String[] args) {
		User us = (User)context.getBean("user");
		
		//用户登录十次
		for(int i=0;i<10;i++){
			us.login();
		}
		
		//用户买一次商品
		us.buy();
		
		//管理员添加三次商品
		Admin admin = (Admin)context.getBean("admin");
		admin.addGoods();
		admin.addGoods();
		admin.addGoods();
	}
}
