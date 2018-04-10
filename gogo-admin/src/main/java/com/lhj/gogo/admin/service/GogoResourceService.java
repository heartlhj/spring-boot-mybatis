package com.lhj.gogo.admin.service;

import java.util.List;

import com.lhj.gogo.admin.model.GogoResource;

public interface GogoResourceService {
	 
	GogoResource selectByPrimaryKey(String id);
	int insertSelective(GogoResource record);

	List<GogoResource> qryResourceList(GogoResource qo);

	int qryResourceCount(GogoResource gogoResource);
	
	int updateByPrimaryKeySelective(GogoResource record);
}
