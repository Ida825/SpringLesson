package cn.et.lesson03.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCotainer {
	static ConfigurableApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:/cn/et/lesson03/aop/spring.xml");
		
	}
	
	public static void main(String[] args) {
		AfHouseOwner ho = (AfHouseOwner)context.getBean("afHouseOwner");
		ho.seekHouse();
		
	}
}
