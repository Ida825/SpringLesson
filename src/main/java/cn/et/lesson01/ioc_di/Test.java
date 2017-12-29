package cn.et.lesson01.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//容器对象
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson01/ioc_di/spring.xml");
		A a = (A)context.getBean("a1");
		//cn.et.lesson01.ioc_di.A@73bb9f3f
		System.out.println(a);
		//张三丰
		System.out.println(a.getUsername());
		
		B b = (B)context.getBean("b");
		System.out.println(b);
		//cn.et.lesson01.ioc_di.A@73bb9f3f
		System.out.println(b.getA());
		//张三丰
		System.out.println(b.getA().getUsername());
		
		C c = (C)context.getBean("c");
		System.out.println(c.getId()+"--"+c.getName());
		System.out.println(c.getB().getA().getUsername());
	}
}
