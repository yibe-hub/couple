package com.tontron.common.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tontron.common.mapper.CpPhotoMapper;
import com.tontron.common.entity.CpPhoto;
import com.tontron.common.service.CpPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpPhoto业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CpPhotoServiceImpl implements CpPhotoService {

    @Autowired
    private CpPhotoMapper cpPhotoMapper;


    /**
     * CpPhoto条件+分页查询
     * @param cpPhoto 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<CpPhoto> findPage(CpPhoto cpPhoto, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(cpPhoto);
        //执行搜索
        return new PageInfo<CpPhoto>(cpPhotoMapper.selectByExample(example));
    }

    /**
     * CpPhoto分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<CpPhoto> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<CpPhoto>(cpPhotoMapper.selectAll());
    }

    /**
     * CpPhoto条件查询
     * @param cpPhoto
     * @return
     */
    @Override
    public List<CpPhoto> findList(CpPhoto cpPhoto){
        //构建查询条件
        Example example = createExample(cpPhoto);
        //根据构建的条件查询数据
        return cpPhotoMapper.selectByExample(example);
    }


    /**
     * CpPhoto构建查询对象
     * @param cpPhoto
     * @return
     */
    public Example createExample(CpPhoto cpPhoto){
        Example example=new Example(CpPhoto.class);
        Example.Criteria criteria = example.createCriteria();
        if(cpPhoto!=null){
            // 照片表，主键
            if(!StringUtils.isEmpty(cpPhoto.getPhotoId())){
                    criteria.andEqualTo("photoId",cpPhoto.getPhotoId());
            }
            // 照片名
            if(!StringUtils.isEmpty(cpPhoto.getPhotoName())){
                    criteria.andEqualTo("photoName",cpPhoto.getPhotoName());
            }
            // 外键，关系表id
            if(!StringUtils.isEmpty(cpPhoto.getRelationId())){
                    criteria.andEqualTo("relationId",cpPhoto.getRelationId());
            }
            // 外键，纪念日id
            if(!StringUtils.isEmpty(cpPhoto.getAnnId())){
                    criteria.andEqualTo("annId",cpPhoto.getAnnId());
            }
            // 创建时间
            if(!StringUtils.isEmpty(cpPhoto.getCreateDate())){
                    criteria.andEqualTo("createDate",cpPhoto.getCreateDate());
            }
            // 更新时间
            if(!StringUtils.isEmpty(cpPhoto.getUpdateDate())){
                    criteria.andEqualTo("updateDate",cpPhoto.getUpdateDate());
            }
            // 照片描述
            if(!StringUtils.isEmpty(cpPhoto.getPhotoDescribe())){
                    criteria.andEqualTo("photoDescribe",cpPhoto.getPhotoDescribe());
            }
            // 外键，关联相册id
            if(!StringUtils.isEmpty(cpPhoto.getAlbumId())){
                    criteria.andEqualTo("albumId",cpPhoto.getAlbumId());
            }
            // 照片创建人
            if(!StringUtils.isEmpty(cpPhoto.getCreateUser())){
                    criteria.andEqualTo("createUser",cpPhoto.getCreateUser());
            }
            // 照片状态
            if(!StringUtils.isEmpty(cpPhoto.getStatusCd())){
                    criteria.andEqualTo("statusCd",cpPhoto.getStatusCd());
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
        cpPhotoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改CpPhoto
     * @param cpPhoto
     */
    @Override
    public void update(CpPhoto cpPhoto){
        cpPhotoMapper.updateByPrimaryKey(cpPhoto);
    }

    /**
     * 增加CpPhoto
     * @param cpPhoto
     */
    @Override
    public void add(CpPhoto cpPhoto){
        cpPhotoMapper.insert(cpPhoto);
    }

    /**
     * 根据ID查询CpPhoto
     * @param id
     * @return
     */
    @Override
    public CpPhoto findById(Long id){
        return  cpPhotoMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询CpPhoto全部数据
     * @return
     */
    @Override
    public List<CpPhoto> findAll() {
        return cpPhotoMapper.selectAll();
    }
}
