package cn.et.lesson04.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;

	public void saveBsave(int money){
		String sql = "update mymoney set lostedmoney=lostedmoney+"+money+" where id=2";
		jdbc.execute(sql);
	}
	
}
