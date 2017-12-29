package cn.et.lesson02.imp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ImpTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/imp/spring.xml");
		A a = (A)context.getBean("a");
		System.out.println(a);
	}
}
