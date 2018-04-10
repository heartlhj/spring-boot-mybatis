package com.lhj.gogo.start.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhj.gogo.admin.dao.GogoSystemMenuMapper;
import com.lhj.gogo.admin.dao.SystemUserMapper;
import com.lhj.gogo.admin.model.GogoSystemMenu;
import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.service.GogoSystemMenuService;
import com.lhj.gogo.admin.util.Page;
import com.lhj.gogo.admin.util.PageUtil;
import com.lhj.gogo.admin.util.UUIDBuild;

@Service("gogoSystemMenuService")
public class GogoSystemMenuServiceImpl implements GogoSystemMenuService {
	@Autowired
	private GogoSystemMenuMapper gogoSystemMenuMapper;
	@Autowired
	private SystemUserMapper systemUserMapper;
	@Override
	public int insertSelective(GogoSystemMenu user) {
		return gogoSystemMenuMapper.insertSelective(user);
	}
	@Override
	public List<GogoSystemMenu> qryGogoSystemMenu() {
		return gogoSystemMenuMapper.selectGogoSystemMenu();
	}
	@Override
	public Page<SystemUser> listForPage(int pageCurrent, int pageSize, SystemUser qo) {
		qo.setPageCurrent(pageCurrent);
		qo.setPageSize(pageSize);
		Page<SystemUser> page = systemUserMapper.listForPage(qo);
		return PageUtil.transform(page, SystemUser.class);
	}
	@Override
	public int save(SystemUser qo) {
		qo.setId(UUIDBuild.getUUID());
		return systemUserMapper.insertSelective(qo);
	}
	@Override
	public List<SystemUser> userList(SystemUser qo) {
		
		return systemUserMapper.selectUserList(qo);
	}
	@Override
	public long userListCount(SystemUser qo) {
		return systemUserMapper.selectUserListCount(qo);
	}

}
