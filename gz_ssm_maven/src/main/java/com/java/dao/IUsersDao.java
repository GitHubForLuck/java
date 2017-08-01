package com.java.dao;

import java.util.List;
import java.util.Map;

import com.java.bean.Users;
import com.java.utils.PageUtils;

public interface IUsersDao extends IBaseDao<Users, String>{
	public List<Users> selectByPage(PageUtils pageUtils);
	public int selectTotalrow();
	public Users login(Map<String, Object> map);
	public Users selectByProperty(Map<String, Object> map);
}
