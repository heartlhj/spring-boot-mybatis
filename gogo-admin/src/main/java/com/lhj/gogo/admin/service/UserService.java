package com.lhj.gogo.admin.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.lhj.gogo.admin.model.GogoUser;

public interface UserService {
	int insertSelective(GogoUser user);
	
	GogoUser qryGogoUserByUser(GogoUser user);

	User findUserByUserName(String username);
}
