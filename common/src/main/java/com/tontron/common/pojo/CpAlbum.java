package com.tontron.common.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:shenkunlin
 * @Description:CpAlbum构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="cp_album")
public class CpAlbum implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
	private Long albumId;//相册，主键

    @Column(name = "album_name")
	private String albumName;//相册名

    @Column(name = "create_date")
	private Date createDate;//创建时间

    @Column(name = "update_date")
	private Date updateDate;//更新时间

    @Column(name = "album_describe")
	private String albumDescribe;//相册描述

    @Column(name = "create_user")
	private Long createUser;//相册创建人

    @Column(name = "status_cd")
	private Integer statusCd;//相册状态

    @Column(name = "relation_id")
	private Long relationId;//外键，关系表id

    @Column(name = "ann_id")
	private Long annId;//外键，纪念日id



	//get方法
	public Long getAlbumId() {
		return albumId;
	}

	//set方法
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}
	//get方法
	public String getAlbumName() {
		return albumName;
	}

	//set方法
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	//get方法
	public Date getCreateDate() {
		return createDate;
	}

	//set方法
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	//get方法
	public Date getUpdateDate() {
		return updateDate;
	}

	//set方法
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	//get方法
	public String getAlbumDescribe() {
		return albumDescribe;
	}

	//set方法
	public void setAlbumDescribe(String albumDescribe) {
		this.albumDescribe = albumDescribe;
	}
	//get方法
	public Long getCreateUser() {
		return createUser;
	}

	//set方法
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}
	//get方法
	public Integer getStatusCd() {
		return statusCd;
	}

	//set方法
	public void setStatusCd(Integer statusCd) {
		this.statusCd = statusCd;
	}
	//get方法
	public Long getRelationId() {
		return relationId;
	}

	//set方法
	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}
	//get方法
	public Long getAnnId() {
		return annId;
	}

	//set方法
	public void setAnnId(Long annId) {
		this.annId = annId;
	}


}
