package com.rocky.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rocky.dao.interfaces.IBaseDao;
import com.rocky.service.interfaces.IBaseService;

@Service
public class BaseServiceImpl<T> implements IBaseService<T> {

	IBaseDao<T> baseDao;
	
	public boolean Create(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Delete(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Delete(List<Integer> idList) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<T> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<T> GetEntities(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	public int GetEntitiesCount() {
		return baseDao.GetEntitiesCount();
	}

	public T GetEntity(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<T> GetPagingInfo(String hql, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<T> GetPagingInfo(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<T> GetPagingInfo(int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Update(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
