package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qf.dao.idao.IOrdersDao;
import com.qf.dao.pojo.TOrders;
import com.qf.service.iservice.ITOrdersService;

@Service("tOrdersService")
public class ServiceTOrdersImpl implements ITOrdersService {

	@Autowired
	@Qualifier("ordersDao")
	private IOrdersDao ordersDao;
	
	@Transactional
	@Override
	public String save(TOrders t) {
		// TODO Auto-generated method stub
		String msg = "error";
		try {
			ordersDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(TOrders t) {
		// TODO Auto-generated method stub
		String msg = "error";
		try {
			ordersDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(TOrders t) {
		// TODO Auto-generated method stub
		String msg = "error";
		try {
			ordersDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public List<TOrders> findAll() {
		// TODO Auto-generated method stub
		List<TOrders> oList = null;
		try {
			oList = ordersDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oList;
	}

	@Transactional
	@Override
	public List<TOrders> findByProperty(String proName, Object proVal) {
		List<TOrders> oList = null;
		try {
			oList = ordersDao.findByProperty(proName, proVal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return oList;
	}

	@Transactional
	@Override
	public TOrders findById(Integer k) {
		// TODO Auto-generated method stub
		TOrders tOrders = null;
		try {
			tOrders = ordersDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return tOrders;
	}
	
	@Transactional
	@Override
	public String changeStatusById(Integer k) {
		// TODO Auto-generated method stub
		String msg = "error";
		TOrders tOrders = null;
		try {
			tOrders = ordersDao.findById(k);
			if (tOrders != null) {
				if (tOrders.getStatus() == 1) {
					tOrders.setStatus(0);
				}else {
					tOrders.setStatus(1);
				}
				ordersDao.update(tOrders);
			}
			msg = "changesuccess";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
		
	}

}
