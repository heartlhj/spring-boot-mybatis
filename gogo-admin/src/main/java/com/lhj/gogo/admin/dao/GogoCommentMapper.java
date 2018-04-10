package com.lhj.gogo.admin.dao;

import java.util.List;

import com.lhj.gogo.admin.model.GogoComment;

public interface GogoCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(GogoComment record);

    int insertSelective(GogoComment record);

    GogoComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GogoComment record);

    int updateByPrimaryKey(GogoComment record);

	List<GogoComment> selectCommentList(String id);

	long selectCommentListCount(String id);
}