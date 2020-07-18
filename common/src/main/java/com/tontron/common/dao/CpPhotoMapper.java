package com.tontron.common.dao;

import com.tontron.common.model.CpPhoto;

public interface CpPhotoMapper {
    int deleteByPrimaryKey(Long photoId);

    int insert(CpPhoto record);

    int insertSelective(CpPhoto record);

    CpPhoto selectByPrimaryKey(Long photoId);

    int updateByPrimaryKeySelective(CpPhoto record);

    int updateByPrimaryKey(CpPhoto record);
}