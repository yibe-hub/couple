package com.tontron.common.service;

import com.github.pagehelper.PageInfo;
import com.tontron.common.entity.CpPhoto;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpPhoto业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CpPhotoService {

    /***
     * CpPhoto多条件分页查询
     * @param cpPhoto
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpPhoto> findPage(CpPhoto cpPhoto, int page, int size);

    /***
     * CpPhoto分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpPhoto> findPage(int page, int size);

    /***
     * CpPhoto多条件搜索方法
     * @param cpPhoto
     * @return
     */
    List<CpPhoto> findList(CpPhoto cpPhoto);

    /***
     * 删除CpPhoto
     * @param id
     */
    void delete(Long id);

    /***
     * 修改CpPhoto数据
     * @param cpPhoto
     */
    void update(CpPhoto cpPhoto);

    /***
     * 新增CpPhoto
     * @param cpPhoto
     */
    void add(CpPhoto cpPhoto);

    /**
     * 根据ID查询CpPhoto
     * @param id
     * @return
     */
     CpPhoto findById(Long id);

    /***
     * 查询所有CpPhoto
     * @return
     */
    List<CpPhoto> findAll();
}
