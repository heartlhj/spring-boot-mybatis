/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lhj.gogo.admin.controller;

import java.text.MessageFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.lhj.gogo.admin.util.Base;
import com.lhj.gogo.admin.util.JSONUtil;
import com.lhj.gogo.admin.util.JsonUtils;
import com.lhj.gogo.admin.util.Jui;

/**
 * 控制基础类，所以controller都应该继承这个类
 * 
 * @author wujing
 */
public class BaseController extends Base implements ApplicationContextAware {

	public static final String TEXT_UTF8 = "text/html;charset=UTF-8";
	public static final String JSON_UTF8 = "application/json;charset=UTF-8";
	public static final String XML_UTF8 = "application/xml;charset=UTF-8";

	public static final String LIST = "list";
	public static final String VIEW = "view";
	public static final String ADD = "add";
	public static final String SAVE = "save";
	public static final String EDIT = "edit";
	public static final String UPDATE = "update";
	public static final String DELETE = "delete";
	public static final String PAGE = "page";
	
	@Autowired
	private ApplicationContext applicationContext;
	
	private static final JsonUtils jsonUtils = JsonUtils.getInstance();

	public static String redirect(String format, Object... arguments) {
		return new StringBuffer("redirect:").append(MessageFormat.format(format, arguments)).toString();
	}

	public static String success(String navTabId) {
		return JSONUtil.toJSONString(new Jui(200, navTabId, "操作成功", "closeCurrent"));
	}

	public static String delete(String navTabId) {
		return JSONUtil.toJSONString(new Jui(200, navTabId, "操作成功", ""));
	}

	public static String error(String message) {
		return JSONUtil.toJSONString(new Jui(300, "", message, ""));
	}
	/**
	 * 从请求对象中获取知道名称的参数值
	 * 
	 * @param request
	 * @param name
	 * @return
	 */
	protected String getParameterFromRequest(HttpServletRequest request, String name) {
		if (logger.isDebugEnabled()) {
			logger.debug("getParameterFromRequest name:{}", name);
		}
		String value = null;
		if (request.getParameter(name) != null) {
			value = request.getParameter(name).toString();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("getParameterFromRequest name:{},value:{}", name, value);
		}

		return value;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}
	
	/**
	 * 将结果集转为dataGrid使用的json
	 * @param page 当前第几页
	 * @param total 一共多少页
	 * @param records 一共多少条记录 
	 * @param dataList 数据
	 * @return
	 */
	protected String toDataGridJson(Integer page, Integer total, Integer records, List<?> dataList) {
//		Gson gson = new GsonBuilder().setDateFormat(DATE_FORMET).serializeNulls().create(); // 值为空时name:
		// ""，默认是没有这个name

		StringBuilder jsonStr = new StringBuilder("{");
		jsonStr.append("\"page\": ");
		jsonStr.append(page == null ? 1: page);
		jsonStr.append(", \"total\": ");
		jsonStr.append(total == null ? 1: total);
		jsonStr.append(", \"records\": ");
		jsonStr.append(records == null ? -1: records);
		jsonStr.append(", \"root\": ");
//		JsonUtils.toJsonString(obj)
		jsonStr.append(jsonUtils.objectToJson(dataList));
		jsonStr.append("}");

		return jsonStr.toString();

	}
	
}
