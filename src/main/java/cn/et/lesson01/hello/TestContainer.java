package cn.et.lesson01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileSystemXmlApplicationContext 从文件系统寻找xml文件 带盘符
 * ClassPathXmlApplicationContext 从类路径下寻找
 * 					它们都会继承ConfigurableApplicationContext
 * 					实现ApplicationContext
 * GenericApplicationContext 通用的  默认从类路径下寻找
 * WebApplicationContext web.xml中实例化
 * 
 * 就近原则 所有ApplicationContext指令都支持字符串定义查找方式
 * classpath:
 * file:
 * 
 * @author Administrator
 *
 */
public class TestContainer {
	public static void main(String[] args) {
		//创建容器对象
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("E:\\spring.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring.xml");
		//从容器中获取对象
		A a = (A)context.getBean("a");
		A b = (A)context.getBean("b");
		System.out.println(a==b);//false
		
		/*//expected single matching bean but found 2: b,a 只适合只有一个对象的类
		A m = context.getBean(A.class);
		System.out.println(m);*/
		
		/*//只获取到了一个
		B b2 = (B)context.getBean("cn.et.lesson01.B");
		System.out.println(b2);*/
		
		//遍历所有的名字  ：a, b ,cn.et.lesson01.B#0 ,cn.et.lesson01.B#1
		
		String[] str = context.getBeanDefinitionNames();
		for(String s:str){
			System.out.println(s);
		}
	}
}
