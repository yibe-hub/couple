package com.tontron.web.app;

import com.github.pagehelper.PageInfo;
import com.tontron.common.entity.CpRelation;
import com.tontron.common.service.CpRelationService;
import com.tontron.common.entity.Result;
import com.tontron.common.entity.StatusCode;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:
 * @Date 2019/6/14 0:18
 *****/

@RestController
@RequestMapping("/cpRelation")
@CrossOrigin
public class CpRelationController {

    @Resource
    private CpRelationService cpRelationService;

    /***
     * CpRelation分页条件搜索实现
     * @param cpRelation
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false)  CpRelation cpRelation, @PathVariable  int page, @PathVariable  int size){
        //调用CpRelationService实现分页条件查询CpRelation
        PageInfo<CpRelation> pageInfo = cpRelationService.findPage(cpRelation, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * CpRelation分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用CpRelationService实现分页查询CpRelation
        PageInfo<CpRelation> pageInfo = cpRelationService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param cpRelation
     * @return
     */
    @PostMapping(value = "/search" )
    public Result<List<CpRelation>> findList(@RequestBody(required = false)  CpRelation cpRelation){
        //调用CpRelationService实现条件查询CpRelation
        List<CpRelation> list = cpRelationService.findList(cpRelation);
        return new Result<List<CpRelation>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用CpRelationService实现根据主键删除
        cpRelationService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改CpRelation数据
     * @param cpRelation
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody  CpRelation cpRelation,@PathVariable Long id){
        //设置主键值
        cpRelation.setRelationId(id);
        //调用CpRelationService实现修改CpRelation
        cpRelationService.update(cpRelation);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增CpRelation数据
     * @param cpRelation
     * @return
     */
    @PostMapping
    public Result add(@RequestBody   CpRelation cpRelation){
        //调用CpRelationService实现添加CpRelation
        cpRelationService.add(cpRelation);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询CpRelation数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<CpRelation> findById(@PathVariable Long id){
        //调用CpRelationService实现根据主键查询CpRelation
        CpRelation cpRelation = cpRelationService.findById(id);
        return new Result<CpRelation>(true,StatusCode.OK,"查询成功",cpRelation);
    }

    /***
     * 查询CpRelation全部数据
     * @return
     */
    @GetMapping
    public Result<List<CpRelation>> findAll(){
        //调用CpRelationService实现查询所有CpRelation
        List<CpRelation> list = cpRelationService.findAll();
        return new Result<List<CpRelation>>(true, StatusCode.OK,"查询成功",list) ;
    }

    //创建新关系
    @PostMapping("/createNewRelation")
    public Result createNewRelation(@PathVariable String wxId){
        Boolean isSuccess = cpRelationService.createNewRelation(wxId);
        if(isSuccess){
            return new Result(true,StatusCode.OK,"添加成功");
        }
        return new Result(false,StatusCode.ERROR,"添加失败");
    }

    //确认关系
    @PostMapping("/confirmRelation")
    public Result confirmRelation(@PathVariable String wxId,@PathVariable Long relId){
        Boolean isSuccess = cpRelationService.confirmRelation(wxId,relId);
        if(isSuccess){
            return new Result(true,StatusCode.OK,"添加成功");
        }
        return new Result(false,StatusCode.ERROR,"添加失败");
    }
}
