package cn.et.lesson04.jdbc.dao.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.lesson04.jdbc.dao.MyMoneyDao;

//将bean注入到容器中

@Repository
public class MyMoneyDaoImpl implements MyMoneyDao{
	@Autowired
	private JdbcTemplate jdbc;
	
	
	public void updateAminus(int money){
		String sql = "update mymoney set lostedmoney=lostedmoney-"+money+" where id=1";
		jdbc.execute(sql);
	}
	

	public void updateBsave(int money){
		String sql = "update mymoney set lostedmoney=lostedmoney+"+money+" where id=2";
		jdbc.execute(sql);
	}
	
}
