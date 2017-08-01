package com.java.service;

import java.util.List;

public interface IBaseService<T,K> {
	public int insert(T t);
	public int update(T t);
	public int deleteById(K k);
	public T selectById(K k);
	public List<T> selectAll();
}
