package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qf.dao.idao.ITUserDao;
import com.qf.dao.pojo.TUser;

@Repository("userDao")
public class DaoUserImpl implements ITUserDao {
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	
	@Override
	public void save(TUser t) throws Exception{
		sessionFactory.getCurrentSession().save(t);
	}


	@Override
	public void update(TUser t) throws Exception{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TUser t) throws Exception{
		// TODO Auto-generated method stub

	}

	@Override
	public List<TUser> findAll() throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TUser> findByProperty(String proName, Object proVal) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TUser findById(Integer k) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TUser findByLogin(TUser tUser) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from TUser u where u.username = ? and u.password = ?");
		query.setParameter(0, tUser.getUsername());
		query.setParameter(1, tUser.getPassword());
		TUser l = (TUser) query.uniqueResult();
		session.clear();
		return l;
	}

}
