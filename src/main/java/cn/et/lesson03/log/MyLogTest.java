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
		
		//�û���¼ʮ��
		for(int i=0;i<10;i++){
			us.login();
		}
		
		//�û���һ����Ʒ
		us.buy();
		
		//����Ա���������Ʒ
		Admin admin = (Admin)context.getBean("admin");
		admin.addGoods();
		admin.addGoods();
		admin.addGoods();
	}
}
