package com.qf.dao.idao;

import java.util.List;

import com.qf.dao.pojo.TCarriage;

public interface ICarriageDao extends IBaseDao<TCarriage, Integer> {
	List<TCarriage> findByProperties(TCarriage t) throws Exception;
}
