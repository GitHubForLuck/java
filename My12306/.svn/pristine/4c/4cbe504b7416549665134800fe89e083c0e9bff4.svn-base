package com.qf.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qf.dao.idao.ICarriageDao;
import com.qf.dao.pojo.TCarriage;

@Repository("carriageDao")
public class DaoCarriageImpl implements ICarriageDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void save(TCarriage t) {
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}

	@Override
	public void update(TCarriage t) {
		Session session = sessionFactory.getCurrentSession();
		session.update(t);
	}

	@Override
	public void delete(TCarriage t) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(t);
	}

	@Override
	public List<TCarriage> findAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from TCarriage");
		List<TCarriage> tRoutes = query.list();
		return tRoutes;
	}

	@Override
	public TCarriage findById(Integer k) {
		Session session = sessionFactory.getCurrentSession();
		TCarriage tRoute = (TCarriage) session.get(TCarriage.class, k);
		session.clear();
		return tRoute;
	}

	@Override
	public List<TCarriage> findByProperty(String proName, Object proVal) {
		return null;
	}

	@Override
	public List<TCarriage> findByProperties(TCarriage t) throws Exception {
		//车厢查询：根据车厢编号（int）,车次（String）,车厢号（int）、车厢类型（int），车厢状态（String）
		Session session = sessionFactory.getCurrentSession();
		String sql = "from TCarriage where 1=1";
		int id = t.getId();
		if (id > 0) {
			sql += " and id = "+id;
		}
		if (null != t.getTTrain()) {
			sql += " and tid like '%"+t.getTTrain().getId()+"%'";
		}
		int cnumber = t.getCnumber();
		if (cnumber > 0) {
			sql += " and cnumber = "+cnumber;
		}
		int ctype = t.getCtype();
		if (ctype > 0) {
			sql += " and ctype = "+ctype;
		}
		String con1 = t.getCon1();
		if (null != con1) {
			sql += " and con1 like '%"+con1+"%'";
		}
		Query query = session.createQuery(sql);
		List<TCarriage> tRoutes = query.list();
		return tRoutes;
	}

}
