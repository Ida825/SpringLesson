package cn.et.lesson03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

//加注解会产生一个bean
@Component
public class MyMessage {
	public void beforeSeek(){
		System.out.println("发布到58同城");
		System.out.println("找租客");
	}
	
	public void afterSeek(){
		System.out.println("帮租客搬家");
	}
	
	public void myexception(JoinPoint jp){
		System.out.println("出现了异常");
		System.out.println(jp.getTarget());
		System.out.println(jp.getSignature().getName());
	}
}
