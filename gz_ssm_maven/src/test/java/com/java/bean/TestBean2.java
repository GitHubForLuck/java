package com.java.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class TestBean2 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testBean() {
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean = (TestBean) classPathXmlApplicationContext.getBean("testBean");
		classPathXmlApplicationContext.close();
		testBean.info();
		System.out.println(classPathXmlApplicationContext);
	}
}
