package cn.et.lesson04.test.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 * 同一事务中，有异常后一起回滚
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
		//扣钱
		String sql = "update mymoney set lostedmoney=200 where id=1";
		jdbc.execute(sql);
		
		//加钱
		b.saveBsave(money);
		//运行时异常会自动回滚
		//throw new RuntimeException();
		
		//非运行时异常不会自动回滚
		throw new NullPointerException();
		//int i=10/0;
		
	}
	
	
	
}
