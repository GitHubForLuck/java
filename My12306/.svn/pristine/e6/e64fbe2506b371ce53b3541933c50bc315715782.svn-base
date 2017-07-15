package com.qf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qf.dao.idao.ITUserDao;
import com.qf.dao.pojo.TUser;
import com.qf.service.iservice.ITUserService;

@Service("userService")
public class ServiceTUserImpl implements ITUserService {


	@Autowired
	@Qualifier("userDao")
	ITUserDao dd;
	
	public ServiceTUserImpl() {
		
	}

	@Transactional
	@Override
	public String save(TUser t) {
		System.out.println("fdf");
		String msg = "error";
		try {
				dd.save(t);
				msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String update(TUser t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(TUser t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TUser> findByProperty(String proName, Object proVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TUser findById(Integer k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public TUser findByLogin(TUser tUser){
		try {
			return  dd.findByLogin(tUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
