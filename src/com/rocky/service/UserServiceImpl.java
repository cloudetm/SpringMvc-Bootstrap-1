package com.rocky.service;

import com.rocky.dao.UserDaoImpl;
import com.rocky.entity.UserInfo;

public class UserServiceImpl extends BaseServiceImpl<UserInfo> {
	public UserServiceImpl(){
		baseDao = new UserDaoImpl();
	}
}
