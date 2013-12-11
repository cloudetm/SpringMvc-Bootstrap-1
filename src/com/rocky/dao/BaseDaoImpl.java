package com.rocky.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.rocky.dao.interfaces.IBaseDao;
import com.rocky.orm.DefaultEntityManager;

@Repository
public class BaseDaoImpl<T> extends DefaultEntityManager<T, String> implements IBaseDao<T> {
	protected String tableName;

	@Resource
	SessionFactory sessionFactory;

	Session session = null;

	public BaseDaoImpl() {
		session = sessionFactory.openSession();
	}

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
		return session.createQuery("from " + tableName).list().size();
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
