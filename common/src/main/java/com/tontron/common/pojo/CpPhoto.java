package com.tontron.common.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:shenkunlin
 * @Description:CpPhoto构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="cp_photo")
public class CpPhoto implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
	private Long photoId;//照片表，主键

    @Column(name = "photo_name")
	private String photoName;//照片名

    @Column(name = "relation_id")
	private Long relationId;//外键，关系表id

    @Column(name = "ann_id")
	private Long annId;//外键，纪念日id

    @Column(name = "create_date")
	private Date createDate;//创建时间

    @Column(name = "update_date")
	private Date updateDate;//更新时间

    @Column(name = "photo_describe")
	private String photoDescribe;//照片描述

    @Column(name = "album_id")
	private Long albumId;//外键，关联相册id

    @Column(name = "create_user")
	private Long createUser;//照片创建人

    @Column(name = "status_cd")
	private Integer statusCd;//照片状态



	//get方法
	public Long getPhotoId() {
		return photoId;
	}

	//set方法
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}
	//get方法
	public String getPhotoName() {
		return photoName;
	}

	//set方法
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
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
	public String getPhotoDescribe() {
		return photoDescribe;
	}

	//set方法
	public void setPhotoDescribe(String photoDescribe) {
		this.photoDescribe = photoDescribe;
	}
	//get方法
	public Long getAlbumId() {
		return albumId;
	}

	//set方法
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
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


}
