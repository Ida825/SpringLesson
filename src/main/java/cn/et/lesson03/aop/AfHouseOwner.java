package cn.et.lesson03.aop;

import org.springframework.stereotype.Component;

import cn.et.lesson03.java.HouseOwner;

@Component
public class AfHouseOwner implements HouseOwner{
	
	public void seekHouse() {
		System.out.println("Miss��Ҫ���ⷿ����һ��");
		int i=10/0;
		
	}

	
}
