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
	 * 容器创建bean后调用
	 */
	public void ini(){
		System.out.println("init");
	}
	
	/**
	 * 容器销毁bean时调用
	 */
	public void des(){
		System.out.println("destroy");
	}
}
