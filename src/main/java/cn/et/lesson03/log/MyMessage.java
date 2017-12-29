package cn.et.lesson03.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

//��ע������һ��bean
@Component
public class MyMessage {
	Logger logger = Logger.getLogger(MyMessage.class);
	public void beforeSeek(JoinPoint jp){
		String method = jp.getSignature().getName();
		logger.debug("����"+method+"������");
	}
	
}
