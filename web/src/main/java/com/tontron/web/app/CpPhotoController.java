package com.tontron.web.app;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpPhoto;
import com.tontron.common.service.CpPhotoService;
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
@RequestMapping("/cpPhoto")
@CrossOrigin
public class CpPhotoController {

    @Autowired
    private CpPhotoService cpPhotoService;

    /***
     * CpPhoto分页条件搜索实现
     * @param cpPhoto
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false)  CpPhoto cpPhoto, @PathVariable  int page, @PathVariable  int size){
        //调用CpPhotoService实现分页条件查询CpPhoto
        PageInfo<CpPhoto> pageInfo = cpPhotoService.findPage(cpPhoto, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * CpPhoto分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用CpPhotoService实现分页查询CpPhoto
        PageInfo<CpPhoto> pageInfo = cpPhotoService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param cpPhoto
     * @return
     */
    @PostMapping(value = "/search" )
    public Result<List<CpPhoto>> findList(@RequestBody(required = false)  CpPhoto cpPhoto){
        //调用CpPhotoService实现条件查询CpPhoto
        List<CpPhoto> list = cpPhotoService.findList(cpPhoto);
        return new Result<List<CpPhoto>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用CpPhotoService实现根据主键删除
        cpPhotoService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改CpPhoto数据
     * @param cpPhoto
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody  CpPhoto cpPhoto,@PathVariable Long id){
        //设置主键值
        cpPhoto.setPhotoId(id);
        //调用CpPhotoService实现修改CpPhoto
        cpPhotoService.update(cpPhoto);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增CpPhoto数据
     * @param cpPhoto
     * @return
     */
    @PostMapping
    public Result add(@RequestBody   CpPhoto cpPhoto){
        //调用CpPhotoService实现添加CpPhoto
        cpPhotoService.add(cpPhoto);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询CpPhoto数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<CpPhoto> findById(@PathVariable Long id){
        //调用CpPhotoService实现根据主键查询CpPhoto
        CpPhoto cpPhoto = cpPhotoService.findById(id);
        return new Result<CpPhoto>(true,StatusCode.OK,"查询成功",cpPhoto);
    }

    /***
     * 查询CpPhoto全部数据
     * @return
     */
    @GetMapping
    public Result<List<CpPhoto>> findAll(){
        //调用CpPhotoService实现查询所有CpPhoto
        List<CpPhoto> list = cpPhotoService.findAll();
        return new Result<List<CpPhoto>>(true, StatusCode.OK,"查询成功",list) ;
    }
}
