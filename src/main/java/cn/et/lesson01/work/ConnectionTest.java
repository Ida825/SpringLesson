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
		//Ԥ����SQL���
		PreparedStatement ps = con.prepareStatement(sql);
		//��ȡ��ѯ�����
		ResultSet rs = ps.executeQuery();
		//��ȡ������
		ResultSetMetaData rsm = rs.getMetaData();	
		int count = rsm.getColumnCount();
		
		//����List���ϴ洢��ѯ������
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
