package com.lhj.gogo.admin.service;

import java.util.List;

import com.lhj.gogo.admin.model.GogoComment;

public interface GogoCommentService {
	 int deleteByPrimaryKey(String id);

	    int insert(GogoComment record);

	    int insertSelective(GogoComment record);

	    GogoComment selectByPrimaryKey(String id);

	    int updateByPrimaryKeySelective(GogoComment record);

	    int updateByPrimaryKey(GogoComment record);

		List<GogoComment> qryCommentList(String id);

		long qryCommentListCount(String id);

}
