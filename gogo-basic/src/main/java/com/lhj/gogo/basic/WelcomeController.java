///*
// * Copyright 2012-2016 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package com.lhj.gogo.basic;
//
//import java.util.Date;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.lhj.gogo.basic.dao.GogoUserMapper;
//import com.lhj.gogo.basic.model.GogoUser;
//import com.lhj.gogo.basic.service.UserService;
//
//@Controller
//public class WelcomeController {
//	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
//	@Value("${application.message:Hello World}")
//	private String message = "Hello World";
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private GogoUserMapper gogoUserMapper;
//	@RequestMapping("/")
//	public String welcome(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "welcome";
//	}
//	@RequestMapping("/user")
//	public String user(Map<String, Object> model) {
//		GogoUser user = new GogoUser();
//		user.setUserId(11L);
//		user.setUserType("l");
//		user.setState("10A");
//		logger.debug("test", user);
//		userService.insertSelective(user);
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "welcome";
//	}
//	@RequestMapping("/user1")
//	public String user1(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "welcome";
//	}
//	@RequestMapping("/login")
//	public String login(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "base/login";
//	}
//	
//	@RequestMapping("/index")
//	public String index(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/home";
//	}
//}
