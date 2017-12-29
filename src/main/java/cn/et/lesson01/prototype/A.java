package cn.et.lesson01.prototype;

public class A {
	private String username;
	
	public A(){
		System.out.println("开始实例化");
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
