package cn.et.lesson02.mvc;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lesson02.mvc.controller.MyController;


public class MyView {
	static ConfigurableApplicationContext context;
	static{
		context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/mvc/spring.xml");
	}

	private static MyController contr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while(true){
				System.out.println("«Î ‰»Îsql”Ôæ‰£∫");
				String sql = sc.nextLine();
				
				contr = (MyController)context.getBean("myController");
				contr.service(sql);
			}
		} catch (Exception e) {
 			e.printStackTrace();
		}finally{
			context.close();
		}
	}
}
