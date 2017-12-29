package cn.et.lesson03.java;

import java.lang.reflect.Proxy;

import cn.et.lesson03.aop.AfHouseOwner;

/**
 * loader�������  Test.class.getClassLoader
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//�����صķ����ⷿ��
		HouseOwner owner = new AfHouseOwner();
		//ʵ��������
		HouseProxy hp = new HouseProxy(owner);
		//�н�������
		HouseOwner hproxy =  (HouseOwner)Proxy.newProxyInstance(Test.class.getClassLoader(),owner.getClass().getInterfaces(),hp);
		hproxy.seekHouse();
	}
}
