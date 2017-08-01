package com.java.bean;

public class TestBean {
	private String name;
	
	public TestBean() {
		System.out.println("调用了无参构造方法》》》》");
	}

	public TestBean(String name) {
		super();
		this.name = name;
		System.out.println("调用了有参构造方法》》》》");
	}
	
	public void init() {
		System.out.println("初始化bean>>>>>>>");
	}
	
	public void destory() {
		System.out.println("摧毁bean>>>>>>>>>");
	}

	public String getName() {
		System.out.println("调用了set方法》》》》》");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("调用了set方法》》》》");
	}
	
	public void info() {
		System.out.println("调用了info方法");
	}
}
