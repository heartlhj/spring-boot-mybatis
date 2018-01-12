package com.lhj.gogo.basic.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhj.gogo.basic.model.GogoUser;
import com.lhj.gogo.basic.service.UserService;
@Controller
public class UserTest {
	private static final Logger logger = LoggerFactory.getLogger(UserTest.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		GogoUser user = new GogoUser();
		user.setUserId(1L);
		user.setUserType("l");
		user.setState("10A");
		logger.debug("test", user);
		userService.insertSelective(user);
		logger.debug("test", user);
	}
	
	
}
