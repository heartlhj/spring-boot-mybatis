package com.lhj.gogo.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhj.gogo.basic.dao.GogoUserMapper;
import com.lhj.gogo.basic.model.GogoUser;
import com.lhj.gogo.basic.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private GogoUserMapper gogoUserMapper;
	@Override
	public int insertSelective(GogoUser user) {
		
		System.out.println("111111111111111111111111111111111");
		return gogoUserMapper.insertSelective(user);
		
	}

}
