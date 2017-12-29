package cn.et.lesson02.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestCotainer {
	static JdbcTemplate temp;
	static{
		//创建容器对象
				ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson02/jdbc/spring.xml");
				/*DataSource dataSource = (DataSource)context.getBean("dataSource");	
				//获取连接
				System.out.println(dataSource.getConnection());*/
				temp = (JdbcTemplate) context.getBean("jdbcTemplate");
	}
	public static void main(String[] args) throws SQLException {	
		query("select * from goods");	
		//update();
	}
	
	/**
	 * 查询数据
	 * @param sql
	 */
	public static void query(String sql){
		List<Map<String, Object>>  list = temp.queryForList(sql);
		System.out.println(list.size());
		System.out.println(list);
	}
	
	public static void update(){
		String sql = "delete from goods where id=1";
		temp.execute(sql);
	}
}
