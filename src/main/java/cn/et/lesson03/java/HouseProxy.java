package cn.et.lesson03.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ʵ�ִ�����
 * @author Administrator
 *
 */
public class HouseProxy implements InvocationHandler {

	//������
	HouseOwner house;
	
	
	public HouseProxy(HouseOwner house) {
		this.house=house;
		
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//������֮ǰ�ķ�����ǰ��֪ͨ
		System.out.println("�������");
		System.out.println("�����");
		System.out.println("��ɨ");
		//Ҫ���ص�Ŀ������Ƿ���
		Object obj = method.invoke(house, args);
		//������֮��ķ���������֪ͨ
		System.out.println("��Ͱ��� ��æ���");
		return obj;
	}

}
