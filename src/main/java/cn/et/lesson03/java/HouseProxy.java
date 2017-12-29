package cn.et.lesson03.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现代理类
 * @author Administrator
 *
 */
public class HouseProxy implements InvocationHandler {

	//代理房东
	HouseOwner house;
	
	
	public HouseProxy(HouseOwner house) {
		this.house=house;
		
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//被拦截之前的方法：前置通知
		System.out.println("发布广告");
		System.out.println("找租客");
		System.out.println("打扫");
		//要拦截的目标对象是房东
		Object obj = method.invoke(house, args);
		//被拦截之后的方法：后置通知
		System.out.println("租客搬入 帮忙搬家");
		return obj;
	}

}
