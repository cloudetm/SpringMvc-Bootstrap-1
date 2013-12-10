package com.rocky.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocky.dao.interfaces.IUserDao;
import com.rocky.service.interfaces.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDao userDao;
	
	public int GetCount() {
		return userDao.GetCount();
	}
}
