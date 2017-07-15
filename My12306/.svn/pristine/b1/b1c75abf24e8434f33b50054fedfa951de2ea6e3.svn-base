package com.qf.dao.impl;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qf.dao.idao.IRouteDao;
import com.qf.dao.pojo.TRoute;

public class DaoRouteImplTest {
	
	private ApplicationContext ctx;
	private IRouteDao routeDao;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		routeDao = (IRouteDao) ctx.getBean("routeDao");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		TRoute tRoute = new TRoute();
		tRoute.setId("DD");
		tRoute.setSiteorder(2);
		tRoute.setSite("FF2");
		tRoute.setMile(22);
		tRoute.setStarttime(new Date());
		tRoute.setEndtime(new Date());
		tRoute.setStaytime(23);
		try {
			routeDao.save(tRoute);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		TRoute tRoute = null;
		try {
			tRoute = routeDao.findById("22");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tRoute.setSite("KK");
		try {
			routeDao.update(tRoute);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		List<TRoute> routes = new ArrayList<>();
		try {
			routes = routeDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (TRoute tRoute : routes) {
			System.out.println(tRoute.getId());
		}
	}

	@Test
	public void testFindById() {
		TRoute tRoute = null;
		try {
			tRoute = routeDao.findById("22");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=="+tRoute.getMile());
	}

	@Test
	public void testFindByProperty() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByProperties() {
		List<TRoute> routes = new ArrayList<>();
		TRoute t = new TRoute();
		t.setStarttime(new Date());
		try {
			routes = routeDao.findByProperties(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (TRoute tRoute : routes) {
			System.out.println(tRoute.getId());
		}
	}

}
