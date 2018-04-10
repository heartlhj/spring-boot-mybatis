//package com.lhj.gogo.basic.controller;
//
//import java.util.Date;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.lhj.gogo.basic.model.GogoUser;
//import com.lhj.gogo.basic.service.UserService;
//
//@Controller
//public class SystemController {
//	@Value("${application.message:Hello World}")
//	private String message = "Hello World";
//	
//	@Autowired
//	private UserService userService;
//	@RequestMapping("/system/title")
//	public String index(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/title";
//	}
//	
//	@RequestMapping("/system/loading")
//	public String loading(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/loading";
//	}
//	
//	@RequestMapping("/system/left")
//	public String left(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/left";
//	}
//	
////	@RequestMapping("/system/login")
////	public String login1(Map<String, Object> model) {
////		model.put("time", new Date());
////		model.put("message", this.message);
////		return "login";
////	}
//	@RequestMapping("/system/index")
//	public String index1(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "index";
//	}
//	@RequestMapping("/system/change1")
//	public String change1(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/change1";
//	}
//	
//	@RequestMapping("/insertUser")
//	public String insertUser(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		GogoUser user = new GogoUser();
//		user.setUserId(120L);
//		user.setUserPassword("123");
//		userService.insertSelective(user);
//		return "welcome";
//	}
//	
//}
