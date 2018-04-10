package com.lhj.gogo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhj.gogo.admin.dao.GogoResourceMapper;
import com.lhj.gogo.admin.dao.SystemUserMapper;
import com.lhj.gogo.admin.model.GogoResource;
import com.lhj.gogo.admin.service.GogoResourceService;
import com.lhj.gogo.admin.util.DateUtils;
import com.lhj.gogo.admin.util.UUIDBuild;

@Service("gogoResourceService")
public class GogoResourceServiceImpl implements GogoResourceService {
	@Autowired
	private GogoResourceMapper gogoResourceMapper;
	@Autowired
	private SystemUserMapper systemUserMapper;
	@Override
	public int insertSelective(GogoResource record) {
		record.setId(UUIDBuild.getUUID());
		record.setState("10A");
//		record.setYearType("2000");
		record.setCreateTime(DateUtils.now());
		return gogoResourceMapper.insertSelective(record);
	}
	@Override
	public List<GogoResource> qryResourceList(GogoResource qo) {
		return gogoResourceMapper.selectResourceList(qo);
	}
	@Override
	public int qryResourceCount(GogoResource gogoResource) {
		return gogoResourceMapper.selectResourceCount(gogoResource);
	}
	@Override
	public GogoResource selectByPrimaryKey(String id) {
		return gogoResourceMapper.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(GogoResource record) {
		return gogoResourceMapper.updateByPrimaryKeySelective(record);
	}

}
