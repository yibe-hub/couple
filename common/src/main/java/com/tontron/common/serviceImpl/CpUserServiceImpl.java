package com.tontron.common.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tontron.common.mapper.CpUserMapper;
import com.tontron.common.pojo.CpUser;
import com.tontron.common.service.CpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpUser业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CpUserServiceImpl implements CpUserService {

    @Autowired
    private CpUserMapper cpUserMapper;


    /**
     * CpUser条件+分页查询
     * @param cpUser 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<CpUser> findPage(CpUser cpUser, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(cpUser);
        //执行搜索
        return new PageInfo<CpUser>(cpUserMapper.selectByExample(example));
    }

    /**
     * CpUser分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<CpUser> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<CpUser>(cpUserMapper.selectAll());
    }

    /**
     * CpUser条件查询
     * @param cpUser
     * @return
     */
    @Override
    public List<CpUser> findList(CpUser cpUser){
        //构建查询条件
        Example example = createExample(cpUser);
        //根据构建的条件查询数据
        return cpUserMapper.selectByExample(example);
    }


    /**
     * CpUser构建查询对象
     * @param cpUser
     * @return
     */
    public Example createExample(CpUser cpUser){
        Example example=new Example(CpUser.class);
        Example.Criteria criteria = example.createCriteria();
        if(cpUser!=null){
            // 主键，用户id
            if(!StringUtils.isEmpty(cpUser.getUserId())){
                    criteria.andEqualTo("userId",cpUser.getUserId());
            }
            // 用户名
            if(!StringUtils.isEmpty(cpUser.getUserName())){
                    criteria.andEqualTo("userName",cpUser.getUserName());
            }
            // 昵称
            if(!StringUtils.isEmpty(cpUser.getNickName())){
                    criteria.andEqualTo("nickName",cpUser.getNickName());
            }
            // 电话号码
            if(!StringUtils.isEmpty(cpUser.getPhoneNumber())){
                    criteria.andEqualTo("phoneNumber",cpUser.getPhoneNumber());
            }
            // 创建时间
            if(!StringUtils.isEmpty(cpUser.getCreateDate())){
                    criteria.andEqualTo("createDate",cpUser.getCreateDate());
            }
            // 更新日期
            if(!StringUtils.isEmpty(cpUser.getUpdateDate())){
                    criteria.andEqualTo("updateDate",cpUser.getUpdateDate());
            }
            // 关联的微信用户id
            if(!StringUtils.isEmpty(cpUser.getWxId())){
                    criteria.andEqualTo("wxId",cpUser.getWxId());
            }
            // 用户状态
            if(!StringUtils.isEmpty(cpUser.getStatusCd())){
                    criteria.andEqualTo("statusCd",cpUser.getStatusCd());
            }
            // 用户性别
            if(!StringUtils.isEmpty(cpUser.getUserGender())){
                    criteria.andEqualTo("userGender",cpUser.getUserGender());
            }
            // 用户生日
            if(!StringUtils.isEmpty(cpUser.getUserBirthday())){
                    criteria.andEqualTo("userBirthday",cpUser.getUserBirthday());
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
        cpUserMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改CpUser
     * @param cpUser
     */
    @Override
    public void update(CpUser cpUser){
        cpUserMapper.updateByPrimaryKey(cpUser);
    }

    /**
     * 增加CpUser
     * @param cpUser
     */
    @Override
    public void add(CpUser cpUser){
        cpUserMapper.insert(cpUser);
    }

    /**
     * 根据ID查询CpUser
     * @param id
     * @return
     */
    @Override
    public CpUser findById(Long id){
        return  cpUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询CpUser全部数据
     * @return
     */
    @Override
    public List<CpUser> findAll() {
        return cpUserMapper.selectAll();
    }
}
