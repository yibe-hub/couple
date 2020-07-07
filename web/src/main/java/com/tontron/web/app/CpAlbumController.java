package com.tontron.web.app;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpAlbum;
import com.tontron.common.service.CpAlbumService;
import com.tontron.common.pojo.Result;
import com.tontron.common.pojo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/cpAlbum")
@CrossOrigin
public class CpAlbumController {

    @Autowired
    private CpAlbumService cpAlbumService;

    /***
     * CpAlbum分页条件搜索实现
     * @param cpAlbum
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false)  CpAlbum cpAlbum, @PathVariable  int page, @PathVariable  int size){
        //调用CpAlbumService实现分页条件查询CpAlbum
        PageInfo<CpAlbum> pageInfo = cpAlbumService.findPage(cpAlbum, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * CpAlbum分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用CpAlbumService实现分页查询CpAlbum
        PageInfo<CpAlbum> pageInfo = cpAlbumService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param cpAlbum
     * @return
     */
    @PostMapping(value = "/search" )
    public Result<List<CpAlbum>> findList(@RequestBody(required = false)  CpAlbum cpAlbum){
        //调用CpAlbumService实现条件查询CpAlbum
        List<CpAlbum> list = cpAlbumService.findList(cpAlbum);
        return new Result<List<CpAlbum>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用CpAlbumService实现根据主键删除
        cpAlbumService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改CpAlbum数据
     * @param cpAlbum
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody  CpAlbum cpAlbum,@PathVariable Long id){
        //设置主键值
        cpAlbum.setAlbumId(id);
        //调用CpAlbumService实现修改CpAlbum
        cpAlbumService.update(cpAlbum);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增CpAlbum数据
     * @param cpAlbum
     * @return
     */
    @PostMapping
    public Result add(@RequestBody   CpAlbum cpAlbum){
        //调用CpAlbumService实现添加CpAlbum
        cpAlbumService.add(cpAlbum);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询CpAlbum数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<CpAlbum> findById(@PathVariable Long id){
        //调用CpAlbumService实现根据主键查询CpAlbum
        CpAlbum cpAlbum = cpAlbumService.findById(id);
        return new Result<CpAlbum>(true,StatusCode.OK,"查询成功",cpAlbum);
    }

    /***
     * 查询CpAlbum全部数据
     * @return
     */
    @GetMapping
    public Result<List<CpAlbum>> findAll(){
        //调用CpAlbumService实现查询所有CpAlbum
        List<CpAlbum> list = cpAlbumService.findAll();
        return new Result<List<CpAlbum>>(true, StatusCode.OK,"查询成功",list) ;
    }
}
