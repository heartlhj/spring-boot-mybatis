package com.lhj.gogo.admin.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lhj.gogo.admin.enums.UserSexEnum;
import com.lhj.gogo.admin.enums.UserStatusEnum;
import com.lhj.gogo.admin.model.GogoSystemMenu;
import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.service.GogoSystemMenuService;
import com.lhj.gogo.admin.util.UUIDBuild;

@Controller
public class GogoSystemMenuController {
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	@Autowired 
	private GogoSystemMenuService service;
	@RequestMapping("/admin/login")
	public String index(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "login";
	}
	
	@RequestMapping("/admin/index")
	public String loading(Map<String, Object> model) {
		List<GogoSystemMenu> lists = service.qryGogoSystemMenu();
		model.put("lists", lists);
		return "index";
	}
	
	@RequestMapping("/admin/main")
	public String left(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "main";
	}
	
	@RequestMapping("/system/login")
	public String login1(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "login";
	}
	@RequestMapping("/inset")
	public String index1(Map<String, Object> model) {
//		GogoSystemMenu 	gogoSystemMenu = new GogoSystemMenu();
//		gogoSystemMenu.setParentId(UUIDBuild.getUUID());
//		gogoSystemMenu.setMenuId(UUIDBuild.getUUID());
//		gogoSystemMenu.setMenuName("123");
//		gogoSystemMenu.setMenuUrl("hjjj");
//		gogoSystemMenuService.insertSelective(gogoSystemMenu);
		
		List<GogoSystemMenu> lists = service.qryGogoSystemMenu();
		model.put("lists", lists);
		return "index";
	}
	
	@RequestMapping("/system/user")
	public String user(@RequestParam(value = "pageNum", defaultValue = "0") int pageCurrent, @RequestParam(value = "numPerPage", defaultValue = "20") int pageSize, SystemUser qo,Map<String, Object> modelMap) {
//		List<GogoSystemMenu> lists = service.qryGogoSystemMenu();
//		modelMap.put("lists", lists);
		int count = (int)service.userListCount(qo);
//		int total = qo.getTotalPage(count);
		modelMap.put("page", qo);
		modelMap.put("pageCurrent", qo.getCurrentPage());
		modelMap.put("pageSize", qo.getPageSize());
		List<SystemUser> users =  service.userList(qo);
		modelMap.put("user",users);
		modelMap.put("userSexEnums", UserSexEnum.values());
		modelMap.put("userStatusEnums", UserStatusEnum.values());
		return "/admin/sysUser/list";
	}
}
