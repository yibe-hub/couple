package com.tontron.web.app;

import com.github.pagehelper.PageInfo;
import com.tontron.common.entity.CpUser;
import com.tontron.common.service.CpUserService;
import com.tontron.common.entity.Result;
import com.tontron.common.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/cpUser")
@CrossOrigin
public class CpUserController {

    @Autowired
    private CpUserService cpUserService;

    /***
     * CpUser分页条件搜索实现
     * @param cpUser
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false)  CpUser cpUser, @PathVariable  int page, @PathVariable  int size){
        //调用CpUserService实现分页条件查询CpUser
        PageInfo<CpUser> pageInfo = cpUserService.findPage(cpUser, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * CpUser分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用CpUserService实现分页查询CpUser
        PageInfo<CpUser> pageInfo = cpUserService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param cpUser
     * @return
     */
    @PostMapping(value = "/search" )
    public Result<List<CpUser>> findList(@RequestBody(required = false)  CpUser cpUser){
        //调用CpUserService实现条件查询CpUser
        List<CpUser> list = cpUserService.findList(cpUser);
        return new Result<List<CpUser>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用CpUserService实现根据主键删除
        cpUserService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改CpUser数据
     * @param cpUser
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody  CpUser cpUser,@PathVariable Long id){
        //设置主键值
        cpUser.setUserId(id);
        //调用CpUserService实现修改CpUser
        cpUserService.update(cpUser);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增CpUser数据
     * @param cpUser
     * @return
     */
    @PostMapping
    public Result add(@RequestBody   CpUser cpUser){
        //调用CpUserService实现添加CpUser
        cpUserService.add(cpUser);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询CpUser数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<CpUser> findById(@PathVariable Long id){
        //调用CpUserService实现根据主键查询CpUser
        CpUser cpUser = cpUserService.findById(id);
        return new Result<CpUser>(true,StatusCode.OK,"查询成功",cpUser);
    }

    /***
     * 查询CpUser全部数据
     * @return
     */
    @GetMapping
    public Result<List<CpUser>> findAll(){
        //调用CpUserService实现查询所有CpUser
        List<CpUser> list = cpUserService.findAll();
        return new Result<List<CpUser>>(true, StatusCode.OK,"查询成功",list) ;
    }
}
