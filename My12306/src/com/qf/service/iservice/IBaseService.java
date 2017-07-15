package com.qf.service.iservice;

import java.util.List;

public interface IBaseService<T,K> {

	String save(T t);
	String update(T t);
	String delete(T t);
	List<T> findAll();
	List<T> findByProperty(String proName,Object proVal);
	T findById(K k);
}
