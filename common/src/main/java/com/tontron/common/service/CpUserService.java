package com.tontron.common.service;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpUser;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpUser业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CpUserService {

    /***
     * CpUser多条件分页查询
     * @param cpUser
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpUser> findPage(CpUser cpUser, int page, int size);

    /***
     * CpUser分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpUser> findPage(int page, int size);

    /***
     * CpUser多条件搜索方法
     * @param cpUser
     * @return
     */
    List<CpUser> findList(CpUser cpUser);

    /***
     * 删除CpUser
     * @param id
     */
    void delete(Long id);

    /***
     * 修改CpUser数据
     * @param cpUser
     */
    void update(CpUser cpUser);

    /***
     * 新增CpUser
     * @param cpUser
     */
    void add(CpUser cpUser);

    /**
     * 根据ID查询CpUser
     * @param id
     * @return
     */
     CpUser findById(Long id);

    /***
     * 查询所有CpUser
     * @return
     */
    List<CpUser> findAll();
}
