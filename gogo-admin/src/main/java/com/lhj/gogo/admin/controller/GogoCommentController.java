
package com.lhj.gogo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhj.gogo.admin.model.GogoComment;
import com.lhj.gogo.admin.model.GogoResource;
import com.lhj.gogo.admin.service.GogoCommentService;
import com.lhj.gogo.admin.service.GogoResourceService;

/**
 * 
 *
 * @date 2018年2月23日 下午7:54:09
 * @author lhj
 * @Description: 评论
 *
 */
@Controller
public class GogoCommentController extends BaseController {

	private final static String TARGETID = "admin-resources";
	@Autowired
	private GogoCommentService gogoCommentService;
	
	@Autowired
	private GogoResourceService gogoResourceService;
	
	@RequestMapping(value = "system/comment/save")
	public String save(GogoComment gogoComment, ModelMap modelMap){
		gogoCommentService.insert(gogoComment);
		String id = gogoComment.getResourceId();
		GogoResource gogoResource =  gogoResourceService.selectByPrimaryKey(id);
		
		List<GogoComment> gogoComments = gogoCommentService.qryCommentList(id);
//		for(GogoComment gogoComment : gogoComments) {
//			gogoComment.setCteateTimeToS(gogoComment.getCteateTime().toString());
//		}
		int count = (int)gogoCommentService.qryCommentListCount(id);
		modelMap.put("gogoResource", gogoResource);
		modelMap.put("gogoComments", gogoComments);
		modelMap.put("count", count);
		return "/index/post";
	}
	
	
}
