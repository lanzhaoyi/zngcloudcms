package com.zngcloudcms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zngcloudcms.dao.mysql.IUserDao;
import com.zngcloudcms.model.RetInfo;
import com.zngcloudcms.model.User;
import com.zngcloudcms.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public RetInfo userLogin(User user) {
		RetInfo retInfo=new RetInfo();
		try{
			//userDao.createUser(user);
			retInfo.setRetCode(0);
			retInfo.setRetDescript("成功");
		}catch(Exception e){
			retInfo.setRetCode(-1);
			retInfo.setRetDescript(e.getMessage());
			e.printStackTrace();
		}
		return retInfo;

	}

}
