package cn.et.lesson04.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 
 * @author Administrator
 *
 */
public class JdbcTest {
	static DataSource dataSource;
	static Connection conn;
	static {
		//��������
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/jdbc/spring.xml");
		dataSource = (DataSource)context.getBean("dataSource");
	}
	public static void main(String[] args) throws SQLException {
		try {
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			//a��10
			aminus(10);
			int i=10/0;
			//b��10
			bsave(10);
			conn.commit();
		} catch (Exception e) {
			//���쳣�ͻع�����
			e.printStackTrace();
			conn.rollback();
		}finally{
			conn.close();
		}
	}
	
	public static void aminus(int money) throws SQLException{
		String sql = "update mymoney set lostedmoney=lostedmoney-"+money+" where id=1";
		conn.prepareStatement(sql).executeUpdate();
	}
	
	public static void bsave(int money) throws SQLException{
		String sql = "update mymoney set lostedmoney=lostedmoney+"+money+" where id=2";
		conn.prepareStatement(sql).executeUpdate();
	}
}
