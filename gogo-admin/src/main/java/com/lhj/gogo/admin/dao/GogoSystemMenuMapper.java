package com.lhj.gogo.admin.dao;

import java.util.List;

import com.lhj.gogo.admin.model.GogoSystemMenu;
import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.util.Page;
import com.lhj.gogo.admin.util.SysUserExample;

public interface GogoSystemMenuMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(GogoSystemMenu record);

    int insertSelective(GogoSystemMenu record);

    GogoSystemMenu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(GogoSystemMenu record);

    int updateByPrimaryKey(GogoSystemMenu record);
    
    List<GogoSystemMenu> selectGogoSystemMenu();

	Page<SystemUser> listForPage(int pageCurrent, int pageSize, SysUserExample example);
}