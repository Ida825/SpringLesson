package cn.et.lesson01.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;




public class ConnectionTest {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson01/work/spring.xml");
		Connection con = context.getBean("con",Connection.class);
		
		String sql = "select * from mynews";
		//预编译SQL语句
		PreparedStatement ps = con.prepareStatement(sql);
		//获取查询结果集
		ResultSet rs = ps.executeQuery();
		//获取列数量
		ResultSetMetaData rsm = rs.getMetaData();	
		int count = rsm.getColumnCount();
		
		//创建List集合存储查询的数据
		List list = new ArrayList();
		while(rs.next()){
			Map map = new HashMap();
			for(int i=1;i<=count;i++){
				String key = rsm.getColumnName(i);
				String value = rs.getString(i);
				map.put(key, value);
			}			
			list.add(map);
		}
		con.close();
		ps.close();
		rs.close();
	}
}
