package com.lhj.gogo.admin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhj.gogo.admin.enums.UserSexEnum;
import com.lhj.gogo.admin.enums.UserStatusEnum;
import com.lhj.gogo.admin.model.GogoComment;
import com.lhj.gogo.admin.model.GogoResource;
import com.lhj.gogo.admin.model.GogoUser;
import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.service.GogoCommentService;
import com.lhj.gogo.admin.service.GogoResourceService;
import com.lhj.gogo.admin.service.GogoSystemMenuService;
import com.lhj.gogo.admin.service.UserService;
import com.lhj.gogo.admin.util.JsonUtils;
import com.lhj.gogo.admin.util.QRUtil;

/**
 * 
 *
 * @date 2018年1月24日 下午10:01:16
 * @author lhj
 * @Description: 前台
 *
 */
@Controller
public class IndexController extends BaseController {

	private final static String TARGETID = "admin-index";
	private static final JsonUtils jsonUtils = JsonUtils.getInstance();

	@Autowired
	private UserService userService;
	@Autowired
	private GogoResourceService gogoResourceService;
	@Autowired
	private GogoCommentService gogoCommentService;
	@RequestMapping(value = "/index")
	public String index(@RequestParam(value = "pageNum", defaultValue = "0") int pageCurrent, @RequestParam(value = "numPerPage", defaultValue = "20") int pageSize, SystemUser qo, ModelMap modelMap){
		modelMap.put("massage", "hello work");
		return "/index/index";
	}
	
	
	@RequestMapping(value = "/index/main")
	public String main(@RequestParam(value = "pageNum", defaultValue = "0") int pageCurrent, @RequestParam(value = "numPerPage", defaultValue = "20") int pageSize, SystemUser qo, ModelMap modelMap){
		modelMap.put("massage", "hello work");
		return "/index/main";
	}
	@RequestMapping(value = "/index/posts")
	public String post(@RequestParam(value = "id")String id,HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		GogoResource gogoR = gogoResourceService.selectByPrimaryKey(id);
		int click = gogoR.getClick();
		click = click+1;
		gogoR.setClick(click);
		gogoResourceService.updateByPrimaryKeySelective(gogoR);
		GogoResource gogoResource =  gogoResourceService.selectByPrimaryKey(id);
		
		List<GogoComment> gogoComments = gogoCommentService.qryCommentList(id);
		for(GogoComment gogoComment : gogoComments) {
			gogoComment.setCteateTimeToS(gogoComment.getCteateTime().toString());
		}
		int count = (int)gogoCommentService.qryCommentListCount(id);
		modelMap.put("gogoResource", gogoResource);
		modelMap.put("gogoComments", gogoComments);
		modelMap.put("count", count);
		return "/index/post";
	}
	
	@RequestMapping(value = "/index/redirectIndex")
	public String redirectIndex(HttpServletResponse response,ModelMap modelMap){
		modelMap.put("massage", "hello work");
		return "redirect:/index/post";
	}
	@RequestMapping(value = "/system/topRes")
	@ResponseBody
	public Object qryWaitOutList(HttpServletRequest request,HttpServletResponse response, Model model) {
		if(logger.isDebugEnabled()){
			logger.debug("请求参数  createOrModify getParameterMap:{}",jsonUtils.objectToJson(request.getParameterMap()));
		}
		//业务逻辑开始
		String json = null;
		try {
			GogoResource  gogoResource = jsonUtils.jsonToObject(this.getParameterFromRequest(request, "params"),GogoResource.class);
			List<GogoResource> gogoResourceList = gogoResourceService.qryResourceList(gogoResource);
			int count = gogoResourceService.qryResourceCount(gogoResource);
			int total = gogoResource.getTotalPage(count);
			int page = gogoResource.getCurrentPage();
			json = this.toDataGridJson(page, total, count, gogoResourceList);
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return json;
	}
	
	@RequestMapping(value = "/system/qryMovicList")
	@ResponseBody
	public Object qryMovicList(HttpServletRequest request,HttpServletResponse response, Model model) {
		if(logger.isDebugEnabled()){
			logger.debug("请求参数  qryMovicList getParameterMap:{}",jsonUtils.objectToJson(request.getParameterMap()));
		}
		//业务逻辑开始
		String json = null;
		try {
			GogoResource  gogoResource = jsonUtils.jsonToObject(this.getParameterFromRequest(request, "params"),GogoResource.class);
			gogoResource.setResourceType("4");
			List<GogoResource> gogoResourceList = gogoResourceService.qryResourceList(gogoResource);
			int count = gogoResourceService.qryResourceCount(gogoResource);
			int total = gogoResource.getTotalPage(count);
			int page = gogoResource.getCurrentPage();
			json = this.toDataGridJson(page, total, count, gogoResourceList);
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return json;
	}
	
	@RequestMapping(value = "/system/qryBookItList")
	@ResponseBody
	public Object qryBookItList(HttpServletRequest request,HttpServletResponse response, Model model) {
		if(logger.isDebugEnabled()){
			logger.debug("请求参数  qryMovicList getParameterMap:{}",jsonUtils.objectToJson(request.getParameterMap()));
		}
		//业务逻辑开始
		String json = null;
		try {
			GogoResource  gogoResource = jsonUtils.jsonToObject(this.getParameterFromRequest(request, "params"),GogoResource.class);
			gogoResource.setResourceType("1");
			gogoResource.setYearType("IT");
			List<GogoResource> gogoResourceList = gogoResourceService.qryResourceList(gogoResource);
			int count = gogoResourceService.qryResourceCount(gogoResource);
			int total = gogoResource.getTotalPage(count);
			int page = gogoResource.getCurrentPage();
			json = this.toDataGridJson(page, total, count, gogoResourceList);
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return json;
	}
}
