package com.tontron.common.dao;

import com.tontron.common.model.CpUser;

public interface CpUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(CpUser record);

    int insertSelective(CpUser record);

    CpUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(CpUser record);

    int updateByPrimaryKey(CpUser record);
}