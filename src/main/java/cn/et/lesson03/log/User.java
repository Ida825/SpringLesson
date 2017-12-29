package cn.et.lesson03.log;

import org.springframework.stereotype.Component;

@Component
public class User {
	public void login(){
		System.out.println("用户登录");
	}
	
	public void buy(){
		System.out.println("用户购物");
	}
}
