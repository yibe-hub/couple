package com.tontron.common.entity;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:shenkunlin
 * @Description:CpMessage构建
 * @Date 2019/6/14 19:13
 *****/
@Table(name="cp_message")
public class CpMessage implements Serializable{

	@Id
    @Column(name = "message_id")
	private Long messageId;//留言表，主键

    @Column(name = "create_user")
	private Long createUser;//创建人

    @Column(name = "message_detail")
	private String messageDetail;//留言内容

    @Column(name = "status_cd")
	private Integer statusCd;//留言状态

    @Column(name = "relation_id")
	private Long relationId;//外键，关系表id



	//get方法
	public Long getMessageId() {
		return messageId;
	}

	//set方法
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
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
	public String getMessageDetail() {
		return messageDetail;
	}

	//set方法
	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
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
