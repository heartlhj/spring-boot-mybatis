package com.lhj.gogo.admin.dao;

import java.util.List;

import com.lhj.gogo.admin.model.GogoResource;

public interface GogoResourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(GogoResource record);

    int insertSelective(GogoResource record);

    GogoResource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GogoResource record);

    int updateByPrimaryKey(GogoResource record);

	List<GogoResource> selectResourceList(GogoResource qo);

	int selectResourceCount(GogoResource gogoResource);
}