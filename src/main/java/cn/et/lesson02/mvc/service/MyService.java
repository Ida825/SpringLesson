package cn.et.lesson02.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson02.mvc.dao.MyDao;

/**
 * ÒµÎñÂß¼­²ã
 * @author Administrator
 *
 */
@Service
public class MyService {
	@Autowired
	private MyDao myDao;
	
	
	public String query(String sql){
		return myDao.queryResult(sql).toString();
	}
}
