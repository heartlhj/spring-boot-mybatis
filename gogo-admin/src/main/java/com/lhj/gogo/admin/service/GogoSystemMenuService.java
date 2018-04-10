package com.lhj.gogo.admin.service;

import java.util.List;

import com.lhj.gogo.admin.model.GogoSystemMenu;
import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.util.Page;

public interface GogoSystemMenuService {
	int insertSelective(GogoSystemMenu user);

	List<GogoSystemMenu> qryGogoSystemMenu();

	Page<SystemUser> listForPage(int pageCurrent, int pageSize, SystemUser qo);

	int save(SystemUser qo);

	List<SystemUser> userList(SystemUser qo);

	long userListCount(SystemUser qo);
}
