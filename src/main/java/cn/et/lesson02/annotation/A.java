package cn.et.lesson02.annotation;

import org.springframework.stereotype.Component;

/**
 * @Componentע�� ��spring�����Զ�ʵ������ǰ��
 * id=��������ĸСд
 * 
 * @author Administrator
 *
 */
//@Component
@Component("aaa")
public class A {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * ��������bean�����
	 */
	public void ini(){
		System.out.println("init");
	}
	
	/**
	 * ��������beanʱ����
	 */
	public void des(){
		System.out.println("destroy");
	}
}
