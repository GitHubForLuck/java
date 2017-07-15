package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qf.dao.idao.IOrdersDao;
import com.qf.dao.pojo.TOrders;

@Repository("ordersDao")
public class DaoOrdersImpl implements IOrdersDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(TOrders t) throws Exception{
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(TOrders t) throws Exception{
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(TOrders t) throws Exception{
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	@Override
	public List<TOrders> findAll() throws Exception{
		// TODO Auto-generated method stub
		List<TOrders> oList = sessionFactory.getCurrentSession()
		.createQuery("from TOrders")
		.list();
		return oList;
	}

	@Override
	public List<TOrders> findByProperty(String proName, Object proVal) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from TOrders where "+proName+"=?");
		//query.setParameter(0, BigDecimal.valueOf(proVal));
		List<TOrders> oList = query.list();
		return oList;
	}

	@Override
	public TOrders findById(Integer k) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		TOrders tOrders = (TOrders) session.get(TOrders.class, k);
		session.clear();
		return tOrders;
	}

}
