package com.lhj.gogo.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.lhj.gogo.admin.dao.GogoUserMapper;
import com.lhj.gogo.admin.model.GogoUser;
import com.lhj.gogo.admin.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private GogoUserMapper gogoUserMapper;
	@Override
	public int insertSelective(GogoUser user) {
		
		System.out.println("111111111111111111111111111111111");
		return gogoUserMapper.insertSelective(user);
		
	}
	@Override
	public GogoUser qryGogoUserByUser(GogoUser user) {
		return gogoUserMapper.selectGogoUserByUser(user);
	}
	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
