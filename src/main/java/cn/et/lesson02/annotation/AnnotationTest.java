package cn.et.lesson02.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnotationTest {
	static ConfigurableApplicationContext context;
	static{
		//����һ����  �ͻᱻ��ʼ��
		context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/annotation/spring.xml");
		
	}
	public static void main(String[] args) {
//		A a = (A)context.getBean("a");
		A a = (A)context.getBean("aaa");
		System.out.println(a);
		
	}
}
