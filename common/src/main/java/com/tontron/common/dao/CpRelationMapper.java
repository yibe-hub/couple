package com.tontron.common.dao;

import com.tontron.common.model.CpRelation;

public interface CpRelationMapper {
    int deleteByPrimaryKey(Long relationId);

    int insert(CpRelation record);

    int insertSelective(CpRelation record);

    CpRelation selectByPrimaryKey(Long relationId);

    int updateByPrimaryKeySelective(CpRelation record);

    int updateByPrimaryKey(CpRelation record);
}