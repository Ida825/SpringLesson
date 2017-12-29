package cn.et.lesson04.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lesson04.jdbc.dao.MyMoneyDao;
import cn.et.lesson04.jdbc.dao.imp.MyMoneyDaoImpl;

/**
 * 
 * @author Administrator
 *
 */
public class JdbcTs {
	
	static MyMoneyDao myMoneyDao;
	static {
		//´´½¨ÈÝÆ÷
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/jdbc/spring.xml");
		myMoneyDao = (MyMoneyDao)context.getBean(MyMoneyDao.class);
	}
	public static void main(String[] args) throws SQLException {
		myMoneyDao.updateAminus(10);
		int i=10/0;
		myMoneyDao.updateBsave(10);
	}
	

}
