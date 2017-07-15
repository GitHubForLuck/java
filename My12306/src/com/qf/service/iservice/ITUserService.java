package com.qf.service.iservice;

import com.qf.dao.pojo.TUser;

public interface ITUserService extends IBaseService<TUser, Integer> {
	TUser findByLogin(TUser tUser);
}
