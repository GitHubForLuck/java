package com.qf.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qf.dao.impl.DaoOrdersImpl;
import com.qf.dao.pojo.TOrders;


public class XXXActionTest {

	private ApplicationContext ctx;
	private SessionFactory sessionFactory;
	private DaoOrdersImpl daoOrdersImpl;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		sessionFactory  = (SessionFactory) ctx.getBean("sessionFactory");
		daoOrdersImpl = new DaoOrdersImpl();
		System.out.println(daoOrdersImpl);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println(sessionFactory.toString());
		System.out.println(session.toString());

		Query query = session.createQuery("from TOrders where id=?");
		query.setParameter(0, 1);
		List<TOrders> oList = query.list();
		
		if (oList != null && oList.size() > 0) {
			for(TOrders orders : oList){
				System.out.println(orders.getId());
				System.out.println(orders.getMaketime());
			}
		}else {
			System.out.println("sadsfdsfsfsf");
		}
		transaction.commit();
		session.close();
	}

}
