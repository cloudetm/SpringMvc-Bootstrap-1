package com.rocky.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.rocky.dao.interfaces.IUserDao;
import com.rocky.entity.UserInfo;
import com.rocky.orm.DefaultEntityManager;

@Repository
public class UserDao extends DefaultEntityManager<UserInfo, String> implements IUserDao {

	public int GetCount() {
		Session session = this.getEntityDao().getSessionFactory().openSession();
		return session.createQuery("from UserInfo as u").list().size();
	}
}
