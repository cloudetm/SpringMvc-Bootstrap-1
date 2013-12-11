package com.rocky.dao;

import com.rocky.entity.UserInfo;

public class UserDaoImpl extends BaseDaoImpl<UserInfo> {

	public UserDaoImpl() {
		tableName = "UserInfo";
	}
}
