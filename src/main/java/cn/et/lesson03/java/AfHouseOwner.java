package cn.et.lesson03.java;

import org.springframework.stereotype.Component;

@Component
public class AfHouseOwner implements HouseOwner{
	
	public void seekHouse() {
		System.out.println("����ѧԺ�ⷿ");
	}

}
