package com.tontron.common.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tontron.common.mapper.CpAlbumMapper;
import com.tontron.common.entity.CpAlbum;
import com.tontron.common.service.CpAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Description:CpAlbum业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class CpAlbumServiceImpl implements CpAlbumService {

    @Autowired
    private CpAlbumMapper cpAlbumMapper;


    /**
     * CpAlbum条件+分页查询
     * @param cpAlbum 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<CpAlbum> findPage(CpAlbum cpAlbum, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(cpAlbum);
        //执行搜索
        return new PageInfo<CpAlbum>(cpAlbumMapper.selectByExample(example));
    }

    /**
     * CpAlbum分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<CpAlbum> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<CpAlbum>(cpAlbumMapper.selectAll());
    }

    /**
     * CpAlbum条件查询
     * @param cpAlbum
     * @return
     */
    @Override
    public List<CpAlbum> findList(CpAlbum cpAlbum){
        //构建查询条件
        Example example = createExample(cpAlbum);
        //根据构建的条件查询数据
        return cpAlbumMapper.selectByExample(example);
    }


    /**
     * CpAlbum构建查询对象
     * @param cpAlbum
     * @return
     */
    public Example createExample(CpAlbum cpAlbum){
        Example example=new Example(CpAlbum.class);
        Example.Criteria criteria = example.createCriteria();
        if(cpAlbum!=null){
            // 相册，主键
            if(!StringUtils.isEmpty(cpAlbum.getAlbumId())){
                    criteria.andEqualTo("albumId",cpAlbum.getAlbumId());
            }
            // 相册名
            if(!StringUtils.isEmpty(cpAlbum.getAlbumName())){
                    criteria.andEqualTo("albumName",cpAlbum.getAlbumName());
            }
            // 创建时间
            if(!StringUtils.isEmpty(cpAlbum.getCreateDate())){
                    criteria.andEqualTo("createDate",cpAlbum.getCreateDate());
            }
            // 更新时间
            if(!StringUtils.isEmpty(cpAlbum.getUpdateDate())){
                    criteria.andEqualTo("updateDate",cpAlbum.getUpdateDate());
            }
            // 相册描述
            if(!StringUtils.isEmpty(cpAlbum.getAlbumDescribe())){
                    criteria.andEqualTo("albumDescribe",cpAlbum.getAlbumDescribe());
            }
            // 相册创建人
            if(!StringUtils.isEmpty(cpAlbum.getCreateUser())){
                    criteria.andEqualTo("createUser",cpAlbum.getCreateUser());
            }
            // 相册状态
            if(!StringUtils.isEmpty(cpAlbum.getStatusCd())){
                    criteria.andEqualTo("statusCd",cpAlbum.getStatusCd());
            }
            // 外键，关系表id
            if(!StringUtils.isEmpty(cpAlbum.getRelationId())){
                    criteria.andEqualTo("relationId",cpAlbum.getRelationId());
            }
            // 外键，纪念日id
            if(!StringUtils.isEmpty(cpAlbum.getAnnId())){
                    criteria.andEqualTo("annId",cpAlbum.getAnnId());
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
        cpAlbumMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改CpAlbum
     * @param cpAlbum
     */
    @Override
    public void update(CpAlbum cpAlbum){
        cpAlbumMapper.updateByPrimaryKey(cpAlbum);
    }

    /**
     * 增加CpAlbum
     * @param cpAlbum
     */
    @Override
    public void add(CpAlbum cpAlbum){
        cpAlbumMapper.insert(cpAlbum);
    }

    /**
     * 根据ID查询CpAlbum
     * @param id
     * @return
     */
    @Override
    public CpAlbum findById(Long id){
        return  cpAlbumMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询CpAlbum全部数据
     * @return
     */
    @Override
    public List<CpAlbum> findAll() {
        return cpAlbumMapper.selectAll();
    }
}
