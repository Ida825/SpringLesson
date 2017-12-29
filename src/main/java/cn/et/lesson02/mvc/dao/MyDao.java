package cn.et.lesson02.mvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * 数据层
 * @author Administrator
 *
 */

@Repository
public class MyDao {
	//自动装配 自动将当前实例化对象赋给temp
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> queryResult(String sql){
		System.out.println(jdbcTemplate);
		return jdbcTemplate.queryForList(sql);
	}
	
	
	
}
