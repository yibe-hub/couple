package com.tontron.common.dao;

import com.tontron.common.model.CpAlbum;

public interface CpAlbumMapper {
    int deleteByPrimaryKey(Long albumId);

    int insert(CpAlbum record);

    int insertSelective(CpAlbum record);

    CpAlbum selectByPrimaryKey(Long albumId);

    int updateByPrimaryKeySelective(CpAlbum record);

    int updateByPrimaryKey(CpAlbum record);
}