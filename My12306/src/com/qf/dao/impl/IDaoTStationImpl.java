package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qf.dao.idao.ITStationDao;
import com.qf.dao.pojo.TStation;
@Repository("tstationDao")
public class IDaoTStationImpl implements ITStationDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	


	@Override
	public void save(TStation t)throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);

	}

	@Override
	public void update(TStation t)throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);

	}

	@Override
	public void delete(TStation t) throws Exception{
	

	}

	@Override
	public List<TStation> findAll() throws Exception{
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from TStation");
		List<TStation> stationlist = query.list();
		return stationlist;
	}

	@Override
	public List<TStation> findByProperty(String proName,Object proVal) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from TStation s where s."+proName+"=?").setParameter(0, proVal);
		List<TStation> stationlist = query.list();
		session.clear();
		return stationlist;
		
	}

	@Override
	public TStation findById(String  k) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		TStation station=	(TStation) session.get(TStation.class, k);
		session.clear();
		return station;
	}

}
