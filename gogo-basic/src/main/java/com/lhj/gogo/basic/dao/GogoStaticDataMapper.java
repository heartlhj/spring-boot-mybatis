package com.lhj.gogo.basic.dao;

import com.lhj.gogo.basic.model.GogoStaticData;
import java.math.BigDecimal;

public interface GogoStaticDataMapper {
    int deleteByPrimaryKey(BigDecimal dataId);

    int insert(GogoStaticData record);

    int insertSelective(GogoStaticData record);

    GogoStaticData selectByPrimaryKey(BigDecimal dataId);

    int updateByPrimaryKeySelective(GogoStaticData record);

    int updateByPrimaryKey(GogoStaticData record);
}