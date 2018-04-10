package com.lhj.gogo.admin.service;

import com.lhj.gogo.admin.model.GogoUser;

public interface UserService {
	int insertSelective(GogoUser user);
}
