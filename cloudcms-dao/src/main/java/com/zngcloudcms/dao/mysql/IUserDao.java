package com.zngcloudcms.dao.mysql;

import com.zngcloudcms.model.User;



public interface IUserDao {

	public void createUser(User user);
	
	public User getUserByroleID(int roleID);
}
