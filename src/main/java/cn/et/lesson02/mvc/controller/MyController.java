package cn.et.lesson02.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.et.lesson02.mvc.service.MyService;
/**
 * øÿ÷∆≤„
 * @author Administrator
 *
 */

//@MyAnno
@Controller
public class MyController {
	//@Resource(name="myService")//◊¢»Î Ù–‘
	@Autowired
	MyService myService;
	public void service(String sql){
		System.out.println(myService.query(sql));
	}
}
