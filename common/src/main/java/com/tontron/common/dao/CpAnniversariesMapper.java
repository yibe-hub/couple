package com.tontron.common.dao;

import com.tontron.common.model.CpAnniversaries;

public interface CpAnniversariesMapper {
    int deleteByPrimaryKey(Long annId);

    int insert(CpAnniversaries record);

    int insertSelective(CpAnniversaries record);

    CpAnniversaries selectByPrimaryKey(Long annId);

    int updateByPrimaryKeySelective(CpAnniversaries record);

    int updateByPrimaryKey(CpAnniversaries record);
}