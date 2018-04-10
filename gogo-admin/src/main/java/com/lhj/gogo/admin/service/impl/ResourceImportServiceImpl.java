package com.lhj.gogo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.lhj.gogo.admin.controller.SpringContextUtils;
import com.lhj.gogo.admin.dao.GogoSystemMenuMapper;
import com.lhj.gogo.admin.dao.SystemUserMapper;
import com.lhj.gogo.admin.model.GogoResource;
import com.lhj.gogo.admin.service.GogoResourceService;
import com.lhj.gogo.admin.util.HxlsOptRowsInterface;
import com.lhj.gogo.admin.util.HxlsRead;


/**
 * 导入处理接口
 * @author Thinkpad
 *
 */
public class ResourceImportServiceImpl implements HxlsOptRowsInterface {
	
	private static ApplicationContext applicationContext;//启动类set入，调用下面set方法

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }
	/**
	 * 返回结果，成功返回1，失败返回0
	 */
	@Override
	public String optRows(int sheetIndex, int curRow, List<String> rowlist)
			throws Exception {

		//解析rowlist

		//获取流水号
		String name = rowlist.get(0);
		
		//获取通用名
		String path = rowlist.get(1);
		
		String type = rowlist.get(2);
		//构造一个po对象
//		Ypxx ypxx = new Ypxx(bm, mc, Float.parseFloat(zbjg));
		GogoResource gogoResource = new GogoResource();
		gogoResource.setResourceName(name);
		gogoResource.setResourcePath(path);
		gogoResource.setResourceType("4");
		gogoResource.setYearType(type);
		gogoResource.setResourcePathType("10B");
		//插入数据库。。。。
		System.out.println("导入数据。。。。。"+gogoResource.getResourceName());
		GogoResourceService gogoResourceService = applicationContext.getBean(GogoResourceService.class);
		gogoResourceService.insertSelective(gogoResource);
		return "1";
		
		
	}
	

}
