package com.tontron.web.app;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpAnniversaries;
import com.tontron.common.pojo.Result;
import com.tontron.common.pojo.StatusCode;
import com.tontron.common.service.CpAnniversariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/cpAnniversaries")
@CrossOrigin
public class CpAnniversariesController {

    @Autowired
    private CpAnniversariesService cpAnniversariesService;

    /***
     * CpAnniversaries分页条件搜索实现
     * @param cpAnniversaries
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false)  CpAnniversaries cpAnniversaries, @PathVariable  int page, @PathVariable  int size){
        //调用CpAnniversariesService实现分页条件查询CpAnniversaries
        PageInfo<CpAnniversaries> pageInfo = cpAnniversariesService.findPage(cpAnniversaries, page, size);
        return new Result(true, StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * CpAnniversaries分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用CpAnniversariesService实现分页查询CpAnniversaries
        PageInfo<CpAnniversaries> pageInfo = cpAnniversariesService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param cpAnniversaries
     * @return
     */
    @PostMapping(value = "/search" )
    public Result<List<CpAnniversaries>> findList(@RequestBody(required = false)  CpAnniversaries cpAnniversaries){
        //调用CpAnniversariesService实现条件查询CpAnniversaries
        List<CpAnniversaries> list = cpAnniversariesService.findList(cpAnniversaries);
        return new Result<List<CpAnniversaries>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用CpAnniversariesService实现根据主键删除
        cpAnniversariesService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改CpAnniversaries数据
     * @param cpAnniversaries
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody  CpAnniversaries cpAnniversaries,@PathVariable Long id){
        //设置主键值
        cpAnniversaries.setAnnId(id);
        //调用CpAnniversariesService实现修改CpAnniversaries
        cpAnniversariesService.update(cpAnniversaries);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增CpAnniversaries数据
     * @param cpAnniversaries
     * @return
     */
    @PostMapping
    public Result add(@RequestBody   CpAnniversaries cpAnniversaries){
        //调用CpAnniversariesService实现添加CpAnniversaries
        cpAnniversariesService.add(cpAnniversaries);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询CpAnniversaries数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<CpAnniversaries> findById(@PathVariable Long id){
        //调用CpAnniversariesService实现根据主键查询CpAnniversaries
        CpAnniversaries cpAnniversaries = cpAnniversariesService.findById(id);
        return new Result<CpAnniversaries>(true,StatusCode.OK,"查询成功",cpAnniversaries);
    }

    /***
     * 查询CpAnniversaries全部数据
     * @return
     */
    @GetMapping
    public Result<List<CpAnniversaries>> findAll(){
        //调用CpAnniversariesService实现查询所有CpAnniversaries
        List<CpAnniversaries> list = cpAnniversariesService.findAll();
        return new Result<List<CpAnniversaries>>(true, StatusCode.OK,"查询成功",list) ;
    }
}
