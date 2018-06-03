package com.lhj.gogo.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.lhj.gogo.admin.model.GogoUser;
import com.lhj.gogo.admin.service.UserService;
//import com.lhj.gogo.admin.WebSecurityConfig;
import com.lhj.gogo.admin.util.JsonUtils;
import com.lhj.gogo.admin.util.MD5Util;


@Controller
public class LoginController extends BaseController {
	
		private static final JsonUtils jsonUtils = JsonUtils.getInstance();
	   @Autowired
		private UserService userService;
//		@GetMapping("/")
//	    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account, Model model) {
//	        model.addAttribute("name", account);
//	        return "index";
//	    }

	    @GetMapping("/login")
	    public String login() {
	        return "login";
	    }

	    @PostMapping("/loginPost")
	    public @ResponseBody Map<String, Object> loginPost(String userName, String userPassword,String checkbox, HttpSession session) {
	        Map<String, Object> map = new HashMap<>();
	        GogoUser user = new GogoUser();
	        user.setUserName(userName);
	        GogoUser gogoUser =  userService.qryGogoUserByUser(user);
	        String md5Pwd = MD5Util.MD5(userPassword);
	        if (!md5Pwd.equals(gogoUser.getUserPassword())) {
	            map.put("success", false);
	            map.put("message", "密码错误");
	            return map;
	        }

	        // 设置session
	        gogoUser.setCheckbox(checkbox);
	        session.setAttribute("mySessionUser", jsonUtils.objectToJson(gogoUser));
	        gogoUser.setUserPassword(null);
	        map.put("mySessionUser", jsonUtils.objectToJson(gogoUser));
	        map.put("success", true);
	        map.put("message", "登录成功");
	        return map;
	    }

	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        // 移除session
	        session.removeAttribute("mySessionUser");
	        return "redirect:/index/main";
	    }
}
