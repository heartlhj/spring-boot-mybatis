package com.lhj.gogo.basic.dao;

import com.lhj.gogo.basic.model.GogoResource;
import java.math.BigDecimal;

public interface GogoResourceMapper {
    int deleteByPrimaryKey(BigDecimal resourceId);

    int insert(GogoResource record);

    int insertSelective(GogoResource record);

    GogoResource selectByPrimaryKey(BigDecimal resourceId);

    int updateByPrimaryKeySelective(GogoResource record);

    int updateByPrimaryKey(GogoResource record);
}