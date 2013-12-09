package com.rocky.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.rocky.dao.interfaces.IUserDao;
import com.rocky.entity.UserInfo;
import com.rocky.orm.DefaultEntityManager;

@Repository
public class UserDaoImpl extends DefaultEntityManager<UserInfo,String> implements IUserDao {
	@Resource 
	SessionFactory sessionFactory;
	
	public int GetCount() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from UserInfo").list().size();
	}
}
