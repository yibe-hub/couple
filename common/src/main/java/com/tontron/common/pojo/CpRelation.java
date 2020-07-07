package com.tontron.common.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:shenkunlin
 * @Description:CpRelation构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="cp_relation")
public class CpRelation implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "relation_id")
	private Long relationId;//关系表，主键

    @Column(name = "relation_name")
	private String relationName;//关系名

    @Column(name = "create_date")
	private Date createDate;//创建时间

    @Column(name = "update_date")
	private Date updateDate;//更新时间

    @Column(name = "status_cd")
	private Integer statusCd;//关系状态，0=新建，1=完成，3=取消，4=作废

    @Column(name = "male_user_id")
	private Long maleUserId;//外键，关联的男用户

    @Column(name = "female_user_id")
	private Long femaleUserId;//外键，关联的女用户

    @Column(name = "relation_days")
	private Long relationDays;//关系天数

    @Column(name = "create_user")
	private Long createUser;//创建人



	//get方法
	public Long getRelationId() {
		return relationId;
	}

	//set方法
	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}
	//get方法
	public String getRelationName() {
		return relationName;
	}

	//set方法
	public void setRelationName(String relationName) {
		this.relationName = relationName;
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
	public Long getMaleUserId() {
		return maleUserId;
	}

	//set方法
	public void setMaleUserId(Long maleUserId) {
		this.maleUserId = maleUserId;
	}
	//get方法
	public Long getFemaleUserId() {
		return femaleUserId;
	}

	//set方法
	public void setFemaleUserId(Long femaleUserId) {
		this.femaleUserId = femaleUserId;
	}
	//get方法
	public Long getRelationDays() {
		return relationDays;
	}

	//set方法
	public void setRelationDays(Long relationDays) {
		this.relationDays = relationDays;
	}
	//get方法
	public Long getCreateUser() {
		return createUser;
	}

	//set方法
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}


}
