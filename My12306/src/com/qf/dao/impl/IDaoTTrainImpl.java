package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qf.dao.idao.ITTrainDao;
import com.qf.dao.pojo.TTrain;
@Repository("ttrainDao")
public class IDaoTTrainImpl implements ITTrainDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void save(TTrain t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		
		session.save(t);

	}

	@Override
	public void update(TTrain t) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);

	}

	@Override
	public void delete(TTrain t) throws Exception {
	Session session = sessionFactory.getCurrentSession();
	session.delete(t);
	
	}

	@Override
	public List<TTrain> findAll() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from TTrain");
		List<TTrain> trainList = query.list();
		return trainList;
	}

	@Override
	public List<TTrain> findByProperty(String proName, Object proVal) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from TTrain t where t."+proName+"=?").setParameter(0, proVal);
		List<TTrain> trainList = query.list();
		return trainList;
	}

	@Override
	public TTrain findById(String k) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		TTrain train = (TTrain) session .get(TTrain.class, k);
		return train;
	}

}
