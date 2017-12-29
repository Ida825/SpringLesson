package cn.et.lesson01.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class AutowireTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson01/autowire/spring.xml");
		/*B b = (B)context.getBean("b");
		System.out.println(b.getA().getUsername());*/
		
	/*	A a = (A)context.getBean("a");
		System.out.println(a.getUsername());*/
		B b = (B)context.getBean("b");
		System.out.println(b.getA().size());
		
	}
}
