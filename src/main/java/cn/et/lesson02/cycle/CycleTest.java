package cn.et.lesson02.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CycleTest {
	static ConfigurableApplicationContext context;
	static{
		//容器一加载  就会被初始化
		context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/cycle/spring.xml");
		
	}
	public static void main(String[] args) {
		//调用close方法后bean会被销毁
		context.close();
	}
}
