package com.lhj.gogo.admin.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhj.gogo.admin.enums.ResourcePathTypeEnum;
import com.lhj.gogo.admin.enums.ResourceTypeEnum;
import com.lhj.gogo.admin.enums.ResoureStatusEnum;
import com.lhj.gogo.admin.enums.UserSexEnum;
import com.lhj.gogo.admin.enums.UserStatusEnum;
import com.lhj.gogo.admin.model.GogoResource;
import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.service.GogoResourceService;
import com.lhj.gogo.admin.service.impl.ResourceImportServiceImpl;
import com.lhj.gogo.admin.util.HxlsRead;

@Controller
public class GogoResourceController extends BaseController{
	
	private final static String TARGETID = "admin-resources";
	@Autowired
	private GogoResourceService gogoResourceService;
	
	@RequestMapping(value = "system/resource/list")
	public String list(@RequestParam(value = "pageNum", defaultValue = "0") int pageCurrent, @RequestParam(value = "numPerPage", defaultValue = "20") int pageSize, GogoResource qo, ModelMap modelMap){
		modelMap.put("page", qo);
		modelMap.put("pageCurrent", qo.getCurrentPage());
		modelMap.put("pageSize", qo.getPageSize());
		modelMap.put("resource", gogoResourceService.qryResourceList(qo));
		modelMap.put("resourcePathTypes", ResourcePathTypeEnum.values());
		modelMap.put("resourceTypes", ResourceTypeEnum.values());
		modelMap.put("resoureStatusEnums", ResoureStatusEnum.values());
		
		return "/admin/resources/list";
	}
	
	@RequestMapping(value = "/system/resource/add")
	public String add(Map<String, Object> modelMap){
		modelMap.put("resourcePathTypes", ResourcePathTypeEnum.values());
		modelMap.put("resourceTypes", ResourceTypeEnum.values());
		modelMap.put("resoureStatusEnums", ResoureStatusEnum.values());
		return "/admin/resources/add";
	}
	
	@ResponseBody
	@RequestMapping(value = "/system/resource/save")
	public String save(GogoResource gogoResource){
		if (gogoResourceService.insertSelective(gogoResource) > 0) {
			return success(TARGETID);
		}
		return error("添加失败");
	}
	
	@RequestMapping(value = "/system/resource/resourceAdd")
	public String resourceAdd(GogoResource gogoResource){
		HxlsRead xls2csv;
		try {
			xls2csv = new HxlsRead("E:\\gogoResource-langer.xls",0,new ResourceImportServiceImpl());
			xls2csv.process();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return error("添加失败");
	}
	
	
}
