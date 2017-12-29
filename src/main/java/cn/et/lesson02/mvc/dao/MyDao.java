package cn.et.lesson02.mvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * ���ݲ�
 * @author Administrator
 *
 */

@Repository
public class MyDao {
	//�Զ�װ�� �Զ�����ǰʵ�������󸳸�temp
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> queryResult(String sql){
		System.out.println(jdbcTemplate);
		return jdbcTemplate.queryForList(sql);
	}
	
	
	
}
