package com.tontron.common.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tontron.common.mapper.CpAnniversariesMapper;
import com.tontron.common.pojo.CpAnniversaries;
import com.tontron.common.service.CpAnniversariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpAnniversaries业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CpAnniversariesServiceImpl implements CpAnniversariesService {

    @Autowired
    private CpAnniversariesMapper cpAnniversariesMapper;


    /**
     * CpAnniversaries条件+分页查询
     * @param cpAnniversaries 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<CpAnniversaries> findPage(CpAnniversaries cpAnniversaries, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(cpAnniversaries);
        //执行搜索
        return new PageInfo<CpAnniversaries>(cpAnniversariesMapper.selectByExample(example));
    }

    /**
     * CpAnniversaries分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<CpAnniversaries> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<CpAnniversaries>(cpAnniversariesMapper.selectAll());
    }

    /**
     * CpAnniversaries条件查询
     * @param cpAnniversaries
     * @return
     */
    @Override
    public List<CpAnniversaries> findList(CpAnniversaries cpAnniversaries){
        //构建查询条件
        Example example = createExample(cpAnniversaries);
        //根据构建的条件查询数据
        return cpAnniversariesMapper.selectByExample(example);
    }


    /**
     * CpAnniversaries构建查询对象
     * @param cpAnniversaries
     * @return
     */
    public Example createExample(CpAnniversaries cpAnniversaries){
        Example example=new Example(CpAnniversaries.class);
        Example.Criteria criteria = example.createCriteria();
        if(cpAnniversaries!=null){
            // 纪念日表，主键
            if(!StringUtils.isEmpty(cpAnniversaries.getAnnId())){
                    criteria.andEqualTo("annId",cpAnniversaries.getAnnId());
            }
            // 纪念日名
            if(!StringUtils.isEmpty(cpAnniversaries.getAnnName())){
                    criteria.andEqualTo("annName",cpAnniversaries.getAnnName());
            }
            // 创建时间
            if(!StringUtils.isEmpty(cpAnniversaries.getCreateDate())){
                    criteria.andEqualTo("createDate",cpAnniversaries.getCreateDate());
            }
            // 更新时间
            if(!StringUtils.isEmpty(cpAnniversaries.getUpdateDate())){
                    criteria.andEqualTo("updateDate",cpAnniversaries.getUpdateDate());
            }
            // 纪念日状态
            if(!StringUtils.isEmpty(cpAnniversaries.getStatusCd())){
                    criteria.andEqualTo("statusCd",cpAnniversaries.getStatusCd());
            }
            // 外键，关系表id
            if(!StringUtils.isEmpty(cpAnniversaries.getRelationId())){
                    criteria.andEqualTo("relationId",cpAnniversaries.getRelationId());
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
        cpAnniversariesMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改CpAnniversaries
     * @param cpAnniversaries
     */
    @Override
    public void update(CpAnniversaries cpAnniversaries){
        cpAnniversariesMapper.updateByPrimaryKey(cpAnniversaries);
    }

    /**
     * 增加CpAnniversaries
     * @param cpAnniversaries
     */
    @Override
    public void add(CpAnniversaries cpAnniversaries){
        cpAnniversariesMapper.insert(cpAnniversaries);
    }

    /**
     * 根据ID查询CpAnniversaries
     * @param id
     * @return
     */
    @Override
    public CpAnniversaries findById(Long id){
        return  cpAnniversariesMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询CpAnniversaries全部数据
     * @return
     */
    @Override
    public List<CpAnniversaries> findAll() {
        return cpAnniversariesMapper.selectAll();
    }
}
