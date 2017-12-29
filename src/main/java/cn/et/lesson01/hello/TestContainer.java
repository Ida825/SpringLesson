package cn.et.lesson01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileSystemXmlApplicationContext ���ļ�ϵͳѰ��xml�ļ� ���̷�
 * ClassPathXmlApplicationContext ����·����Ѱ��
 * 					���Ƕ���̳�ConfigurableApplicationContext
 * 					ʵ��ApplicationContext
 * GenericApplicationContext ͨ�õ�  Ĭ�ϴ���·����Ѱ��
 * WebApplicationContext web.xml��ʵ����
 * 
 * �ͽ�ԭ�� ����ApplicationContextָ�֧���ַ���������ҷ�ʽ
 * classpath:
 * file:
 * 
 * @author Administrator
 *
 */
public class TestContainer {
	public static void main(String[] args) {
		//������������
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("E:\\spring.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring.xml");
		//�������л�ȡ����
		A a = (A)context.getBean("a");
		A b = (A)context.getBean("b");
		System.out.println(a==b);//false
		
		/*//expected single matching bean but found 2: b,a ֻ�ʺ�ֻ��һ���������
		A m = context.getBean(A.class);
		System.out.println(m);*/
		
		/*//ֻ��ȡ����һ��
		B b2 = (B)context.getBean("cn.et.lesson01.B");
		System.out.println(b2);*/
		
		//�������е�����  ��a, b ,cn.et.lesson01.B#0 ,cn.et.lesson01.B#1
		
		String[] str = context.getBeanDefinitionNames();
		for(String s:str){
			System.out.println(s);
		}
	}
}
