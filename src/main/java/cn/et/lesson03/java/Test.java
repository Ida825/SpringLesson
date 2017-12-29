package cn.et.lesson03.java;

import java.lang.reflect.Proxy;

import cn.et.lesson03.aop.AfHouseOwner;

/**
 * loader类加载器  Test.class.getClassLoader
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//被拦截的房东租房类
		HouseOwner owner = new AfHouseOwner();
		//实现拦截类
		HouseProxy hp = new HouseProxy(owner);
		//中介代理对象
		HouseOwner hproxy =  (HouseOwner)Proxy.newProxyInstance(Test.class.getClassLoader(),owner.getClass().getInterfaces(),hp);
		hproxy.seekHouse();
	}
}
