package com.qf.dao.idao;

import com.qf.dao.pojo.TUser;

public interface ITUserDao extends IBaseDao<TUser, Integer> {
	TUser findByLogin(TUser tUser) throws Exception;
}
