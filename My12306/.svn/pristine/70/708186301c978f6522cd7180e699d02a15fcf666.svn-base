package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qf.dao.idao.ITTrainDao;
import com.qf.dao.pojo.TTrain;
import com.qf.service.iservice.ITTrainService;
@Service("ttrainService")
public class IServiceTTrainIpml implements ITTrainService {
	@Autowired
	@Qualifier("ttrainDao")
	private ITTrainDao ttrainDao;
	@Transactional
	@Override
	public String save(TTrain t) {
	String 	msg="error";
	try {
		TTrain train = ttrainDao.findById(t.getId());
		if(train ==null){
			ttrainDao.save(t);
			msg="success";
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return msg;
	}
	@Transactional
	@Override
	public String update(TTrain t) {
		
	String 	msg="error";
		try {
			TTrain train=	ttrainDao.findById(t.getId());
		if(train!=null){
			ttrainDao.update(t);
			msg="success";
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return msg;
	}
	@Transactional
	@Override
	public String delete(TTrain t) {
		String msg="error";
		
	try {
		TTrain train = ttrainDao.findById(t.getId());
		if(train!=null){
			ttrainDao.delete(t);
			msg="success";
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return msg;
	}
	@Transactional
	@Override
	public List<TTrain> findAll() {
		List<TTrain> trainList = null;
		try {
			 trainList = ttrainDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainList;
	}
	@Transactional
	@Override
	public List<TTrain> findByProperty(String proName, Object proVal) {
		List<TTrain> trainList =null;
		try {
			 trainList = ttrainDao.findByProperty(proName, proVal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainList;
	}
	@Transactional
	@Override
	public TTrain findById(String k) {
		TTrain train =null;
		try {
			 train = ttrainDao.findById(k);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return train;
	}

}
