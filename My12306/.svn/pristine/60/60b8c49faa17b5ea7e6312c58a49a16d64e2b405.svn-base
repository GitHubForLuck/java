package com.qf.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qf.dao.pojo.TCarriage;
import com.qf.service.iservice.ICarriageService;

public class ServiceCarriageImplTest {
	
	private ApplicationContext applicationContext;
	private ICarriageService carriageService;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		carriageService = (ICarriageService) applicationContext.getBean("carriageService");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		List<TCarriage> tCarriages = carriageService.findAll();
		for (TCarriage tCarriage : tCarriages) {
			System.out.println(tCarriage.getCnumber());
		}
	}

	@Test
	public void testFindByProperty() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		TCarriage tCarriage = carriageService.findById(1);
		System.out.println(tCarriage.getCnumber());
	}

	@Test
	public void testFindByProperties() {
		fail("Not yet implemented");
	}

}
