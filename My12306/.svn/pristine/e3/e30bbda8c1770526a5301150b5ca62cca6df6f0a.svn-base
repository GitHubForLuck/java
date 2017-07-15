package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qf.dao.idao.ITJourneyDao;
import com.qf.dao.pojo.TJourney;

@Repository("tJourneyDao")
public class DaoTJourneyImpl implements ITJourneyDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(TJourney t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(TJourney t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(TJourney t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	@Override
	public List<TJourney> findAll() throws Exception {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("from TJourney");
		List<TJourney> tjList = query.list();
		return tjList;
	}

	@Override
	public List<TJourney> findByProperty(String proName, Object proVal) throws Exception {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public TJourney findById(Integer k) throws Exception {
		// TODO Auto-generated method stub
		TJourney tJourney = (TJourney) sessionFactory.getCurrentSession().get(TJourney.class, k);
		return tJourney;
	}

}
