package com.lhj.gogo.admin.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhj.gogo.admin.dao.GogoCommentMapper;
import com.lhj.gogo.admin.dao.SystemUserMapper;
import com.lhj.gogo.admin.model.GogoComment;
import com.lhj.gogo.admin.service.GogoCommentService;
import com.lhj.gogo.admin.util.DateUtils;
import com.lhj.gogo.admin.util.UUIDBuild;

@Service("gogoCommentService")
public class GogoCommentServiceImpl implements GogoCommentService {
	@Autowired
	private GogoCommentMapper gogoCommentMapper;
	@Autowired
	private SystemUserMapper systemUserMapper;
	@Override
	public int deleteByPrimaryKey(String id) {
		return gogoCommentMapper.deleteByPrimaryKey(id);
	}
	@Override
	public int insert(GogoComment record) {
		int layer = (int)qryCommentListCount(record.getResourceId());
		record.setId(UUIDBuild.getUUID());
		record.setCteateTime(DateUtils.now());
		record.setState("10A");
		record.setLayer(layer);
		return gogoCommentMapper.insert(record);
	}
	@Override
	public int insertSelective(GogoComment record) {
		return gogoCommentMapper.insertSelective(record);
	}
	@Override
	public GogoComment selectByPrimaryKey(String id) {
		return gogoCommentMapper.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(GogoComment record) {
		return gogoCommentMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int updateByPrimaryKey(GogoComment record) {
		return gogoCommentMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<GogoComment> qryCommentList(String id) {
		return gogoCommentMapper.selectCommentList(id);
	}
	@Override
	public long qryCommentListCount(String id) {
		return gogoCommentMapper.selectCommentListCount(id);
	}
	

}
