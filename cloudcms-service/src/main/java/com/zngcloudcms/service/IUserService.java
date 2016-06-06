package com.zngcloudcms.service;

import com.zngcloudcms.model.RetInfo;
import com.zngcloudcms.model.User;

public interface IUserService {

	public RetInfo userLogin(User user);
}
