package cn.et.lesson02.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CycleTest {
	static ConfigurableApplicationContext context;
	static{
		//����һ����  �ͻᱻ��ʼ��
		context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/cycle/spring.xml");
		
	}
	public static void main(String[] args) {
		//����close������bean�ᱻ����
		context.close();
	}
}
