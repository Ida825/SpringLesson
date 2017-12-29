package cn.et.lesson01.ioc_di;

public class C {
	private String id;
	private String name;
	private B b;
	public C(String id, String name, B b) {
		super();
		this.id = id;
		this.name = name;
		this.b = b;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public B getB() {
		return b;
	}

	
	
}
