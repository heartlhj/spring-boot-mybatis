//package com.lhj.gogo.web.controller;
//
//import java.util.Date;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.lhj.gogo.basic.model.GogoResource;
//import com.lhj.gogo.basic.model.GogoUser;
//import com.lhj.gogo.basic.service.GogoResourceService;
//import com.lhj.gogo.basic.service.UserService;
//
//@Controller
//public class GogoResourcesController {
//	@Value("${application.message:Hello World}")
//	private String message = "Hello World";
//	@Autowired
//	private GogoResourceService gogoResourceService;
//	@Autowired
//	private UserService userService;
//	@RequestMapping("/resource/title")
//	public String index(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/title";
//	}
//	
//	@RequestMapping("/resource/loading")
//	public String loading(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/loading";
//	}
//	
//	@RequestMapping("/resource/left")
//	public String left(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/left";
//	}
//	
//	@RequestMapping("/resource/login")
//	public String login1(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "login";
//	}
//	@RequestMapping("/resource/index")
//	public String index1(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		GogoUser user = new GogoUser();
//		user.setUserId(120L);
//		user.setUserPassword("123");
//		userService.insertSelective(user);
//		return "welcome";
//	}
//	@RequestMapping("/resource/change1")
//	public String change1(Map<String, Object> model) {
//		model.put("time", new Date());
//		model.put("message", this.message);
//		return "menu/change1";
//	}
//}
