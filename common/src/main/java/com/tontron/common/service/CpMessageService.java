package com.tontron.common.service;

import com.github.pagehelper.PageInfo;
import com.tontron.common.entity.CpMessage;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpMessage业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CpMessageService {

    /***
     * CpMessage多条件分页查询
     * @param cpMessage
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpMessage> findPage(CpMessage cpMessage, int page, int size);

    /***
     * CpMessage分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpMessage> findPage(int page, int size);

    /***
     * CpMessage多条件搜索方法
     * @param cpMessage
     * @return
     */
    List<CpMessage> findList(CpMessage cpMessage);

    /***
     * 删除CpMessage
     * @param id
     */
    void delete(Long id);

    /***
     * 修改CpMessage数据
     * @param cpMessage
     */
    void update(CpMessage cpMessage);

    /***
     * 新增CpMessage
     * @param cpMessage
     */
    void add(CpMessage cpMessage);

    /**
     * 根据ID查询CpMessage
     * @param id
     * @return
     */
     CpMessage findById(Long id);

    /***
     * 查询所有CpMessage
     * @return
     */
    List<CpMessage> findAll();
}
