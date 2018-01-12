package com.lhj.gogo.basic.dao;

import com.lhj.gogo.basic.model.GogoUser;
import java.math.BigDecimal;

public interface GogoUserMapper {
    int deleteByPrimaryKey(BigDecimal userId);

    int insert(GogoUser record);

    int insertSelective(GogoUser record);

    GogoUser selectByPrimaryKey(BigDecimal userId);

    int updateByPrimaryKeySelective(GogoUser record);

    int updateByPrimaryKey(GogoUser record);
}