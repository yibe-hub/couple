package com.tontron.web.app;

import com.github.pagehelper.PageInfo;
import com.tontron.common.pojo.CpMessage;
import com.tontron.common.service.CpMessageService;
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
@RequestMapping("/cpMessage")
@CrossOrigin
public class CpMessageController {

    @Autowired
    private CpMessageService cpMessageService;

    /***
     * CpMessage分页条件搜索实现
     * @param cpMessage
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false)  CpMessage cpMessage, @PathVariable  int page, @PathVariable  int size){
        //调用CpMessageService实现分页条件查询CpMessage
        PageInfo<CpMessage> pageInfo = cpMessageService.findPage(cpMessage, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * CpMessage分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用CpMessageService实现分页查询CpMessage
        PageInfo<CpMessage> pageInfo = cpMessageService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param cpMessage
     * @return
     */
    @PostMapping(value = "/search" )
    public Result<List<CpMessage>> findList(@RequestBody(required = false)  CpMessage cpMessage){
        //调用CpMessageService实现条件查询CpMessage
        List<CpMessage> list = cpMessageService.findList(cpMessage);
        return new Result<List<CpMessage>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用CpMessageService实现根据主键删除
        cpMessageService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改CpMessage数据
     * @param cpMessage
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody  CpMessage cpMessage,@PathVariable Long id){
        //设置主键值
        cpMessage.setMessageId(id);
        //调用CpMessageService实现修改CpMessage
        cpMessageService.update(cpMessage);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增CpMessage数据
     * @param cpMessage
     * @return
     */
    @PostMapping
    public Result add(@RequestBody   CpMessage cpMessage){
        //调用CpMessageService实现添加CpMessage
        cpMessageService.add(cpMessage);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询CpMessage数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<CpMessage> findById(@PathVariable Long id){
        //调用CpMessageService实现根据主键查询CpMessage
        CpMessage cpMessage = cpMessageService.findById(id);
        return new Result<CpMessage>(true,StatusCode.OK,"查询成功",cpMessage);
    }

    /***
     * 查询CpMessage全部数据
     * @return
     */
    @GetMapping
    public Result<List<CpMessage>> findAll(){
        //调用CpMessageService实现查询所有CpMessage
        List<CpMessage> list = cpMessageService.findAll();
        return new Result<List<CpMessage>>(true, StatusCode.OK,"查询成功",list) ;
    }
}
