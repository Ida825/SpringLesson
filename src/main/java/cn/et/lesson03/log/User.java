package cn.et.lesson03.log;

import org.springframework.stereotype.Component;

@Component
public class User {
	public void login(){
		System.out.println("�û���¼");
	}
	
	public void buy(){
		System.out.println("�û�����");
	}
}
