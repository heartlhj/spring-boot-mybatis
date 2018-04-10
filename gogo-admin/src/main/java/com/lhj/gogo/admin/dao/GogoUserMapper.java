package com.lhj.gogo.admin.dao;

import java.math.BigDecimal;

import com.lhj.gogo.admin.model.GogoUser;

public interface GogoUserMapper {
    int deleteByPrimaryKey(BigDecimal userId);

    int insert(GogoUser record);

    int insertSelective(GogoUser record);

    GogoUser selectByPrimaryKey(BigDecimal userId);

    int updateByPrimaryKeySelective(GogoUser record);

    int updateByPrimaryKey(GogoUser record);
}