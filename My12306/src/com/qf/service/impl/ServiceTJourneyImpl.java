package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qf.dao.idao.ITJourneyDao;
import com.qf.dao.pojo.TJourney;
import com.qf.service.iservice.ITJourneyService;

@Service("tJourneyService")
public class ServiceTJourneyImpl implements ITJourneyService {

	@Autowired
	@Qualifier("tJourneyDao")
	private ITJourneyDao tJourneyDao;
	
	@Transactional
	@Override
	public String save(TJourney t) {
		// TODO Auto-generated method stub
		String msg = "error";
		try {
			tJourneyDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(TJourney t) {
		// TODO Auto-generated method stub
		String msg = "error";
		try {
			tJourneyDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(TJourney t) {
		// TODO Auto-generated method stub
		String msg = "error";
		try {
			tJourneyDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public List<TJourney> findAll() {
		// TODO Auto-generated method stub
		List<TJourney> tjList = null;
		try {
			tjList = tJourneyDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tjList;
	}

	@Transactional
	@Override
	public List<TJourney> findByProperty(String proName, Object proVal) {
		List<TJourney> tjList = null;
		// TODO Auto-generated method stub
		try {
			tjList = tJourneyDao.findByProperty(proName, proVal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tjList;
	}

	@Transactional
	@Override
	public TJourney findById(Integer k) {
		// TODO Auto-generated method stub
		TJourney tJourney = null;
		try {
			tJourney = tJourneyDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tJourney;
	}

}
