package cn.et.lesson04.test.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 * ͬһ�����У����쳣��һ��ع�
 * @author Administrator
 *
 */
@Repository
public class AcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;
	
	@Autowired
	BcDaoImpl b;
	public void updateAminus(int money){
		//��Ǯ
		String sql = "update mymoney set lostedmoney=200 where id=1";
		jdbc.execute(sql);
		
		//��Ǯ
		b.saveBsave(money);
		//����ʱ�쳣���Զ��ع�
		//throw new RuntimeException();
		
		//������ʱ�쳣�����Զ��ع�
		throw new NullPointerException();
		//int i=10/0;
		
	}
	
	
	
}
