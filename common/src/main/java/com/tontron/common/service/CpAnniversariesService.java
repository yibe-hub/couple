package com.tontron.common.service;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpAnniversaries;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpAnniversaries业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CpAnniversariesService {

    /***
     * CpAnniversaries多条件分页查询
     * @param cpAnniversaries
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpAnniversaries> findPage(CpAnniversaries cpAnniversaries, int page, int size);

    /***
     * CpAnniversaries分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpAnniversaries> findPage(int page, int size);

    /***
     * CpAnniversaries多条件搜索方法
     * @param cpAnniversaries
     * @return
     */
    List<CpAnniversaries> findList(CpAnniversaries cpAnniversaries);

    /***
     * 删除CpAnniversaries
     * @param id
     */
    void delete(Long id);

    /***
     * 修改CpAnniversaries数据
     * @param cpAnniversaries
     */
    void update(CpAnniversaries cpAnniversaries);

    /***
     * 新增CpAnniversaries
     * @param cpAnniversaries
     */
    void add(CpAnniversaries cpAnniversaries);

    /**
     * 根据ID查询CpAnniversaries
     * @param id
     * @return
     */
     CpAnniversaries findById(Long id);

    /***
     * 查询所有CpAnniversaries
     * @return
     */
    List<CpAnniversaries> findAll();
}
