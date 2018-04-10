package com.lhj.gogo.admin.dao;

import com.lhj.gogo.admin.model.SysStatic;

public interface SysStaticMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysStatic record);

    int insertSelective(SysStatic record);

    SysStatic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysStatic record);

    int updateByPrimaryKey(SysStatic record);
}