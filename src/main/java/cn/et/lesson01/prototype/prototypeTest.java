package cn.et.lesson01.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class prototypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson01/prototype/spring.xml");
		A a = (A)context.getBean("a");
		A a1 = (A)context.getBean("a");
		System.out.println(a==a1);
		
	}
}
