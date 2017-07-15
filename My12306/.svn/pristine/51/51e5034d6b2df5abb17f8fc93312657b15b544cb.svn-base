package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qf.dao.idao.ITStationDao;
import com.qf.dao.pojo.TOrders;
import com.qf.dao.pojo.TStation;
import com.qf.service.iservice.ITStationService;
@Service("tstationService")
public class IServiceTStationImpl implements ITStationService {
	
	@Autowired
	@Qualifier("tstationDao")
	private ITStationDao tstationDao;
	
	@Transactional
	@Override
	public String save(TStation t) {
		String mString="error";
		try {
			tstationDao.save(t);
			mString="success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mString;
	}
	
	@Transactional
	@Override
	public String update(TStation t) {
		String mString="error";
		try {
			TStation station = tstationDao.findById(t.getId());
			if(station!=null){
				tstationDao.update(t);
				mString="success";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mString;
	}

	@Transactional
	@Override
	public String delete(TStation t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public List<TStation> findAll() {
		List<TStation> stationList =null;	
	try {
		 stationList = tstationDao.findAll();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return stationList;
	}
	
	@Transactional
	@Override
	public List<TStation> findByProperty(String proName, Object proVal) {
		List<TStation> stationList =null;
		try {
			 stationList = tstationDao.findByProperty(proName, proVal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stationList;
	}
	
	@Transactional
	@Override
	public TStation findById(String  k) {
	TStation station=null;
	try {
		station = tstationDao.findById(k);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return station;
	}


	@Transactional
	@Override
	public String changeStatusById(String k) {
		// TODO Auto-generated method stub
		String msg = "error";
		TStation tStation = null;
		try {
			tStation = tstationDao.findById(k);
			if (tStation != null) {
				if ("1".equals(tStation.getCon1())) {
					tStation.setCon1("0");
				}else {
					tStation.setCon1("1");
				}
				tstationDao.update(tStation);
			}
			msg = "changesuccess";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

}
