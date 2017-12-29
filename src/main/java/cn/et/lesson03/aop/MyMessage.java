package cn.et.lesson03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

//��ע������һ��bean
@Component
public class MyMessage {
	public void beforeSeek(){
		System.out.println("������58ͬ��");
		System.out.println("�����");
	}
	
	public void afterSeek(){
		System.out.println("����Ͱ��");
	}
	
	public void myexception(JoinPoint jp){
		System.out.println("�������쳣");
		System.out.println(jp.getTarget());
		System.out.println(jp.getSignature().getName());
	}
}
