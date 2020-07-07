package com.tontron.common.service;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpAlbum;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpAlbum业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface CpAlbumService {

    /***
     * CpAlbum多条件分页查询
     * @param cpAlbum
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpAlbum> findPage(CpAlbum cpAlbum, int page, int size);

    /***
     * CpAlbum分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<CpAlbum> findPage(int page, int size);

    /***
     * CpAlbum多条件搜索方法
     * @param cpAlbum
     * @return
     */
    List<CpAlbum> findList(CpAlbum cpAlbum);

    /***
     * 删除CpAlbum
     * @param id
     */
    void delete(Long id);

    /***
     * 修改CpAlbum数据
     * @param cpAlbum
     */
    void update(CpAlbum cpAlbum);

    /***
     * 新增CpAlbum
     * @param cpAlbum
     */
    void add(CpAlbum cpAlbum);

    /**
     * 根据ID查询CpAlbum
     * @param id
     * @return
     */
     CpAlbum findById(Long id);

    /***
     * 查询所有CpAlbum
     * @return
     */
    List<CpAlbum> findAll();
}
