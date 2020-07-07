package com.tontron.common.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tontron.common.mapper.CpRelationMapper;
import com.tontron.common.pojo.CpRelation;
import com.tontron.common.service.CpRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpRelation业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CpRelationServiceImpl implements CpRelationService {

    @Autowired
    private CpRelationMapper cpRelationMapper;


    /**
     * CpRelation条件+分页查询
     * @param cpRelation 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<CpRelation> findPage(CpRelation cpRelation, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(cpRelation);
        //执行搜索
        return new PageInfo<CpRelation>(cpRelationMapper.selectByExample(example));
    }

    /**
     * CpRelation分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<CpRelation> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<CpRelation>(cpRelationMapper.selectAll());
    }

    /**
     * CpRelation条件查询
     * @param cpRelation
     * @return
     */
    @Override
    public List<CpRelation> findList(CpRelation cpRelation){
        //构建查询条件
        Example example = createExample(cpRelation);
        //根据构建的条件查询数据
        return cpRelationMapper.selectByExample(example);
    }


    /**
     * CpRelation构建查询对象
     * @param cpRelation
     * @return
     */
    public Example createExample(CpRelation cpRelation){
        Example example=new Example(CpRelation.class);
        Example.Criteria criteria = example.createCriteria();
        if(cpRelation!=null){
            // 关系表，主键
            if(!StringUtils.isEmpty(cpRelation.getRelationId())){
                    criteria.andEqualTo("relationId",cpRelation.getRelationId());
            }
            // 关系名
            if(!StringUtils.isEmpty(cpRelation.getRelationName())){
                    criteria.andEqualTo("relationName",cpRelation.getRelationName());
            }
            // 创建时间
            if(!StringUtils.isEmpty(cpRelation.getCreateDate())){
                    criteria.andEqualTo("createDate",cpRelation.getCreateDate());
            }
            // 更新时间
            if(!StringUtils.isEmpty(cpRelation.getUpdateDate())){
                    criteria.andEqualTo("updateDate",cpRelation.getUpdateDate());
            }
            // 关系状态
            if(!StringUtils.isEmpty(cpRelation.getStatusCd())){
                    criteria.andEqualTo("statusCd",cpRelation.getStatusCd());
            }
            // 外键，关联的男用户
            if(!StringUtils.isEmpty(cpRelation.getMaleUserId())){
                    criteria.andEqualTo("maleUserId",cpRelation.getMaleUserId());
            }
            // 外键，关联的女用户
            if(!StringUtils.isEmpty(cpRelation.getFemaleUserId())){
                    criteria.andEqualTo("femaleUserId",cpRelation.getFemaleUserId());
            }
            // 关系天数
            if(!StringUtils.isEmpty(cpRelation.getRelationDays())){
                    criteria.andEqualTo("relationDays",cpRelation.getRelationDays());
            }
            // 创建人
            if(!StringUtils.isEmpty(cpRelation.getCreateUser())){
                    criteria.andEqualTo("createUser",cpRelation.getCreateUser());
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
        cpRelationMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改CpRelation
     * @param cpRelation
     */
    @Override
    public void update(CpRelation cpRelation){
        cpRelationMapper.updateByPrimaryKey(cpRelation);
    }

    /**
     * 增加CpRelation
     * @param cpRelation
     */
    @Override
    public void add(CpRelation cpRelation){
        cpRelationMapper.insert(cpRelation);
    }

    /**
     * 根据ID查询CpRelation
     * @param id
     * @return
     */
    @Override
    public CpRelation findById(Long id){
        return  cpRelationMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询CpRelation全部数据
     * @return
     */
    @Override
    public List<CpRelation> findAll() {
        return cpRelationMapper.selectAll();
    }
}
