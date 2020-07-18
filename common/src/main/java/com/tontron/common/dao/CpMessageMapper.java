package com.tontron.common.dao;

import com.tontron.common.model.CpMessage;

public interface CpMessageMapper {
    int deleteByPrimaryKey(Long messageId);

    int insert(CpMessage record);

    int insertSelective(CpMessage record);

    CpMessage selectByPrimaryKey(Long messageId);

    int updateByPrimaryKeySelective(CpMessage record);

    int updateByPrimaryKey(CpMessage record);
}