package cn.et.lesson02.cycle;

public class A {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * ��������bean�����
	 */
	public void ini(){
		System.out.println("init");
	}
	
	/**
	 * ��������beanʱ����
	 */
	public void des(){
		System.out.println("destroy");
	}
}
