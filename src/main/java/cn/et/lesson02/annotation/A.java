package cn.et.lesson02.annotation;

import org.springframework.stereotype.Component;

/**
 * @Component注解 让spring容器自动实例化当前类
 * id=类名首字母小写
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
	 * 容器创建bean后调用
	 */
	public void ini(){
		System.out.println("init");
	}
	
	/**
	 * 容器销毁bean时调用
	 */
	public void des(){
		System.out.println("destroy");
	}
}
