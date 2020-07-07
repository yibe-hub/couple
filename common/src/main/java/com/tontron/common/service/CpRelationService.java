package com.tontron.common.service;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpRelation;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpRelation业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CpRelationService {

    /***
     * CpRelation多条件分页查询
     * @param cpRelation
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpRelation> findPage(CpRelation cpRelation, int page, int size);

    /***
     * CpRelation分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpRelation> findPage(int page, int size);

    /***
     * CpRelation多条件搜索方法
     * @param cpRelation
     * @return
     */
    List<CpRelation> findList(CpRelation cpRelation);

    /***
     * 删除CpRelation
     * @param id
     */
    void delete(Long id);

    /***
     * 修改CpRelation数据
     * @param cpRelation
     */
    void update(CpRelation cpRelation);

    /***
     * 新增CpRelation
     * @param cpRelation
     */
    void add(CpRelation cpRelation);

    /**
     * 根据ID查询CpRelation
     * @param id
     * @return
     */
     CpRelation findById(Long id);

    /***
     * 查询所有CpRelation
     * @return
     */
    List<CpRelation> findAll();
}
