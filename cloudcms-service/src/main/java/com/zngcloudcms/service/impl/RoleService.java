package com.zngcloudcms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zngcloudcms.dao.mysql.IRoleDao;
import com.zngcloudcms.model.RetInfo;
import com.zngcloudcms.model.Role;
import com.zngcloudcms.service.IRoleService;

@Service
public class RoleService implements IRoleService {

	@Autowired
	private IRoleDao roleDao;

	@Override
	public RetInfo createRole(Role role) {
		RetInfo retInfo = new RetInfo();
		try {
			roleDao.createRole(role);
			retInfo.setRetCode(0);
			retInfo.setRetDescript("SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			retInfo.setRetCode(-1);
			retInfo.setRetDescript(e.getMessage());
		}
		return retInfo;
	}

}
