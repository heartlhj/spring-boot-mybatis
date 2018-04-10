package com.lhj.gogo.admin.dao;

import java.util.List;

import com.lhj.gogo.admin.model.SystemUser;
import com.lhj.gogo.admin.util.Page;

public interface SystemUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    SystemUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);

	Page<SystemUser> listForPage(SystemUser qo);

	List<SystemUser> selectUserList(SystemUser qo);

	long selectUserListCount(SystemUser qo);
}