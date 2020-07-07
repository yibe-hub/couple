package com.tontron.common.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tontron.common.mapper.CpMessageMapper;
import com.tontron.common.pojo.CpMessage;
import com.tontron.common.service.CpMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpMessage业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CpMessageServiceImpl implements CpMessageService {

    @Autowired
    private CpMessageMapper cpMessageMapper;


    /**
     * CpMessage条件+分页查询
     * @param cpMessage 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<CpMessage> findPage(CpMessage cpMessage, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(cpMessage);
        //执行搜索
        return new PageInfo<CpMessage>(cpMessageMapper.selectByExample(example));
    }

    /**
     * CpMessage分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<CpMessage> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<CpMessage>(cpMessageMapper.selectAll());
    }

    /**
     * CpMessage条件查询
     * @param cpMessage
     * @return
     */
    @Override
    public List<CpMessage> findList(CpMessage cpMessage){
        //构建查询条件
        Example example = createExample(cpMessage);
        //根据构建的条件查询数据
        return cpMessageMapper.selectByExample(example);
    }


    /**
     * CpMessage构建查询对象
     * @param cpMessage
     * @return
     */
    public Example createExample(CpMessage cpMessage){
        Example example=new Example(CpMessage.class);
        Example.Criteria criteria = example.createCriteria();
        if(cpMessage!=null){
            // 留言表，主键
            if(!StringUtils.isEmpty(cpMessage.getMessageId())){
                    criteria.andEqualTo("messageId",cpMessage.getMessageId());
            }
            // 创建人
            if(!StringUtils.isEmpty(cpMessage.getCreateUser())){
                    criteria.andEqualTo("createUser",cpMessage.getCreateUser());
            }
            // 留言内容
            if(!StringUtils.isEmpty(cpMessage.getMessageDetail())){
                    criteria.andEqualTo("messageDetail",cpMessage.getMessageDetail());
            }
            // 留言状态
            if(!StringUtils.isEmpty(cpMessage.getStatusCd())){
                    criteria.andEqualTo("statusCd",cpMessage.getStatusCd());
            }
            // 外键，关系表id
            if(!StringUtils.isEmpty(cpMessage.getRelationId())){
                    criteria.andEqualTo("relationId",cpMessage.getRelationId());
            }
        }
        return example;
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Long id){
        cpMessageMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改CpMessage
     * @param cpMessage
     */
    @Override
    public void update(CpMessage cpMessage){
        cpMessageMapper.updateByPrimaryKey(cpMessage);
    }

    /**
     * 增加CpMessage
     * @param cpMessage
     */
    @Override
    public void add(CpMessage cpMessage){
        cpMessageMapper.insert(cpMessage);
    }

    /**
     * 根据ID查询CpMessage
     * @param id
     * @return
     */
    @Override
    public CpMessage findById(Long id){
        return  cpMessageMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询CpMessage全部数据
     * @return
     */
    @Override
    public List<CpMessage> findAll() {
        return cpMessageMapper.selectAll();
    }
}
