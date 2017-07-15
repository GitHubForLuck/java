package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qf.dao.idao.ICarriageDao;
import com.qf.dao.pojo.TCarriage;
import com.qf.service.iservice.ICarriageService;

@Service("carriageService")
public class ServiceCarriageImpl implements ICarriageService {


	@Autowired
	@Qualifier("carriageDao")
	private ICarriageDao carriageDao;

	@Transactional
	@Override
	public String save(TCarriage t) {
		String msg = "error";
		try {
			carriageDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(TCarriage t) {
		String msg = "error";
		TCarriage tCarriage = null;
		try {
			tCarriage = carriageDao.findById(t.getId());
			if (null != tCarriage) {
				carriageDao.update(t);
				msg = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(TCarriage t) {
		String msg = "error";
		try {
			carriageDao.delete(t);
				msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public List<TCarriage> findAll() {
		List<TCarriage> tRoutes;
		try {
			tRoutes = carriageDao.findAll();
			return tRoutes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	@Override
	public List<TCarriage> findByProperty(String proName, Object proVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public TCarriage findById(Integer k) {
		TCarriage tRoute;
		try {
			tRoute = carriageDao.findById(k);
			return tRoute;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	@Override
	public List<TCarriage> findByProperties(TCarriage t) {
		List<TCarriage> tRoutes;
		try {
			tRoutes = carriageDao.findByProperties(t);
			return tRoutes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
