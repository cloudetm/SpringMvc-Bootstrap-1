package com.rocky.dao.interfaces;

import java.util.List;

public interface IBaseDao<T> {
	T GetEntity(String hql);
	Iterable<T> GetAll();
	Iterable<T> GetEntities(String hql);
    int GetEntitiesCount();
    Iterable<T> GetPagingInfo(String hql, int pageIndex, int pageSize);
    Iterable<T> GetPagingInfo(int pageIndex, int pageSize);
    Iterable<T> GetPagingInfo(int pageSize);
    boolean Create(T entity);
    boolean Update(T entity);
    boolean Delete(T entity);
    boolean Delete(List<Integer> idList);
}
