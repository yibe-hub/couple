package com.tontron.common.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:shenkunlin
 * @Description:CpAnniversaries构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="cp_anniversaries")
public class CpAnniversaries implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ann_id")
	private Long annId;//纪念日表，主键

    @Column(name = "ann_name")
	private String annName;//纪念日名

    @Column(name = "create_date")
	private Date createDate;//创建时间

    @Column(name = "update_date")
	private Date updateDate;//更新时间

    @Column(name = "status_cd")
	private Integer statusCd;//纪念日状态

    @Column(name = "relation_id")
	private Long relationId;//外键，关系表id



	//get方法
	public Long getAnnId() {
		return annId;
	}

	//set方法
	public void setAnnId(Long annId) {
		this.annId = annId;
	}
	//get方法
	public String getAnnName() {
		return annName;
	}

	//set方法
	public void setAnnName(String annName) {
		this.annName = annName;
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


}
