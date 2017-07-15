package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qf.dao.idao.IRouteDao;
import com.qf.dao.pojo.TRoute;
import com.qf.service.iservice.IRouteService;

@Service("routeService")
public class ServiceRouteImpl implements IRouteService {


	@Autowired
	@Qualifier("routeDao")
	private IRouteDao routeDao;

	@Transactional
	@Override
	public String save(TRoute t) {
		String msg = "error";
		try {
				routeDao.save(t);
				msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(TRoute t) {
		String msg = "error";
		TRoute tRoute = null;
		try {
			tRoute = routeDao.findById(t.getId());
			if (null != tRoute) {
				routeDao.update(t);
				msg = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(TRoute t) {
		String msg = "error";
		try {
				routeDao.delete(t);
				msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public List<TRoute> findAll() {
		List<TRoute> tRoutes;
		try {
			tRoutes = routeDao.findAll();
			return tRoutes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	@Override
	public List<TRoute> findByProperty(String proName, Object proVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public TRoute findById(String k) {
		TRoute tRoute;
		try {
			tRoute = routeDao.findById(k);
			return tRoute;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	@Override
	public List<TRoute> findByProperties(TRoute t) {
		List<TRoute> tRoutes;
		try {
			tRoutes = routeDao.findByProperties(t);
			return tRoutes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
