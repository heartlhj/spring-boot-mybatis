package com.lhj.gogo.admin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhj.gogo.admin.enums.UserSexEnum;
import com.lhj.gogo.admin.enums.UserStatusEnum;
import com.lhj.gogo.admin.model.GogoUser;
import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.service.GogoSystemMenuService;
import com.lhj.gogo.admin.service.UserService;

/**
 * 后台用户信息 
 *
 * @author wujing
 * @since 2017-10-25
 */
@Controller
public class SysUserController extends BaseController {

	private final static String TARGETID = "admin-sysUser";

	@Autowired
	private GogoSystemMenuService service;
	@Autowired
	private UserService userService;
	@RequestMapping(value = "system/list")
	public void list(@RequestParam(value = "pageNum", defaultValue = "0") int pageCurrent, @RequestParam(value = "numPerPage", defaultValue = "20") int pageSize, SystemUser qo, ModelMap modelMap){
		modelMap.put("page", service.userList(qo));
		modelMap.put("pageCurrent", qo.getCurrentPage());
		modelMap.put("pageSize", qo.getPageSize());
		modelMap.put("bean", qo);
		modelMap.put("userSexEnums", UserSexEnum.values());
		modelMap.put("userStatusEnums", UserStatusEnum.values());
	}
	
	@RequestMapping(value = "/admin/sysUser/add")
	public String add(Map<String, Object> modelMap){
		modelMap.put("userSexEnums", UserSexEnum.values());
		return "/admin/sysUser/add";
	}
	
	@ResponseBody
	@RequestMapping(value = "/admin/sysUser/save")
	public String save(SystemUser user){
		if (service.save(user) > 0) {
			return success(TARGETID);
		}
		return error("添加失败");
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam(value = "id") Long id){
//		if (service.deleteById(id) > 0) {
//			return delete(TARGETID);
//		}
		return error("删除失败");
	}
	
	@RequestMapping(value = "/edit")
	public void edit(@RequestParam(value = "id") Long id, ModelMap modelMap){
//		modelMap.put("bean", service.getById(id));
		modelMap.put("userSexEnums", UserSexEnum.values());
		modelMap.put("userStatusEnums", UserStatusEnum.values());
	}
	
	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(SystemUser user){
//		if (service.updateById(qo) > 0) {
//			return success(TARGETID);
//		}
		return error("修改失败");
	}
	
	@RequestMapping(value = "/view")
	public void view(@RequestParam(value = "id") Long id, ModelMap modelMap){
		//modelMap.put("bean", service.getById(id));
		modelMap.put("userSexEnums", UserSexEnum.values());
		modelMap.put("userStatusEnums", UserStatusEnum.values());
	}
	@RequestMapping(value = "/user")
	public void user(@RequestParam(value = "id") Long id, ModelMap modelMap){
		//modelMap.put("bean", service.getById(id));
		modelMap.put("userSexEnums", UserSexEnum.values());
		modelMap.put("userStatusEnums", UserStatusEnum.values());
		GogoUser user = new GogoUser();
		user.setUserId(12L);
		user.setUserPassword("123");
		userService.insertSelective(user);
	}
	
}
