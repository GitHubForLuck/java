package com.java.service;

import java.text.ParseException;

import com.java.bean.Users;
import com.java.exception.ServiceException;
import com.java.utils.PageUtils;

public interface IUsersService extends IBaseService<Users, String>{
	public PageUtils selectByPage(PageUtils pageUtils);
	public int selectTotalrow();
	public Users login(String uname,String upwd);
	public Users selectByProperty(String propName,Object propVal);
	public void processActivate(String email, String validateCode)throws ServiceException, ParseException;
}
